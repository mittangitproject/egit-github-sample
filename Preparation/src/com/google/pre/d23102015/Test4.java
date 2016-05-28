package com.google.pre.d23102015;

class Upper{
	
	private int value;
	
	public Upper(){}
	
	private Upper(int value){
		
		this.value = value;
	}
	
	
	public static final Upper getObj(){
		
		return new Upper(10);
	} 
	
	
}

class Lower extends Upper {
	
	private Lower(){}
	
	
	
}


public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
