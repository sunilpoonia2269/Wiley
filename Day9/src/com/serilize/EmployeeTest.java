package com.serilize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* steps
1. create a class which implements serialzable
2. Create object of that class
3. open any file in write mode using fileoutputstream
4. pass fileoutput stream to objectoutputstream
5. invoke the writeObject() method of oos and pass the object you want to serilizable


// deserilizable
1. Open the file where the object is serilized in the read mode
2. pass the fileinputstream to objectInputStream
3. invoke the readObject() method of objectInputStream, and cast the object type to the object returned

*/

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Sunil", 67000);
		
		// serialization process
		try {
			FileOutputStream fos = new FileOutputStream("employee.dat"); // Open file in write mode so that i can add object
			ObjectOutputStream oos = new ObjectOutputStream(fos); // create objectoutputstream to pass object as output
			oos.writeObject(e1);
			System.out.println("Object is serialzied");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		// Deserilization process
		try {
			FileInputStream  fis = new FileInputStream(new File("employee.dat"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee employee = (Employee)ois.readObject();
			System.out.println(employee);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
