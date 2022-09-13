
class EmployeeOperation {
	
	
	// Sorting the employees on basis of their gross salary
	Employee[] sortEmployees(Employee[] employees) {	
		Employee[] sortedArray = employees.clone();
		for(int i=0; i<sortedArray.length; i++) {
			for(int j=i+1; j<sortedArray.length; j++) {
				if(sortedArray[i].getEmpGrossSalary() > sortedArray[j].getEmpGrossSalary()) {
					swapElements(sortedArray, i, j);
				}
			}
		}
		
		return sortedArray;
	}

	// Internal method of class used to swap elements in array
	private void swapElements(Employee[] employees, int i, int j) {
		// TODO Auto-generated method stub
		Employee temp = employees[i];
		employees[i] = employees[j];
		employees[j] = temp;
	}
	
	
	
	// Search employees on basis of their department
	Employee[] searchEmployees(Employee[] employees, Department dept) {
		Employee[] searchedEmployees = new Employee[employees.length];
		int currentIndex = 0;
		
		for(Employee emp : employees)
			if(emp.getEmpDept() == dept) {
				searchedEmployees[currentIndex] = emp;
				currentIndex++;
			}
		
		return getResultArray(searchedEmployees, currentIndex);
	}

	private Employee[] getResultArray(Employee[] searchedEmployees, int currentIndex) {
		Employee[] result = new Employee[currentIndex];
		
		for(int i=0; i<currentIndex; i++)
			result[i] = searchedEmployees[i];
		
		return result;
	}
}
