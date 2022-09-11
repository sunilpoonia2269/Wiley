
public class Date {
	private int dd;
	private int mm;
	private int yy;
	
	
	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}


	public int getDd() {
		return dd;
	}


	public void setDd(int dd) {
		this.dd = dd;
	}


	public int getMm() {
		return mm;
	}


	public void setMm(int mm) {
		this.mm = mm;
	}


	public int getYy() {
		return yy;
	}


	public void setYy(int yy) {
		this.yy = yy;
	}
	
	
	public String displayDate() {
		return "Date is -> " + this.dd + "-" + this.mm + "-" + this.yy;
	}
	
	public boolean checkDate() {
		if(this.mm > 12 || this.dd > 31) return false;
		
		int validDays;
		
		if(this.yy % 4 == 0) {
			validDays = numberOfDaysInMonth(true);
		}else {
			validDays = numberOfDaysInMonth(false);
		}
		
		if(this.dd > validDays) return false;
		return true;
	}
	
	/// Internal method to get number of days in a perticular month
	private int numberOfDaysInMonth(boolean isLeapYear) {
		switch(this.mm) {
		case 1 :
		case 3 :
		case 5 : 
		case 7 : 
		case 8 : 
		case 10 :
		case 12 : 
			return 31;
			
		case 2 :
			return isLeapYear ? 29 : 28;
		default : 
			return 30;
		}
	}
	

}
