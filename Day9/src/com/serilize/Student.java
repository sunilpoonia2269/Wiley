package com.serilize;

import java.io.Serializable;

// Tranisient variables are not part of serilization

public class Student implements Serializable {
	String name;
	double cgpa;
	String regNo;
	Date admissonDate;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student name : " + this.name + " Cgpa : " + this.cgpa + " reg no : " + this.regNo;
	}

	public Student(String name, double cgpa, String regNo, Date admissonDate) {
		super();
		this.name = name;
		this.cgpa = cgpa;
		this.regNo = regNo;
		this.admissonDate = admissonDate;
	}

	
	

}
