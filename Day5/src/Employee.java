
/* Clonable -> Marker interface
// Marker interface are interfaces which does not have any methods in it. It just marks the object for some functionality approval for runtime.
 *  eg. Serializable, Cloneable 
 *  
 *  
 *  
 *  Object Class -> Cosmic super class
 *  toString(); -> String representation of class
 *  hashCode(); -> int repersentation of object
 *  equals();
 *  clone(); -> Used to make clone or copy object
 *  finalize(); -> destructor, invoked when object is going to destroyed
 * */
public class Employee implements Cloneable {
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	// Copy contructor
	// Clone api has some issues and for that copy constructor and static methods
	public Employee(Employee e) {
		
	}
	
	// Static methods
	public static Employee create() {
		return new Employee(1, "");
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.empId + " " + this.empName;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee employee = (Employee)obj; // Downcasting
		if(this.empId == employee.empId)
			return true;
		return false;
	}
	
	// int representation of Object
	// Used for bucketing purpose
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		// return this.empId * 8;
		return super.hashCode();
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}



	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}



	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(101, "John Doe");
		Employee employee2 = new Employee(101, "Rakesh");
		
//		System.out.println(employee1); // Invokes toString() method implicitly
//		
//		
//		if(employee1.equals(employee2)) {
//			System.out.println("Objects are equal");
//		}else {
//			System.out.println("Objects are not equal");
//		}
//		
//		System.out.println(employee1.hashCode());
//		System.out.println(employee2.hashCode());
		
		Employee employee3 = (Employee)employee2.clone(); // Any predefined method which returns you object, has the return type of Object Class
		// subclass ref = new Superclass();
		
		System.out.println(employee3);
	}



	





}
