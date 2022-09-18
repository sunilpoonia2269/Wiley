package come.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo2 {

	public static void main(String[] args) {
		LocalDateTime instance = LocalDateTime.now();
		System.out.println(instance);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm");
		
		String formattedDateTime = formatter.format(instance);
		
		System.out.println(formattedDateTime);
		
		

	}

}
