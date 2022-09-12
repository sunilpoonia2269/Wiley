
public class ArrayDemo {
	
	public static void main(String[] args) {
		// datatype[] arrayName = new dataType[sizeOfArray];
		// Arrays are always created in heap, So arrays will always have default value
		
		
		int[] data = new int[5];
		
		// Another way of creating array
		int[] data2 = new int[] {10, 53, 33, 23};
		
		
		// Never print array directly with name, It gives you the hashvalue for array
		//System.out.println(data);
		
		
		// Traditional for loop
//		for(int i=0; i<data.length; i++) {
//			System.out.println(data[i]);
//		}
		
		
		// Enhanced for loop
		//for(dataType element : collection/array)
		
//		for(int element : data2) {
//			System.out.println(element);
//		}
		
		Employee[] empArray = new Employee[] {new Employee(101, "John doe"), new Employee(102, "Mr blink"), new Employee(103, "Rakesh")};
//		empArray[0] = new Employee(101, "John doe");
//		empArray[1] = new Employee(102, "Mr blink");
//		empArray[2] = new Employee(103, "Rakesh");
		
		for(Employee emp : empArray) 
			System.out.println(emp.toString());
			
		
		
		
		
	}

}
