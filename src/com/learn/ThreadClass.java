package com.learn;

public class ThreadClass extends Thread {
	
	public void run() {
		
		for(int i=0;i<11;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		ThreadClass t = new ThreadClass();
		ThreadClass t1 = new ThreadClass();
		t.start();
		t1.start();
		
		

	}

}
