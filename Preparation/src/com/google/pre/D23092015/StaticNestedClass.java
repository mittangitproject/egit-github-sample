package com.google.pre.D23092015;

 class Outer{
	
	private String name = "Rohan";
	private static String address = "Mumbai";
	int rolll = 100;
	
	static class Inner{
	
		int rolll = 10;
		int roll = 3;
		Outer out = new Outer();
		public void show() {
			int rolll = 1000;
			System.out.println("rolll : " + rolll);
			System.out.println("rolll : " + this.rolll);
//			System.out.println("rolll : " + Outer.this.rolll);
			
			System.out.println(out.name);
			System.out.println(address);
		}
		
	}
}

public class StaticNestedClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Outer.Inner outin = new Outer.Inner();
		outin.show();

	}

}
