package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeTreeSetDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee("John", "Doe", 23000);
		Employee e2 = new Employee("will", "smith", 23499);
		Employee e3 = new Employee("John", "Doe", 34000);
		Employee e4 = new Employee("Manan", "Kumar", 61000);
		Employee e5 = new Employee("Nitish", "Rana", 51000);
		
		
		// If you want object in tree set your class must implement compareable
		Set<Employee> empSet = new TreeSet<Employee>();
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.add(e5);
		
		//System.out.println(empSet);
		
		System.out.println("Default employee sorting on based on lastName : ");
		for(Employee emp : empSet)
			System.out.println(emp);
		
		// Collections.sort(list, new Comparator());
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.addAll(empSet);
		
		Collections.sort(empList, new EmployeeSortByFirstName());
		
		System.out.println("Custom employee sorting on based on firstName : ");
		for(Employee emp : empList)
			System.out.println(emp);
		
		
		Collections.sort(empList, new EmployeeSortBySalary());
		
		System.out.println("Custom employee sorting based on salary : ");
		for(Employee emp : empList)
			System.out.println(emp);
	}
}
