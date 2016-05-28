package com.google.pre.guava;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

public class GuavaTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuavaTester gtester = new GuavaTester();
		
		Integer val1 = null;
		Integer val2 = new Integer(12);
		
//		Optional<Integer> v1 = Optional.fromNullable(val1);
//		Optional<Integer> v2 = Optional.fromNullable(val2);
		
		gtester.sum(null , 10);

	}
	
	public void sum(Integer value1 ,Integer value2) {
		
		value1 = Preconditions.checkNotNull(value1 , "Null Value Passed");
		value2 = Preconditions.checkNotNull(value2 , "Null Value Passed");
		
//		System.out.println( value1.get() + value2.get());
		System.out.println(value1 + value2);
		
	}

}
