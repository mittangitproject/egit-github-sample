package com.google.pre.d23102015;

public class Outer {
	
	private int value = 10;
	
	public static class Inner {
		int v = 90;
		static Outer out = new Outer();
		public static void main(String args[]){
			Inner inn = new Inner();
			
			System.out.println(out.value);
			System.out.println(inn.v);
			
		}
	}

}
