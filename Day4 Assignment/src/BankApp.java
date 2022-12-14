
public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount bankAccount1 = new BankAccount(101, "Sunil Poonia", 1000, AccountType.SAVINGS);
		bankAccount1.withDrawAmount(713.0);
		BankAccount bankAccount2 = new BankAccount(102, "Mukesh Bhai", 200000, AccountType.CURRENT);
		BankAccount bankAccount3 = new BankAccount(103, "John Doe", 500, AccountType.SAVINGS);
		
		bankAccount2.depositAmount(3000);
		bankAccount3.withDrawAmount(10);
		
		System.out.println(BankAccount.displayTotalBalance());
		
		bankAccount1.depositAmount(40000);
		
		bankAccount3.depositAmount(270);
		
		bankAccount1.depositAmount(40000);
		
		BankAccount bankAccount4 = new BankAccount(104, "Gautam Bhai", 500000, AccountType.CURRENT);
		bankAccount4.withDrawAmount(210000);
		bankAccount2.depositAmount(857000);
		
		System.out.println(BankAccount.displayTotalBalance());
		
		
	}

}
