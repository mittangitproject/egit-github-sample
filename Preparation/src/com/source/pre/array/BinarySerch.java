package com.source.pre.array;

public class BinarySerch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{10,20,30,40,50,60,70,80,90};
		int begin = 0;
		int end = arr.length - 1;
		int search = 890;
		int middle = (begin+end)/2;
		
		while(begin<= end) {
			
			if(arr[middle] > search) {
				end = middle -1;
				middle = (begin+end)/2;
			}else if(arr[middle] < search){
				
				begin = middle + 1;
				middle = (begin+end)/2;
			}else if(arr[middle] == search ) {
				System.out.println("Element is at  " + middle +"th" + "  location");
				break;
				
			}else {
				
				System.out.println("Element not found");
				break;
			}
			
		}//while
		

	}

}
