
/*
 * 
 * Exception - Program termination abruptly
 * 
 * Traditional Way - If-else
 * 
 * OOPs Way - 
 * 
 * Object -> Thrwoable -> Exception, Error
 * Exception -> RuntimeException, IOExcetpion
 * 
 */
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Reading the array happens at runtime
//		int data[] = {10};
//		int value1, value2;
//		int sum, sub, mul, div;
//		
//		value1 = data[0];
//		value2 = data[1];
//
//		sum = value1 + value2;
//		System.out.println("Sum is " + sum);
//		
//		sub = value1 - value2;
//		System.out.println("Substraction is " + sub);
//		
//		try {
//		div = value1/ value2;
//		System.out.println("Div is " + div);
//		}catch(ArithmeticException ae) {
//			System.out.println("Cannot divide by zero");
//			ae.printStackTrace(); // Recommended for bigger programs
//			System.out.println(ae.getMessage());
//			System.err.append("Error occured in div");
//		}
//		
//		mul = value1 * value2;
//		System.out.println("Multipliction is " + mul);
//		
		int ans = div(10, 0);
		
		System.out.println("Division is = " + ans);
		
	}

	private static int div(int i, int j) {
		// TODO Auto-generated method stub
		try {
			int ans = i/j;
			return ans;
		}catch(ArithmeticException ae) {
			System.out.println("Cannot divide by zero");
		}
		
		return 0;
	}
	
	

}
