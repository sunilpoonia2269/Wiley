/*
 * 
 * First class objects - which behaves like primitive, and you do not need new Keyword ALWAYS to create objects.
 * String is immutable object
 * 
 * 
 * In jvm memory there is compartment, which is refereed as string pool a memory inside the heap pool.
 * All the unique string as occupied in this pool.
 * If new objects contents are similar to existing one, the new memory will not get inited.  But reference will point to existing object/memory
 */
public class StringDemo {

	public static void main(String[] args) {
		
		String str1 = "Nothing"; //object is created in heap and str1 is referring that object
		System.out.println(str1);
		
		str1 = "Something"; // another object is created in heap, and str1 is diverted to new object
		//nothing... is Eligible for garbage collection
		System.out.println(str1);
		
		
		String str2 = new String("Java"); // creating new object using new keyword
		String str3 = "Java"; // Different then above str2
		
		
		// Hash code is same because they have same content
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		str2 = str2.toUpperCase();
		System.out.println(str2);
		System.out.println(str2.charAt(0));
		System.out.println(str2.indexOf("J"));
		
		
		// String builder and Stirng buffer
		/*
		 * 
		 * Mutable versions of string
		 * Not first class objects
		 * 
		 */
		
		StringBuffer sb = new StringBuffer("abc");
		sb.append("");
		sb.delete(0, 0);
		// For use of string methods
		sb.toString().charAt(0);
		
		// All the methods of string buffer is synchroized
		
		// String builder is not synchroized
		StringBuilder sb1 = new StringBuilder("xyz");
		
		
		// Mutliple users -> String buffer
		// Multiple user should be able to access -> String builder
		// Reptetive modification should not use String, go for StringBuffer or String builder
	}

}
