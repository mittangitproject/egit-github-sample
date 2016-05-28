package com.bank;

public class DeadLock {
	
	private static class innerDeadLock{
		int value;
	}
	
	private innerDeadLock obj1 = new innerDeadLock();
	private innerDeadLock obj2 = new innerDeadLock();
	
	
	public void read(){
		
		synchronized(obj1){
			synchronized (obj2) {
				//operation
				
			}
		}
	}
	
public void write(){
		
		synchronized(obj2){
			synchronized (obj1) {
				//operation
				
			}
		}
	}
	

}
