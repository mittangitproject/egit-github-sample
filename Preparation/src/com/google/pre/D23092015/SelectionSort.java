package com.google.pre.D23092015;

public class SelectionSort {

	/**
	 * @param args
	 */
	
	public static int[] ssort(int list[]) {
		int minpos ;
		int tmp;
		
		for(int i =0;i<list.length-1;i++) {
			
			minpos = i;
			
			for(int j = i+1; j< list.length;j++){
				
				if(list[j] < list[minpos]) {
					
					minpos = j;
					
				}//if
				
			}//inner for
			
			tmp = list[minpos];
			list[minpos] = list[i];
			list[i] = tmp;
			
			
		}//for
		
		return list;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {12,2,8,56,8,6,8,2,90,25,67,34,21,58,90};
		
		int arr1[] = ssort(arr);
		
		for(int k=0;k<arr1.length;k++){
			
			System.out.println(arr1[k]);
		}

	}

}
