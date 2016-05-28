package com.google.pre.guava;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import com.google.common.collect.ImmutableSet;

public class GuavaTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ImmutableSet<Integer> value = ImmutableSet.of(0,1,2,3,4,5,6,7,8,9);
//		value.add(23);
		
		Set setvalue = new TreeSet();
		setvalue.add(10);
		setvalue.add(20);
		setvalue.add(30);
		setvalue.add(40);
		
		Set setvalue2 = new TreeSet();
		setvalue2.add(100);
		setvalue2.add(200);
		setvalue2.add(30);
		setvalue2.add(40);
		
		
		
		
		
		Set set = Collections.unmodifiableSet(setvalue);
		
		set.add(50);
		
		System.out.println(set);

	}

}
