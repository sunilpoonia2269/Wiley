package com.threading;


// Using runnable interface
public class ThreadDemo1 implements Runnable {

	@Override
	public void run() {
		System.out.println("run method called");

	}

	public static void main(String[] args) {
		
		ThreadDemo1 threadDemo = new ThreadDemo1();
		//threadDemo.start();
		Thread t1 = new Thread(threadDemo); // new Thread(Runnable ref);
		
		t1.start();
		
	}

}
