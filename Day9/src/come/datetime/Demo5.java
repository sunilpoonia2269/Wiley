package come.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Demo5 {
	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		DayOfWeek dayOfWeek = today.getDayOfWeek();
		
		System.out.println(dayOfWeek);
		System.out.println(dayOfWeek.getValue());
		
		System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.US));
		
		System.out.println(dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.getDefault()));
	}

}
