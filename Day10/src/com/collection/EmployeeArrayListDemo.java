package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeArrayListDemo {

	
	public static void main(String[] args) {
		
		// Not optimized as Employee refernses are not used in business logic
//		Employee e1 = new Employee("John", "Doe");
//		Employee e2 = new Employee("will", "smith");
//		Employee e3 = new Employee("John", "Doe");
//		Employee e4 = new Employee("Manan", "Kumar");
//		Employee e5 = new Employee("Nitish", "Rana");
//		
//		List<Employee> employeeList = new ArrayList<Employee>();
//		
//		employeeList.add(e1);
//		employeeList.add(e2);
//		employeeList.add(e3);
//		employeeList.add(e4);
//		employeeList.add(e5);
		
		
		List<Employee> employeeList = Arrays.asList(new Employee("John", "Doe", 34000), new Employee("will", "smith", 21000), new Employee("John", "Doe", 34332), new Employee("Manan", "Kumar", 34900), new Employee("Nitish", "Rana", 100000));
		
		
		System.out.println(employeeList);
		
		for(Employee emp : employeeList)
			System.out.println(emp);

	}

}
