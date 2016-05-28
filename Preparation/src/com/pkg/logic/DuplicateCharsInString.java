package com.pkg.logic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {

	/**
	 * @param args
	 */
//	bsab
	public void countCharInString(String stringValue){
		
		char[] charArray = stringValue.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char singleChar : charArray){
			if(map.containsKey(singleChar)){
				
				map.put(singleChar, map.get(singleChar) + 1);
			}else{
				
				map.put(singleChar, 1);
			}
			
		}// for
		
		Set<Character> set = map.keySet();
		for(Character  ch : set){
			
			if(map.get(ch) > 1){
				System.out.println(ch + "----" + map.get(ch));
			}
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DuplicateCharsInString().countCharInString("abcasb");
		
	}

}
