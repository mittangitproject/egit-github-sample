package com.google.pre.d23102015;

class ObjCreation{
	
	
}



class ObjCreate extends ObjCreation {
	
	private final int min;
	private final int max;
	
	private ObjCreate(int min,int max){
		
		this.min = min;
		this.max = max;
	}
	
	
	public static final ObjCreate getObjectMax(){
		
		return new ObjCreate(1,Integer.MAX_VALUE);
	}
	
public static final ObjCreate getObjectMin(){
		
		return new ObjCreate(Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
}


public class staticFactoryObjCreation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		System.out.println("Object : " + ObjCreate.getObjectMax().hashCode());
	}

}
