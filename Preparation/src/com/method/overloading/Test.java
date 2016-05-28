package com.method.overloading;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent parent = new Parent();
//		Parent parentChild = new Child();
		Child child = (Child)parent;
        
		child.show();
//		child.show("CG");

	}

}
