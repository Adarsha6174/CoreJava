package com.learn;

class ThreadOne extends Thread{
	public void run() {
		for(int i=1; i<=5;i++) {
			System.out.println("value :"  + i);
			Thread.yield();
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
}

class ThreadTwo extends Thread{
	public void run() {
		for(int i=6; i<=10;i++) {
			System.out.println("value :"  + i);
		}
	}
}

class ThreadThree extends Thread{
	public void run() {
		for(int i=11; i<=15;i++) {
			System.out.println("value :"  + i);
		}
	}
}

public class MultipleThreads {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadOne t1= new ThreadOne();
		ThreadTwo t2= new ThreadTwo();
		ThreadThree t3= new ThreadThree();
		
		
		t1.setPriority(10);
		t3.setPriority(9);
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Main");

	}

}
