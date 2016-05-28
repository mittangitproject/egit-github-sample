package com.source.pre.array;

import java.util.Arrays;

public class MergeSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] one = {10,20,30,40,50,60,70};
		int[] two = {5,21,25,38,48,52,64,68};
		
		int[] result = new int[one.length + two.length +1];
		System.arraycopy(one, 0, result, 0, one.length);
		System.arraycopy(two, 0, result, one.length + 1, two.length);
		Arrays.sort(result);
		System.out.println("final result : " + Arrays.toString(result));

	}

}
