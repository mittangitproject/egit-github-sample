package com.google.pre.d23102015;

import java.util.Random;

public class RandomTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random(12);
//		ran.setSeed(12);
		System.out.println(ran.nextInt());
		
		for(int i=1;i<10;i++){
			
			int value = (int)(100.0 * Math.random());
			System.out.println(value);
		}

	}

}
