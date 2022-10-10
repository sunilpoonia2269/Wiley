package com.electricity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.electricity.exception.NegativeUnitConsumedException;

public class CustomerUtility {
	
	Map<String, List<Customer>> customerListByAreaCode;
	
	

	public CustomerUtility() {
		super();
		this.customerListByAreaCode = new HashMap<>();
	}
	
	public Map<String, List<Customer>> getCustomerListByAreaCode(){
		return this.customerListByAreaCode;
	}
	
	void display(List<Customer> list) {
		list.forEach((customer)-> System.out.println(customer));
	}
	
	void mapCustomerByAreaCode(String areaCode, Customer customer) {
		
		if(this.customerListByAreaCode.get(areaCode) != null) {
			this.customerListByAreaCode.get(areaCode).add(customer);
			return;
		}
		
		List<Customer> newList = new ArrayList<Customer>();
		newList.add(customer);
		this.customerListByAreaCode.put(areaCode, newList);
	}

	public double calculateTotalBill(int noOfUnitsConsumed) {
		double totalBill = 0;
		
		if(noOfUnitsConsumed <= 100) 
			totalBill = noOfUnitsConsumed * 0.5;
			
		if(noOfUnitsConsumed>=101 && noOfUnitsConsumed<=150) 
			totalBill = (100 * 0.5) + ((noOfUnitsConsumed-100) * 0.75);
		
		if(noOfUnitsConsumed>150)
			totalBill = (100 * 0.5) + (50 * 0.75) + ((noOfUnitsConsumed-150)*1);
	
		return totalBill;
		
	}

	
	public void inputValidation(int noOfUnitConsumed) throws NegativeUnitConsumedException {
		if (noOfUnitConsumed < 0) throw new NegativeUnitConsumedException();
	}


	void sortCustomerByBillAmount(List<Customer> list) {
		list.sort((o1, o2) ->o2.getTotalBill().compareTo(o1.getTotalBill()));
	}
	
	
	void userByAreaCode(String areaCode){
		List<Customer> list = this.customerListByAreaCode.get(areaCode);
		if(list == null) {
			System.out.println("There are no customers in given area");
			return;
		}
		System.out.println("Customers with areaCode : " + areaCode);
		list.forEach((customer)->System.out.println(customer));
	}
	
}
