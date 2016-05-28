package com.pkg.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(20);
		list.add(10);
		
		for(Integer value : list) {
			
			if(!list2.contains(value)){
				list2.add(value);
			}
			
		}
		
		System.out.println(list2);
		
		
//		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//		Iterator itr = list.iterator();
//		while(itr.hasNext()){
//			
////			System.out.println(itr.next() + "  ");
//			
//			if(map.containsKey(itr.next())){
//				
//				map.put((Integer) itr.next(), map.get(itr.next()) + 1);
//				
//			}else {
//				
//				map.put((Integer) itr.next(), 1);
//			}
//		}
//		
//		Set<Entry<Integer, Integer>> set = map.entrySet();
//		
//		Iterator itr2 = set.iterator();
//		
//		while(itr2.hasNext()){
//			
//			System.out.println(((Entry<Integer, Integer>) itr2.next()).getKey() + ((Entry<Integer, Integer>) itr2.next()).getValue());
//		}
//       
	}

}
