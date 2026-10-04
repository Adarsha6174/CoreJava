package com.learn;

class Bank{
	int amt=100;
	public void withdraw(int val)  {
		
		System.out.println(Thread.currentThread().getName()+ "Entered");
		
		synchronized(this) {
			System.out.println("Entered Sync"+Thread.currentThread().getName());
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+ "Ended");
	}
}

public class SyscBlock {
	
	public static void main(String[] args) {
		
		Bank b= new Bank();
		
		
		Thread t = new Thread(()->{
			b.withdraw(700);
		});
		Thread t1 = new Thread(()->{
			b.withdraw(1000);
		});
		
		t.start();
		t1.start();
	}

}
