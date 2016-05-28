package com.test.b;

public class B {
	
	int valueB = 10;
	A a1 = new A();
	int result() {
		
		return a1.add() + valueB*3;
	}

}
