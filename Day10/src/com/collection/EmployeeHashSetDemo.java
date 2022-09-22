package com.collection;

import java.util.HashSet;
import java.util.Set;

public class EmployeeHashSetDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee("John", "Doe", 23000);
		Employee e2 = new Employee("will", "smith", 23499);
		Employee e3 = new Employee("John", "Doe", 34000);
		Employee e4 = new Employee("Manan", "Kumar", 61000);
		Employee e5 = new Employee("Nitish", "Rana", 51000);
		
		Set<Employee> empSet = new HashSet<Employee>();
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.add(e5);
		
		//System.out.println(empSet);
		
		for(Employee emp : empSet)
			System.out.println(emp);

	}

}
