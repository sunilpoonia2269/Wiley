
public class EmployeeApp {

	public static void main(String[] args) {
		Employee employee1 = new Employee(101, "Sunil Poonia", Department.DEVELOPMENT, 45000);
		Employee employee2 = new Employee(102, "Mohit bhargav", Department.SUPPORT, 32000);
		Employee employee3 = new Employee(103, "Sumit Soni", Department.MANAGEMENT, 135000);
		Employee employee4 = new Employee(104, "Rohit Rana", Department.DEVELOPMENT, 53000);
		Employee employee5 = new Employee(105, "Dinesh Kartik", Department.FINANCE, 71000);
		Employee employee6 = new Employee(106, "Rohit Sharma", Department.MANAGEMENT, 210000);

		Employee[] empArray = { employee1, employee2, employee3, employee4, employee5, employee6 };

		EmployeeOperation empOperation = new EmployeeOperation();

		Employee[] sortedEmployees = empOperation.sortEmployees(empArray);

		System.out.println("Employee sorted based on their gross salary is is -> ");
		for (Employee emp : sortedEmployees)
			System.out.println(emp.getEmpName() + " - " + emp.getEmpGrossSalary());

		System.out.println("-------------------------***------------------------");

		Employee[] developmentEmployees = empOperation.searchEmployees(empArray, Department.DEVELOPMENT);

		for (Employee emp : developmentEmployees)
			System.out.println("Employee of " + Department.DEVELOPMENT + " department is -> " + emp.getEmpName());

		Employee[] managementEmployees = empOperation.searchEmployees(empArray, Department.MANAGEMENT);

		for (Employee emp : managementEmployees)
			System.out.println("Employee of " + Department.MANAGEMENT + " department is -> " + emp.getEmpName());

	}

}
