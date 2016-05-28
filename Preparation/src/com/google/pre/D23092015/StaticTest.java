package com.google.pre.D23092015;

public class StaticTest {
	
	static int x; 
	public static void main(String[] args) {

//		System.out.println(x);
//		System.out.println(new StaticTest().x);
//		System.out.println(StaticTest.x);
		
		new StaticTest().method();
		StaticTest.m2();
		
	}
	
	public void method(){
		
		System.out.println(x);
	}
	
	public static void m2(){
		
		System.out.println(x);
	}

}
