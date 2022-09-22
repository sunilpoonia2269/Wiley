package com.electricity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.electricity.exception.NegativeUnitConsumedException;

public class CustomerApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String choice = "";
		
		List<Customer> customerList = new ArrayList<Customer>();
		CustomerUtility customerUtility = new CustomerUtility();
		
		do {
			System.out.println("Enter Customer ID : ");
			int customerId = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Customer name : ");
			String customerName = sc.nextLine();
			
			System.out.println("Enter Customer Area : ");
			String customerAreaCode = sc.nextLine();
			
			System.out.println("Enter Number of units Consumed : ");
			int noOfUnitsConsumed = sc.nextInt();
			sc.nextLine();
			
			try {
					customerUtility.inputValidation(noOfUnitsConsumed);
					Customer customer = new Customer(customerId, customerName, noOfUnitsConsumed, customerAreaCode);
					customer.setTotalBill(customerUtility.calculateTotalBill(noOfUnitsConsumed));
					customerList.add(customer);
					customerUtility.mapCustomerByAreaCode(customerAreaCode, customer);
					
			}catch(NegativeUnitConsumedException e) {
				System.err.print(e);
			}
			
			System.out.println("Do you want to continue : yes/no");
			choice = sc.nextLine();
			
		}while(choice.equalsIgnoreCase("yes"));
		
		System.out.println();
		System.out.println("Displaying all the customers : ");
		customerUtility.display(customerList);
		
		System.out.println("********************************************");
		
		System.out.println();
		customerUtility.sortCustomerByBillAmount(customerList);
		System.out.println("Customer sorted on basis of totalBill in decending : ");
		customerUtility.display(customerList);
		
		System.out.println("********************************************");
		
		System.out.println();
		System.out.println("Enter a areacode where you want to search customer : ");
		customerUtility.userByAreaCode(sc.nextLine());
		sc.close();

		System.out.println("********************************************");
		
		System.out.println();
		System.out.println("Serializing List of Customers : ");
		CustomerSerializable.serilaizeCustomerList(customerList);
		
		
		System.out.println("********************************************");
		
		System.out.println();
		System.out.println("Deserializing List of Customers : ");
		CustomerSerializable.deSerilaizeCustomerList();

		System.out.println("********************************************");
		
		System.out.println();
		System.out.println(customerUtility.getCustomerListByAreaCode());
	}

}
