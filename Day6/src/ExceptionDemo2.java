import java.io.FileNotFoundException;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			
//			//throw new ArithmeticException();
//			throw new ArrayIndexOutOfBoundsException();
//			
//		}
//		// Handling generic exception
//		// Not much recommended due to not very readable code and if statments
//		catch(Exception e) {
//			if(e instanceof ArithmeticException)
//				System.out.println("Wrong input of calculation");
//			if(e instanceof ArrayIndexOutOfBoundsException)
//				System.out.println("Array index is out of bound");
//				
//		}
		
		try {
			
			throw new ArrayIndexOutOfBoundsException();
			
		}catch(ArithmeticException ae) {
			System.out.println("Arithmetic exception");
		}catch(NullPointerException ne) {
			System.out.println("Null pointer exception found");
		}catch(Exception e) {
			System.out.println("Exeption handled");
		}
		
		try {
			
		}
		// In the list of this catch there should not be super exception
		// Used in grouping exception and it is better than generic handling of exception
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			if(e instanceof ArithmeticException)
				System.out.println("Arithematic excepiton");
			
			if(e instanceof ArrayIndexOutOfBoundsException)
				System.out.println("Array index is out of bounds");
				
		}

	}

}
