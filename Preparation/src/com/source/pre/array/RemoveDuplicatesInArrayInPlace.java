package com.source.pre.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesInArrayInPlace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {1,4,1,2,8,9,4,3,2,8};
		List<Integer> list = Arrays.asList(arr);
		Set<Integer> set = new HashSet<Integer>(list);
		
		Integer[] arr2 = set.toArray(arr);
		System.out.println("Final result : " + Arrays.toString(arr2));

	}

}
