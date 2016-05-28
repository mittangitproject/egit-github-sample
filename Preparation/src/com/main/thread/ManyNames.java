package com.main.thread;


class NameRunnable implements Runnable {
	
	public void run(){
		
		for(int i = 1 ;i<=3; i++){
			System.out.println("Thread NO : " + Thread.currentThread().getId() + "    |   Name : " + Thread.currentThread().getName());
		}
	}
}


public class ManyNames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameRunnable nameRunnable = new NameRunnable();
		Thread thread1 = new Thread(nameRunnable);
		Thread thread2 = new Thread(nameRunnable);
		Thread thread3 = new Thread(nameRunnable);
		
		thread1.setName("thread1");
		thread1.setName("thread2");
		thread1.setName("thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
		

	}

}
