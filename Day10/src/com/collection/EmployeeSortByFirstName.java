package com.collection;

import java.util.Comparator;


// Customized sorting can be done by comparator method
public class EmployeeSortByFirstName implements  Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getFirstName().compareTo(o2.getFirstName());
	}

}
