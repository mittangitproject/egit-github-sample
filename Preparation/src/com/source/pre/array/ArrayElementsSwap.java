package com.source.pre.array;

import java.util.Arrays;

public class ArrayElementsSwap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,30,40,50,60};
		int start = 0;int end = arr.length-1;
//		int middle = (start+end) /2;
		
		System.out.println("before swap : " + Arrays.toString(arr));
		while(start <= end){
			
			if(arr.length > 1) {
				
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
			start++;
			end--;
			
		}//while
		
		
		System.out.println("after swap : " + Arrays.toString(arr));

	}

}
