
/*
 * int -> Integer
 * double -> Double
 * char -> character
 * float -> Float
 * long -> Long
 * short -> Short
 * 
 * 
 * Boxing -> Conversion of primitive into objects/ Wrappers
 * Unboxing -> Conversion of wrappers into primitive
 */
public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer integer1 = new Integer(10);
		
		
		// Boxing
		int x = 20;
		Integer integer2 = new Integer(x);
		
		// Unboxing
		int ans = integer1.intValue();
		
		checkValue(ans);

	}

	private static void checkValue(Integer ans) {
		// TODO Auto-generated method stub
		
	}

}
