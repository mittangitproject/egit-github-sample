package com.bank;


final class Myimmutable{
	
	private final String name;
	
	private Myimmutable(String name){
		this.name = name;
	}
	public static Myimmutable getObject(String name) {
		return new Myimmutable(name);
	}
	
}

public class ImmutableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Myimmutable obj1 = Myimmutable.getObject("CG");
		Myimmutable obj2 = Myimmutable.getObject("CG1");
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		

	}

}
