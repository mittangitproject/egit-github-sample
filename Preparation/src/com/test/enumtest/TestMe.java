package com.test.enumtest;

public class TestMe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
     String s1 = "a";
     String s2 = new String("a");
     String s3 = new String("a");
     String s4 = "a";
     System.out.println(s1==s2);
     System.out.println(s2==s3);
     System.out.println(s1==s4);
	}

}
