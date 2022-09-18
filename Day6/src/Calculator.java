import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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
//		try {
//		int data[] = {10};
//		int value1, value2;
//		int sum, sub, mul, div;
//		
//		value1 = data[0];
//		value2 = data[1] /0;
//
//		sum = value1 + value2;
//		System.out.println("Sum is " + sum);
//		
//		sub = value1 - value2;
//		System.out.println("Substraction is " + sub);
//		
////		try {
//		div = value1/ value2;
//		System.out.println("Div is " + div);
////		}catch(ArithmeticException ae) {
////			System.out.println("Cannot divide by zero");
////			ae.printStackTrace(); // Recommended for bigger programs
////			System.out.println(ae.getMessage());
////			System.err.append("Error occured in div");
////		}
//		
//		mul = value1 * value2;
//		System.out.println("Multipliction is " + mul);
//		}catch(ArithmeticException ae) {
//			System.out.println("Cannot divide by zero");
//		}catch(ArrayIndexOutOfBoundsException ab) {
//			System.out.println("Array index is out of bound");
//		}
//		
//		int ans = div(10, 0);
//		
//		System.out.println("Division is = " + ans);
		
		processFile();
		
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
	
	
	// Reading file can throw two exceptions
	// While opening -> FileNotFoundExeption
	// while reading -> IOException
	private static void processFile() {
		File f = new File("a.txt");
		FileInputStream fis= null;
		Integer one = null;
		
		try {
//			fis = new FileInputStream(f);
//			
//			//System.exit(0); // In this case finally block will not be executed
//			while(fis.read() != -1) {
//				System.out.println("Reading the file");
//			}
			
//			System.out.println("Hello there this is try");
//			return;
			 one.byteValue();
		} 
//		catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		finally {
			System.out.println("Finally is being executed");
			
		}
	}
	
	

}
