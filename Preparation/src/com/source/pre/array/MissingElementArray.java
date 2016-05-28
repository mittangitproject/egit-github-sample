package com.source.pre.array;

import java.util.Arrays;

public class MissingElementArray {

	/**
	 * @param args
	 */
	
	public int[] missingElements(int[] arr){
		
		int element = 1;
		int[] missing = new int[12]; 
		for(int start = 0; start < arr.length;start++){
			
			if(arr[start] != element ){
				missing[start] = element;
			}
			
			element++;
			
		}
		return missing;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[100];
		for(int i= 0; i<100; i++){
			
			arr[i] = i+1;
		}
		
		System.out.println("Inserted Elements : " + Arrays.toString(arr));
		System.out.println("missing Elements : " + Arrays.toString(new MissingElementArray().missingElements(arr)));
		
		
		

	}

}
