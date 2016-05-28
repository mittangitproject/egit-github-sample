package com.google.pre.d23102015;

public class TestMe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String s0 = "its";
		String s1=s0+"me";
		String s2 = new String("itsme");
		
		if(s1.equals(s2))
//		if(s1==s2)
			System.out.println("true");
		else
			System.out.println("false");

	}

}
