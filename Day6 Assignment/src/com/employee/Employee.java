package com.employee;

import java.util.Arrays;

public class Employee {
	private int empId;
	private String empName;
	private Address[] empAddresses;
	
	
	public Employee(int empId, String empName, Address[] empAddresses) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddresses = empAddresses;
	}


	public int getEmpId() {
		return empId;
	}


	public String getEmpName() {
		return empName;
	}


	public Address[] getEmpAddresses() {
		return empAddresses;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + this.empId + ", empName=" + this.empName + ", tempAddress=" + this.empAddresses[0] + ", permanentAddress=" + this.empAddresses[1]
				+ "]";
	}

}

