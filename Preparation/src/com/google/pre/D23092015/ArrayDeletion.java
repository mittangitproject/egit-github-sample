package com.google.pre.D23092015;

import java.util.ArrayList;
import java.util.List;

public class ArrayDeletion {

	/**
	 * @param args
	 */
	
	public static Object [] deleteFromArray(int[] array, int elementName) {
		
		List<Integer> arrayList = new ArrayList<Integer>();
		
		Object[] objString;
		
		for (int array1 : array) {
			
			if(elementName != array1){
				
				arrayList.add(array1);
				
			}//if
			
			
		}
		
		if(array.length == arrayList.toArray().length) {
			
			objString = new Object[1];
			
			objString[0] = "Entered element not found.";
			
			return objString;
			
		}else {
		
		return arrayList.toArray();
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = new int[4];
		
		arr[0] = 10;
		arr[1] = 40;
		arr[2] = 5;arr[3] = 56;
		
		Object[] obj = deleteFromArray(arr , 0);
		
		for (Object obj1 : obj) {
			
			System.out.println(obj1 + " ");
		}
		
       System.out.println("length Of Array : " + obj.length);
	}

}
