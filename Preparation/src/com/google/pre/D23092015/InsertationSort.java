package com.google.pre.D23092015;

public class InsertationSort {
	
	public static int[] sort(int list[]) {
		
		int temp,j;
		int key;
		
       for(int i=1;i<list.length;i++){
    	   
    	   j = i-1;
    	   key = list[i];
    	   
    	   while(j >= 0 && key<list[j]) {
    		   
    		   temp = list[j];
    		   list[j] = list[j+1];
    		   list[j+1] = temp;
    		   
    		   j--;
    		   
    		   //swap
    		   
    	   }//while
    	   
       }	//outer for loop	
		
		
		
		return list;
		
	}
	
	
	public static void main(String args[]){
		
		int list1[] = {10,3,7,34,1,45};
		
		int list[] = sort(list1);
		
		for(int k =0 ;k<=list.length;k++)
		System.out.println(list[k]);
	}

}
