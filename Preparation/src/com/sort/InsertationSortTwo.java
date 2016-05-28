package com.sort;

import java.util.Arrays;

public class InsertationSortTwo {

	/**
	 * @param args
	 */
	
	public void ins_sort(int[] arr){
		
     for(int i=0;i<arr.length;i++){
    	 
    	 int temp = arr[i];
    	 int j = i-1;
    	 while(j > -1 && arr[j]>temp){
    		 
    		 arr[j+1] = arr[j];
    		 j--;
    	 }
    	 arr[j+1] = temp;
     }		
     System.out.println(Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,43,1,90,35,13,0,41};
		
		new InsertationSortTwo().ins_sort(arr);
		

	}

}
