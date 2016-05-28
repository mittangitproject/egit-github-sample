package com.google.pre.D23092015;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {

	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
		 fis = new FileInputStream("G:\\input.txt");
		 fos = new FileOutputStream("G:\\output.txt");
		 
		 int c = 0;
		 while((c = fis.read()) != -1){
			 
			 fos.write(c);
		 }
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			
			e.printStackTrace();
			
		}finally{
			try{
			if(fis != null) {
				
				fis.close();
				
			}//if
			}catch(IOException e) {
				
				e.printStackTrace();
			}
			
			try{
				
				if(fos != null){
					
					fos.close();
				}//if
				
				}catch(IOException e){
					
					e.printStackTrace();
				}
			
		}

	}

}
