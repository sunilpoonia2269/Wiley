package come.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Demo3 {

	public static void main(String[] args) {
		LocalDate startLocalDate = LocalDate.of(2020, 03, 12);
		LocalDate endDate = LocalDate.of(2020, 07, 19);
		
		Period periodBetween = Period.between(startLocalDate, endDate);
		
		System.out.println(periodBetween);
		
		System.out.println(periodBetween.getDays());
		System.out.println(periodBetween.getMonths());
		

	}

}
