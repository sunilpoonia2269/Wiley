package com.bank;

public class BankApp {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(101, "Sunil", AccountType.SAVINGS);
		try {
			double intrest = account1.calculateTotalInterest(23000, 6);
			System.out.println("Your total interest will be : " + intrest);
		} catch (DepositAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BankAccount account2 = new BankAccount(102, "Madan", AccountType.CURRENT);
		
		try {
			double intrest = account2.calculateTotalInterest(-61000, 3);
			System.out.println("Your total interest will be : " + intrest);
		} catch (DepositAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
