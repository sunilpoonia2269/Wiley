
public class DateApp {
	
	public static void main(String[] args) {
		
		Date date = new Date(29, 2, 2020);
		if(date.checkDate()) {
			System.out.println(date.displayDate());
		}else {
			System.out.println("Date is not valid");
		}
	}

}
