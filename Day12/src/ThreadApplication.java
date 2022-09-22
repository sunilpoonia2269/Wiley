
public class ThreadApplication {

	public static void main(String[] args) {
		
		/* Type - 1
		 * 
		 * Traditional Approch -> You create a separate class which implements
		 * Runnable Object of that runnable is wired inside the Thread consturctor
		 */
		
		
		Thread t1 = new Thread(new MyThread());
		t1.start();
		
		
		/*
		 * Type - 2
		 * 
		 * Anonymous inner class : Create the body of the class, as and when required : Still more code
		 */

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("In run method of r1");
				
			}
			
			
		};
		Thread t2 = new Thread(r1);
		t2.start();
		
		/*
		 * Type - 3
		 * Anonymous class as an argument
		 */
		
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("In the run method of anonymous class as argument");
				
			}
			
			
		});
		t3.start();
		
		
		
		/// Lambda Expression : Permitted only on function interfaces
		// Functional interface is interface which provides a single functionality to implement
		Runnable r5 = ()->System.out.println("In the method run lambda expression");
		
		Thread t5 = new Thread(r5);
		t5.start();
		
		Thread t6 = new Thread(()->System.out.println("In labmda expression of t6"));
		t6.start();
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
//		SampleInterface interface1 = new SampleInterface() {
//
//			@Override
//			public void process() {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void process1() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		};
	}

}
