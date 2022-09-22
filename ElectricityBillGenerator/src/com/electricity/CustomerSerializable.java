package com.electricity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class CustomerSerializable {

	static void serilaizeCustomerList(List<Customer> list) {
		try (FileOutputStream fos = new FileOutputStream("customer.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
	
				oos.writeObject(list);

		} catch (FileNotFoundException  e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Customer list is seriliazed");

	}
	
	
	static void deSerilaizeCustomerList() {
		
		try(FileInputStream  fis = new FileInputStream(new File("customer.dat"));
			ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			@SuppressWarnings("unchecked")
			List<Customer> list = (ArrayList<Customer>)ois.readObject();
			
			for(Customer customer : list)
				System.out.println(customer);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
