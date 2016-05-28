package com.google.pre.d23102015;

class Parent{
	
	public void display(){
		
		System.out.println("Parent");
	}
	
}
class Child extends Parent{
	
public void display(){
		
		System.out.println("child");
	}
	
}

public class IhheritanceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Parent parent = new Parent();
		
		Parent parent = new Child();
//		Child child = new Child();
//		child.display();
		parent.display();

	}

}
