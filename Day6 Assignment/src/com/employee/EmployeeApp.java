package com.employee;

public class EmployeeApp {

	public static void main(String[] args) {
		Address tempAddress = new Address(12, "Blue Heaven", "JLN Marg", "Jaipur");
		Address permanentAddress = new Address(56, "Shree krishna Heights", "NH-8", "Gurugram");
		
		Address[] addressList = new Address[] {tempAddress, permanentAddress};
		
		Employee employee = new Employee(102, "Sunil Poonia",addressList );
		System.out.println(employee);
	}

}
