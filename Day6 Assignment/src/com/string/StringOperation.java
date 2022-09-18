package com.string;

import java.util.Arrays;

public class StringOperation {
	
	String reverseString(String input) {
		String reverse = "";
		
		for(int i=input.length()-1; i >= 0; i--) {
			reverse += input.charAt(i);
		}
		
		return reverse;
	}
	
	
	int occuranceOfChar(String input, char c) {
		int result = 0;
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == c) result++;
		}
		
		return result;
	}

	boolean anagramString(String str1 , String str2) {
		if(str1.length() != str2.length()) return false;
		
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		for(int i=0; i<s1.length; i++) {
			if(s1[i] != s2[i]) return false;
		}
		
		return true;
	}
}
