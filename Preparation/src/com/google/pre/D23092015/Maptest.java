package com.google.pre.D23092015;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maptest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		map1.put("mittan0", 100);
		map1.put("mittan1", 120);
		map1.put("mittan2", 120);
		map1.put("mittan3", 120);
		map1.put("mittan4", 120);
		map1.put("mittan5", 120);
		map1.put("mittan6", 120);
		
		map1.containsKey("mittan");
		
		Set set1 = map1.keySet();
		Collection<Integer> set2 = map1.values();
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(map1.containsKey("Mittan"));
		
		Set s = map1.entrySet();
		Iterator itr = s.iterator();
		
		while(itr.hasNext()){
			
			Map.Entry<String, Integer> paire = (Entry<String, Integer>) itr.next();
			System.out.println(paire.getKey());
			System.out.println(paire.getValue());
			
		}

	}

}
