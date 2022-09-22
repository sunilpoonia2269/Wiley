package com.collection;

public class Employee implements Comparable<Employee> {
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(String firstName, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public double getSalary() {
		return this.salary;
	}




	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	

	@Override
	public String toString() {
		return "Name = " + this.firstName + " " + this.lastName  + ", Salary : " + this.salary;
	}



	// Must be overriden if used in set
	// Equlas method is called only if the objects are in same bucket
	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals is called");
		if(obj instanceof Employee) {
			Employee employee = (Employee)obj;
			return this.firstName.equals(employee.firstName) && this.lastName.equals(employee.lastName);
		}
		return super.equals(obj);
	}



	// To reduce calls to equals method then we have to implement hashcode in better way
	@Override
	public int hashCode() {
		
		return this.firstName.charAt(0);
	}



	// this method gets invoked by treeset to re-arrange the objects
	@Override
	public int compareTo(Employee o) {
		
		// For ascending way
		//return this.lastName.compareTo(o.lastName);
		
		// For decending way
		return o.lastName.compareTo(this.lastName);
	}
	
	
	
	

}
