
// Package statement should be on top and import statement below that
package come.datetime;
import java.util.Date;
import java.util.Calendar;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Demo1 {

	public static void main(String[] args) {
//		Date date = new Date();
//		System.out.println(date);
//		
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(date);
//		
//		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//		System.out.println(calendar.get(Calendar.YEAR));
//		
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		LocalDate ja1 = LocalDate.of(2021, Month.FEBRUARY, 1);
		System.out.println(ja1);
		
		System.out.println(LocalDate.parse("2021-03-01"));
		
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		
		LocalDate ld = LocalDate.parse("01-Apr-2021", dateFormatter);
		System.out.println(ld);
		
		
	}

}
