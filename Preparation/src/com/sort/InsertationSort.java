package com.sort;

import java.util.Arrays;

public class InsertationSort {

	public void insertation_sort_Elements(int[] elements) {
		
		for(int j = 1; j< elements.length; j++){
			int key = elements[j];
			int i = j-1;
			while((i> -1) && (elements[i] > key)){
				
				
				elements[i+1] = elements[i];
				i--;
				
			}//while
		     	
			elements[i+1] = key;
		}//j
		
		
		System.out.println("After : " + Arrays.toString(elements));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {10,9,8,7,6,5,4,3,2,1,0};
		System.out.println("Before sorting : " +  Arrays.toString(arr1));
//		System.out.println("After : " + Arrays.toString();	}
		new InsertationSort().insertation_sort_Elements(arr1);
	}
}
