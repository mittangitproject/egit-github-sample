package com.source.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class MyComparator implements Comparator{

	
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Map.Entry<Integer,String> obj1 = (Entry<Integer, String>) o1;
		Map.Entry<Integer,String> obj2 = (Entry<Integer, String>) o2;
		
		return obj1.getValue().compareTo(obj2.getValue());
	}
	
	
}


public class MapSortByValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(100, "Amit");
		map.put(10, "sampad");
		map.put(34, "sagar");
		map.put(29, "kabya");
		map.put(89, "sunny");
		map.put(37, "mita");
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		List<Map.Entry<Integer,String>> list = new ArrayList<Map.Entry<Integer,String>>(set);
		Collections.sort(list, new MyComparator());
		
		System.out.println("After Sorting : ");
		for(Map.Entry<Integer,String> singleList : list){
			System.out.print(singleList.getValue() + " , ");
		}

	}

}
