package com.test.enumtest;

public enum CompanySize {
	
	BIG(1000),SMALL(500),MEDIUM(800),EXTRA_LARGE(5000);
	
	private int capacity;
	public int getCapacity() {
		
		return capacity;
		
	}
	
	CompanySize(int capacity){
		
		this.capacity = capacity;
		
	}
	
	

}
