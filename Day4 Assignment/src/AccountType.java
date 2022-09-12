
public enum AccountType {
	
	SAVINGS(500), CURRENT(1000);
	private double minBalance;
	
	public double getMinBalance() {
		return minBalance;
	}

	private AccountType(double minBalance) {
		this.minBalance = minBalance;
	}

}
