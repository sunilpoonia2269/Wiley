import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method(10);
//		try {
//			processFile("data.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		doCalculation();
	}
	
	
	// throws with unchecked exception
	private static void doCalculation()  throws ArithmeticException{
		// TODO Auto-generated method stub
		throw new ArithmeticException();
		
	}


	// throws keyword with checked exception
	private static void processFile(String fileName) throws FileNotFoundException {
		FileInputStream fis  = new FileInputStream(fileName);
		
		
	}

	private static void method(int i) {
		if(i<15) 
			try {
				throw new Exception();
			}catch(NullPointerException ne) {
				System.out.println("Null pointer exception occured");
			}catch(Exception e) {
				System.out.println("Exception occured");
			}
	}

}
