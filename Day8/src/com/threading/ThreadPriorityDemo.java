package com.threading;

public class ThreadPriorityDemo  extends Thread{
	
	public void run() {
		String threadName = Thread.currentThread().getName();
		for(int i=1; i<=10; i++) {
			System.out.println(i + " generated by " + threadName);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}

	public static void main(String[] args) {
		ThreadPriorityDemo demo = new ThreadPriorityDemo();
		ThreadPriorityDemo demo1 = new ThreadPriorityDemo();
		ThreadPriorityDemo demo2 = new ThreadPriorityDemo();
		
		demo.setPriority(MAX_PRIORITY);
		demo.start();
		demo1.start();
		demo2.start();
		
		

	}

}