package testme;

public class CommonElementInTwoArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {5,4,2,1,8,9};
		int[] arr2 = {2,3,7,0,1,34};
		int[] arr3 = {6,4,2,7,1,9};
		int[] sample = new int[arr1.length];
		
		for(int i = 0;i<arr1.length - 1;i++){
			
			for(int j = 0; j<arr2.length -1 ;j++){
				
				if(arr1[i] == arr2[j]){
					
					sample[i] = arr1[i];
				}
				
			}//2nd
			
		}//1ts

	}

}
