package com.method.overloading;

public class Parent {

	public void show(){
		System.out.println("parent version");
	}
}

class Child extends Parent{
	
	public void show(){
		System.out.println("child version");
	}
	public void show(String name){
		System.out.println("child version : " + name);
	}
	
}


