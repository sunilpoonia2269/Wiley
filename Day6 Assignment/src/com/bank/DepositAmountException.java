package com.bank;

@SuppressWarnings("serial")
public class DepositAmountException extends Exception {

	private String message;

	
	public DepositAmountException() {
		super();
		this.message = "Deposit ampount exception";
	}


	public String getMessage() {
		return message;
	}


	@Override
	public String toString() {
		
		return "Amount cannot be negative";
	}

}
