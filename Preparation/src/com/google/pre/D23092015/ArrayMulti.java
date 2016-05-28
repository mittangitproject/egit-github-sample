package com.google.pre.D23092015;

public class ArrayMulti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 1;
		int afterIndex;
		
		int arr[] = {1,3,2,4};
		int []resArray = new int[arr.length];
		
		for(int i = 0; i<arr.length;i++){
			
			for(int j=0 ; j<arr.length ;j++) {
				
				if(i != j) {
					
					value = value * arr[j]; 
					
				}//if
				
			}//for
			
			resArray[i] = value;
			value = 1;
			
		}//for
		
		
		for(int k=0;k<resArray.length ; k++) {
			
			
			System.out.println(resArray[k]);
			
		}

	}
	
	
	
	

}
