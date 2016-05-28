package com.google.pre.guava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.Ordering;

public class GuavaTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> valueList = new ArrayList<Integer>();
		
		valueList.add(new Integer(10));
		valueList.add(new Integer(12));
		valueList.add(new Integer(3));
		valueList.add(new Integer(1));
		valueList.add(new Integer(11));
		valueList.add(new Integer(14));
		valueList.add(new Integer(15));
		valueList.add(new Integer(19));
		valueList.add(new Integer(13));
		valueList.add(new Integer(23));
		valueList.add(new Integer(45));
		valueList.add(new Integer(17));
		valueList.add(new Integer(20));
//		valueList.add(null);
		
		System.out.println(valueList);
		
		Ordering ord = Ordering.natural();
		
		Collections.sort(valueList , ord.nullsFirst());
		
		System.out.println(valueList);
		
		System.out.println("Maximum Value :" + ord.max(valueList));
		
		
//		Collections.sort(valueList ,ord.reverse());
		Collections.reverse(valueList);
		
		System.out.println(valueList);
		
		
		
	}

}
