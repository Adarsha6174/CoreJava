package com.learn;

class BankAccount{
	
	int bal;
	
	synchronized void withdraw(int val) {
		
		if (val>bal) {
			System.out.println("Insufficient Funds");
			System.out.println(Thread.currentThread().getName());
			Thread.yield();
			System.out.println(this);
		}
		else
			System.out.println("Allow Withdraw");
	}
}

public class Sync extends Thread{
	
	BankAccount b;
	Sync(BankAccount b){
		this.b=b;
	}
	
	public void  run() {
//		System.out.println("Thread");
//		BankAccount b=new BankAccount();
		b.withdraw(700);
	}

	public static void main(String[] args) {
//		ThreadInterface t =new ThreadInterface();
		BankAccount b=new BankAccount();
		Sync s = new Sync(b);
		Sync s1 = new Sync(b);
		s.start();
		s1.start();
		
	}

}
