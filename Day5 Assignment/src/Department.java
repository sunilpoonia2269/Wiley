
public enum Department {

	MANAGEMENT("Management"), SERVICE("Service"), DEVELOPMENT("Development"), SUPPORT("Support"), FINANCE("Finance");
	
	private String displayName;
	
	private Department(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public String toString() {
		return this.displayName;
	}
}
