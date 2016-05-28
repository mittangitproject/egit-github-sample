package com.pkg.logic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsFromStringRemoved {

	/**
	 * @param args
	 */
	public void duplicateCharRemoved(String stringValue){
		
      char[] charArray = stringValue.toCharArray();
      Map<Character, Integer> map = new HashMap<Character, Integer>();
      StringBuffer buffer = new StringBuffer();
      for(char singleChar: charArray){
    	  
    	 if(!map.containsKey(singleChar)){
    		 
    		 map.put(singleChar,1);
    		 buffer.append(singleChar);
    	 }
      }
      
      System.out.println("Buffer : " + buffer);
      
//      Set<Character> set = map.keySet();
      String value = buffer.toString();
      System.out.println("final Value : " + value);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DuplicateCharsFromStringRemoved().duplicateCharRemoved("kkkkkkkkkkk"); // mitan

	}

}
