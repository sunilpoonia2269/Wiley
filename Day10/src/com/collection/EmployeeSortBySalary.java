package com.collection;

import java.util.Comparator;

public class EmployeeSortBySalary  implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		Double salary1 = o1.getSalary();
		Double salary2 = o2.getSalary();
		return salary1.compareTo(salary2);
	}

	
}
