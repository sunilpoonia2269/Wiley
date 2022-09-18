package com.bank;

class BankAccount {
	
	private int accountId;
	private String accountHolderName;
	private AccountType accountType;
	
	public BankAccount(int accountId, String accountHolderName, AccountType accountType) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
	}

	public int getAccountId() {
		return accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}
	
	
	double calculateTotalInterest(double amount, int years) throws DepositAmountException {
		if(amount < 0) throw new DepositAmountException();
		//A = P (1+rt)
		double totalAmount = amount *(1 + (accountType.getInterestRate()/100 * years));
		
		return totalAmount - amount;
	}

}
