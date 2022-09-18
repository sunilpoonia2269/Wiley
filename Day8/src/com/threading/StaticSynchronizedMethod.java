package com.threading;

class Test1{
	public static synchronized void increment() {  // synchronized methods can be used by one thread at a time.
		System.out.println("increment called");
		for(int i=0; i<3; i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
			
			
		}
	}
	
	public static synchronized void decrement() {  // synchronized methods can be used by one thread at a time.
		System.out.println("decrement called");
		for(int i=2; i >= 0; i--) {
			System.out.println(i + " " + Thread.currentThread().getName());
			
			
		}
	}
}


class TestThread extends Thread{
	Test1 test;
	public TestThread(Test1 test) {
		this.test = test;
	}
	
	@Override
	public void run() {
		test.increment();
		test.decrement();
	}
}

public class StaticSynchronizedMethod {

	public static void main(String[] args) {
		
		Test1 test = new Test1();
		TestThread testThread = new TestThread(test);
		TestThread testThread1 = new TestThread(test);
		
		testThread.start();
		testThread1.start();
		

	}

}
