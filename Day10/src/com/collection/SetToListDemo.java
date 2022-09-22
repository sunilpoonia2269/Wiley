package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToListDemo {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(23);
		set.add(53);
		set.add(98);
		set.add(23);
		System.out.println(set);
		
		List<Integer> list = new ArrayList<Integer>(set); // Overloaded constructor of ArrayList class which takes other collections
		System.out.println(list);
	}

}
