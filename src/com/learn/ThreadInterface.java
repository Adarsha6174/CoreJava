package com.learn;

public class ThreadInterface implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread Interface");
		
		
	}
public static void main(String[] args) {
	
	
	Thread t= new Thread(new ThreadInterface());
	t.start();
	
}


}
