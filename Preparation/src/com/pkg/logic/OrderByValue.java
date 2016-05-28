package com.pkg.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OrderByValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("madan", 12);
		map.put("Alex", 10);
		map.put("sadam", 120);
		map.put("baitur", 45);
		map.put("dwert", 78);
		map.put("bired", 23);
		map.put("kalu", 20);
		
		Set<Entry<String,Integer>> set = map.entrySet();
		List<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(set);
		Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o2.getValue().compareTo(o1.getValue());
			}
			
		});
		for(Map.Entry<String,Integer> listOne : list){
			
			System.out.println(listOne.getKey() + " --------- " + listOne.getValue());
		}

	}

}


//class myComparator implements Comparator<Map.Entry<String,Integer>>{
//
//	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//		
//		return o1.getValue().compareTo(o2.getValue());
//	}
//	
//	
//	
//}
