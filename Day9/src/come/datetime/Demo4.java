package come.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

public class Demo4 {

	public static void main(String[] args) {
		LocalTime start = LocalTime.of(10, 2, 20);
		LocalTime end = LocalTime.of(11, 2, 8);
		
		Duration duration = Duration.between(start, end);
		System.out.println(duration);
		
		long d = Duration.between(start, end).toMillis();
		System.out.println(d);
		
		Instant startInstant = Instant.now();
		System.out.println(startInstant);
		

	}

}
