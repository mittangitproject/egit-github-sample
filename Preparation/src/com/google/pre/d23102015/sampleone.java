package com.google.pre.d23102015;


class OuterOne{
	
	private int value = 2000;
	
	class InnerOne {
		
		public int getValue(){
			
			return value;
		}
		
		
	}
}

public class sampleone {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {

		 OuterOne.InnerOne outer = new OuterOne().new InnerOne();
	
		System.out.println(outer.getValue());
	}

}
