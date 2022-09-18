package com.serilize;

import java.io.Serializable;

public class Employee implements Serializable{

	private int empId;
	private String empName;
	private double empSalary;
	
	
	
	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	
	@Override
	public String toString() {
		return "empId : " + this.empId + " empName : " + this.empName + " empSalary : " + this.empSalary;
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
}
