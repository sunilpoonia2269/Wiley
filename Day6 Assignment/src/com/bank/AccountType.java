package com.bank;

enum AccountType {
	
	SAVINGS(8.5), CURRENT(4);
	
	private double interestRate;
	
	private AccountType(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}
}
