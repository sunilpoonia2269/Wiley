
public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String str1 = new String("java"); // Forcefully putting the string object outside of constant pool
		String str1 = new String("java").intern(); // intern method pushes the string explicitly in the constant pool
		String str2 = "java";
		
		
		System.out.println(str1 == str2);
		
	}

}
