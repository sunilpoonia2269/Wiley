package com.string;

public class StringApp {

	public static void main(String[] args) {
		StringOperation operation = new StringOperation();
		System.out.println("Reverse of String : " + operation.reverseString("Sunil"));
		
		System.out.println("Occurance of letter 'S' is : " + operation.occuranceOfChar("SS Sunil", 'S') );
	
		String str1 = "sunil";
		String str2 = "lunik";
		if(operation.anagramString(str1, str2))
			System.out.println(str1 + " And " + str2 + " are anagram strings");
		else
			System.out.println(str1 + " And " + str2 + " are not anagram strings");

	}

}
