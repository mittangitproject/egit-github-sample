package com.source.pre.array;

import java.util.Arrays;

public class ArrayComparation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = new int[]{12,43,56,76};
		int[] arr2 = new int[]{12,43,56,76};
		
		int[][] arr12d = {{12,23,34},{78,98,45,34},{12,90,32}};
		int[][] arr13d = {{12,23,34},{78,98,45,34},{12,90,32}};
		
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr12d, arr13d));

	}

}
