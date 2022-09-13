
public class Employee {
	private int empId;
	private String empName;
	private Department empDept;
	private double empBasicSalary;
	private double empGrossSalary;
	final int HRA = 12;
	final int DA = 8;
	
	
	public Employee(int empId, String empName, Department empDept, double empBasicSalary) {
		super();
		if(empBasicSalary < 0) throw new IllegalArgumentException();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
		this.empGrossSalary = calculateGrossSalary(empBasicSalary);
	}


	/// Methods which class internally uses to calculate grossSalary
	private double calculateGrossSalary(double basicSalary) {
		return basicSalary + calculateTaxes(basicSalary, this.HRA) + calculateTaxes(basicSalary, this.DA);
	}

	
	private double calculateTaxes(double basicSalary, int taxRate) {
		return (basicSalary * taxRate)/100;
	}


	/// Getters And Setter methods
	public int getEmpId() {
		return empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Department getEmpDept() {
		return empDept;
	}


	public void setEmpDept(Department empDept) {
		this.empDept = empDept;
	}


	public double getEmpBasicSalary() {
		return empBasicSalary;
	}


	public void setEmpBasicSalary(double empBasicSalary) {
		this.empBasicSalary = empBasicSalary;
		this.empGrossSalary = calculateGrossSalary(empBasicSalary);
	}


	public double getEmpGrossSalary() {
		return empGrossSalary;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee employee = (Employee)obj;
			return this.empId == employee.empId && this.empName == employee.empName ;
		}
		return false;
	}


}
