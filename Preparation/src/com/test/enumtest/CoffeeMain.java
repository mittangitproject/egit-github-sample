package com.test.enumtest;

public class CoffeeMain {

	/**
	 * @param args
	 */
	
	enum CoffeeSize{
		BIG,SMALL,MEDIUM
	};
	
	
	public static void main(String[] args) {
		
		new Coffee().size = CoffeeSize.BIG;
//		public static final CoffeeSize BIG = new CoffeeSize("BIG",0);

	}

}
