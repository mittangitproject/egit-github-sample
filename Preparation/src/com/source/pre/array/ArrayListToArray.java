package com.source.pre.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Bikash");
		list.add("Basant");
		list.add("Obama");
		list.add("mittan");
		list.add("sakti");
		
		Object[] objarr = list.toArray();
		String[] strarr = Arrays.copyOf(objarr, objarr.length,String[].class);
		System.out.println(Arrays.toString(strarr));

	}

}
