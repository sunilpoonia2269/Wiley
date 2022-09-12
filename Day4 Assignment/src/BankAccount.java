
public class BankAccount {
	private int accountId;
	private String accountHolderName;
	private double openingBalance;
	private double currentBalance;
	private static double totalBalance;
	private AccountType accountType;
	
	public BankAccount(int accountId, String accountHolderName, double openingBalance, AccountType accountType) {
		super();
		if(accountType.getMinBalance() > openingBalance) throw new IllegalArgumentException();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.openingBalance = openingBalance;
		this.currentBalance = openingBalance;
		this.accountType = accountType;
		BankAccount.totalBalance = BankAccount.totalBalance + openingBalance;
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

	public double getOpeningBalance() {
		return openingBalance;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public static double getTotalBalance() {
		return totalBalance;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}


	public double withDrawAmount(double amount) {
		if(amount < 0) {
			System.out.println("Negative amount cannot be withdrawn");
			return this.currentBalance;
		}
		if(amount > this.currentBalance || accountType.getMinBalance() > (this.currentBalance - amount)) {
			System.out.println("Insufficient Funds");
			return this.currentBalance;
		}
		this.currentBalance = this.currentBalance - amount;
		BankAccount.totalBalance = BankAccount.totalBalance - amount;
		System.out.println(this.accountHolderName + " have withdrawn " + amount + " rupees. Remaining balance -> " + this.currentBalance);
		return this.currentBalance;
		
	}
	
	public double depositAmount(double amount) {
		if(amount < 0) {
			System.out.println("Negative amoutn cannot be deposited");
			return this.currentBalance;
		}
		this.currentBalance = this.currentBalance + amount;
		BankAccount.totalBalance = BankAccount.totalBalance + amount;
		System.out.println(this.accountHolderName +" have deposited " + amount + " rupees. Remaining balance -> " + this.currentBalance);
		
		return this.currentBalance;
	}
	
	public static String displayTotalBalance() {
		return "Total balance of bank is " + BankAccount.totalBalance + " Rupees";
	}

}
