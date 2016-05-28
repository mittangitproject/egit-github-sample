package com.google.pre.D23092015;

import com.google.common.base.Preconditions;

public class Test3 {
	
	public static void main(String[] args) {

		Test3 t3 = new Test3();
		
//		t3.sqrt(null);
//		t3.sqrt(-3.4);
		t3.sqrt(12.0);
		int value = t3.dispalyElement(2);
		System.out.println("value = " + value);
		
	}
	
	
	public void sqrt(Double val1) {
		
		val1 = Preconditions.checkNotNull(val1 , "NULL - value Inserted");
		Preconditions.checkArgument(val1 > 0.0, "NEGETIVE VALUE INSERTED",val1);
		System.out.println("sqrt : " + Math.sqrt(val1));
	}
	
	public int dispalyElement(int index) {
		
		int data[] = {12,23,43,19};
	    index = Preconditions.checkElementIndex(index, data.length,"OutOfIndex");
		return data[index];
	}

}
