package com.bank;

public class DangerAccount implements Runnable{

	private Account account = new Account();
	
	public void run() {
		
		cashWithdraw(10);
		account.withdraw();
		
	}
	
	
	
	private synchronized void cashWithdraw(int amount){
		if(amount < account.getBalance()) {
			
			System.out.println(Thread.currentThread().getName() + "is elegible to Withdraw amount");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else{
			System.out.println(Thread.currentThread().getName() + "is not elegible to Withdraw amount");
		}
		
	} 

	
	
	public static void main(String[] args) {
		DangerAccount da = new DangerAccount();
		Thread t1 = new Thread(da);
		Thread t2 = new Thread(da);
		t1.setName("Alen");
		t2.setName("Lisha");
		t1.start();
		t2.start();

	}

	
}
