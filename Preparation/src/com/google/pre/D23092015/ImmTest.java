package com.google.pre.D23092015;

 final class Imm {
	 
	 private int roll ;
	 private String name ;
	 
	 private Imm(int roll, String name) {
		 
		 this.name = name;
		 this.roll = roll;
		 
	 }
	 
	 public static Imm getObj() {
		 
		 return new Imm(12,"");
	 }
	 
 }

public class ImmTest {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
