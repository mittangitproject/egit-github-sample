package com.source.pre.array;

public class ArraySumPair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{1,5,8,3,15,7,0,4};
		int sum = 5;
		for(int i=0; i<=arr.length-1; i++){
			
			int temp = sum - arr[i];
			for(int j=i+1;j<arr.length ;j++){
			
				if(arr[j] == temp){
					
					System.out.println( "pair : " + "( "+arr[i] + "," +arr[j]+")");
				}
				
			}//j
		}//i
		

	}

}
