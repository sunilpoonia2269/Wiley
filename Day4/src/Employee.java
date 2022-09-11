
public class Employee {
	int empId;
	String empName;
	//int empCounter; //instant variable, for each object inital value will be 0
	static int empCounter;
	
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
		System.out.println("Employee created... Counter will be increaed by One");
		empCounter++;
	}
	
	// Static block
	static {
		System.out.println("In the static block");
		empCounter = 100;
	}
	
	// Static method is used to process the static member
	// this method can be invoked without object, should be invoked with classname
	// static method is not dedicated to any of the object. So you cannot use the keyword of object, or you cannot use any instant variables inside static method
	public static int getEmployeeCounter() {
		return empCounter;
	}
	
	public static void main(String[] args) {
		
	}
	
	



}
