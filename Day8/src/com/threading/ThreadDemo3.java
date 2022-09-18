package com.threading;

public class ThreadDemo3 {

	public static void main(String[] args) {
	
		// Need based thread 
		Thread thread = new Thread() {
			
			public void run() {
				/// Business logic 
				System.out.println("Run is invoked");
			}
		};

		thread.start();
		
		// First time applying new keyword to interface.
		
		Runnable thread2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable run is called");
				
			}
			
		};
		Thread thread3 = new Thread(thread2);
		thread3.start();
	}

}
