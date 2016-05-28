package com.google.pre.D23092015;

import java.io.*;

import org.xml.sax.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.sax.*;

public class Operation {

	BufferedReader in;
    StreamResult out;
    TransformerHandler th;
    
	public static void main(String[] args) {
		
	    new Operation().begin();

	}
	
	
	public void begin(){
		
		try{

			in = new BufferedReader(new FileReader("G:\\word.txt"));
			out = new StreamResult("G:\\data.xml");
			openXml();
			String str;
            while ((str = in.readLine()) != null) {
                process(str);
            }
            
			
		}catch(Exception exception) {
			
			exception.printStackTrace();
		}
		
	}//begin
	
	public void openXml() throws ParserConfigurationException, TransformerConfigurationException, SAXException {

        SAXTransformerFactory tf = (SAXTransformerFactory) SAXTransformerFactory.newInstance();
        th = tf.newTransformerHandler();

        // pretty XML output
        Transformer serializer = th.getTransformer();
        serializer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        serializer.setOutputProperty(OutputKeys.INDENT, "yes");

        th.setResult(out);
        th.startDocument();
        th.startElement(null, null, "inserts", null);
    }
	
	 public void process(String s) throws SAXException {
	        th.startElement(null, null, "option", null);
	        th.characters(s.toCharArray(), 0, s.length());
	        th.endElement(null, null, "option");
	    }

	    public void closeXml() throws SAXException {
	        th.endElement(null, null, "inserts");
	        th.endDocument();
	    }

}
