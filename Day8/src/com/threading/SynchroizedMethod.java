package com.threading;


class Test{
	public synchronized void count() {  // synchronized methods can be used by one thread at a time.
		for(int i=0; i<3; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
			
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class MyThread extends Thread{
	Test test;
	public MyThread(Test test) {
		this.test = test;
	}
	
	@Override
	public void run() {
		test.count();
	}
}


public class SynchroizedMethod {

	public static void main(String[] args) {
		
		Test obj = new Test(); // Object of test class that is shared among threads
		
		MyThread myThread1 = new MyThread(obj);
		MyThread myThread2 = new MyThread(obj);
		myThread2.setPriority(Thread.MAX_PRIORITY);
		
		myThread1.start();
		myThread2.start();
		
		

	}

}
