package com.google.pre.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Key {
	
	int index;
	String code;
	
	public Key(int index, String code) {
		super();
		this.index = index;
		this.code = code;
	}

	@Override
	public int hashCode() {
		
		return 5;
	}

	@Override
	public boolean equals(Object obj) {
	
		return true;
	}
	
}

public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Key,String> countrymap = new HashMap<Key, String>();
		
		countrymap.put(new Key(1,"IN"), "INDIA");
		countrymap.put(new Key(2,"SA"), "SOUTH AFRICA");
		countrymap.put(new Key(3,"AUS"), "AUSTRILIA");
		countrymap.put(new Key(4,"SLA"), "SRILANKA");
		
		System.out.println(countrymap.size());
		
		Iterator itr = countrymap.keySet().iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(countrymap.get(itr.next()));
			
		}// while
		

	}

}
