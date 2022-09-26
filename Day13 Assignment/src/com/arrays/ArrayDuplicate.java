package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicate {

	public static void main(String[] args) {
		int[] arr = new int[] {1,32,43,2,1,34,51};
		
		boolean result1 = isArrayContainsDuplicate(arr);
		boolean result = isArrayContainsDuplicateByMap(arr);
		if(result)
			System.out.println("Array contains duplicate");
		else
			System.out.println("Array doesn't contain any duplicates");

	}

	private static boolean isArrayContainsDuplicateByMap(int[] arr) {
		Map<Integer, Integer> arrayMap = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++) {
			if(arrayMap.get(arr[i]) != null) return true;
			arrayMap.put(arr[i], 1);
		}
		return false;
	}

	private static boolean isArrayContainsDuplicate(int[] arr) {
		
		for(int i=0; i<arr.length - 1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) return true;
			}
		}
		return false;
	}

}
