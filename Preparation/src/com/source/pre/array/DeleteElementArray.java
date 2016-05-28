package com.source.pre.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DeleteElementArray {

	/**
	 * @param args
	 */
	
	public int[] deleteElement(int[] input, int index){
		
		int length = input.length - (index + 1)  ;
		
		System.arraycopy(input, index+1, input, index, length);
		input[input.length -1] = 0;
		
		return input;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,23,45,10,78,56,82,109,345,543};
		
//		int[] result =  new DeleteElementArray().deleteElement(arr, 3);
//		System.out.println(Arrays.toString(result));
		Set set = new HashSet(Arrays.asList(arr));

		Iterator itr = set.iterator();
		while(itr.hasNext()){
			
			System.out.print(itr.next() + " | ");
		}
	}

}
