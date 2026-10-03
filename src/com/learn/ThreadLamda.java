package com.learn;

public class ThreadLamda {

public static void main(String[] args) {
	
	Runnable r =()->System.out.println("Thread");
	Thread t = new Thread(r);
	t.start();
}

}
