package com.google.pre.guava;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.google.common.collect.Sets;

public class GuavaTest4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GuavaTest4 gt = new GuavaTest4();
		
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		
		l1.add(12);
		l1.add(120);
		l1.add(121);
		
		l2.add(12);
		l2.add(123);
		l2.add(124);
		
		Set<Integer> value = gt.Union(l1, l2);
		System.out.println(value);

	}
	
	
	public Set<Integer> Union(List<Integer> list1, List<Integer> list2) {
		
		Set<Integer> s1 = new TreeSet<Integer>();
		
		s1.addAll(list1);
		s1.addAll(list2);
		
		return s1;
		
	}

}
