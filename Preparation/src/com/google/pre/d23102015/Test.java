package com.google.pre.d23102015;

import java.util.HashMap;
import java.util.Map;


class Producer {
	
	
}

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
     		
//		Map<String,Producer> data = new HashMap<String, Producer>();
		
		Map<Producer,String> data = new HashMap<Producer,String>();
		
//		data.put("key1", new Producer());
//		data.put("key2", new Producer());
//		data.put("key3", new Producer());
//		data.put("key4", new Producer());
		Producer p1 = new Producer();
		Producer p2 = new Producer();
		
		data.put(p1 ,"key1");
		data.put(p2 ,"key2");
		
		System.out.println("data : " + data.get(p1) + " " + data.get(p2));
		

	}

}
