package com.google.pre.D23092015;

import java.util.Arrays;
import java.util.Collections;

public class DecendingArraySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = new int[5];
		Integer[] arrinteger = new Integer[arr.length];
		
		arr[0] = 10;
		arr[1] = 1;
		arr[2] = 34;
		arr[3] = 23;
		arr[4] = 3;
		
		Arrays.sort(arr);
		
//		for (int arraydisplay : arr) {
//			
//		System.out.println(arraydisplay + "  ");
//		}
		
		
		for(int i = 0; i<arr.length ; i++) {
			
			arrinteger[i] = arr[i];
			
		}
		
		Arrays.sort(arrinteger , Collections.reverseOrder());
		
		
		for (int arraydisplay : arrinteger) {
			
			System.out.println(arraydisplay + "  ");
			}

	}

}
