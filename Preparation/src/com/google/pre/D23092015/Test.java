package com.google.pre.D23092015;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] arr = new int[4][5];
		int i,j,k=0;
		for(i=0;i<4;i++) {
			
			for(j=0;j<i+1;j++){
				
				arr[i][j] = k;
				k++;
				
			}//for j
			
		}//for i
		
		
           for(i=0;i<4;i++) {
			
			for(j=0;j<i+1;j++) {
				
				System.out.print(arr[i][j] +" ");
				
			}//for j
			
			System.out.println();
			
		}//for
		
		
		

	}

}
