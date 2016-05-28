package com.source.pre.array;

import java.util.Arrays;

public class SearchElementInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {12,10,34,76,78};
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 34));

	}

}
