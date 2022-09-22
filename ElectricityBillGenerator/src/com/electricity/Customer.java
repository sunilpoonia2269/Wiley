package com.electricity;

import java.io.Serializable;

public class Customer implements Serializable{
	
	private static final long serialVersionUID = 12352352353453L;
	
	private int customerId;
	private String customerName;
	private Double totalBill;
	private int numberOfUnitsConsumed;
	private String areaCode;
	
	
	public Customer(int customerId, String customerName, int numberOfUnitsConsumed, String areaCode) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.numberOfUnitsConsumed = numberOfUnitsConsumed;
		this.areaCode = areaCode;
	}
	


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public Double getTotalBill() {
		return totalBill;
	}


	public void setTotalBill(Double totalBill) {
		this.totalBill = totalBill;
	}


	public int getNumberOfUnits() {
		return numberOfUnitsConsumed;
	}


	public void setNumberOfUnits(int numberOfUnits) {
		this.numberOfUnitsConsumed = numberOfUnits;
	}


	public String getAreaCode() {
		return areaCode;
	}


	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}



	@Override
	public String toString() {
		return "customerId = " + customerId + ",\ncustomerName = " + customerName + ", \ntotalBill = " + totalBill
				+ ", \nnumberOfUnitsConsumed = " + numberOfUnitsConsumed + ", \nareaCode = " + areaCode + "\n";
	}

	
}
