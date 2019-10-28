package harjoitukset;

//import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.stream.IntStream;

import org.junit.Test;

public class LocalDateTimeTest {

	@Test
	public void monthDaysTest() {
		LocalDateTime endDate = 
				LocalDateTime.
				of(LocalDate.of(2019, Month.NOVEMBER, 1), LocalTime.of(0, 0, 0));
//		LocalDateTime startDate = 
//				LocalDateTime.
//				of(LocalDate.of(2019, endDate.minusDays(1).getMonthValue(), 1), LocalTime.of(0, 0, 0));
		// Toinen vaihtoehto
		LocalDateTime startDate = endDate.minus(Period.ofMonths(1));
		System.out.println("Looping time from " + startDate + " to " + endDate);
		IntStream.range(startDate.getDayOfMonth(), endDate.minusDays(1).getDayOfMonth())
			.forEach(d -> System.out.println(LocalDate.of(2019, Month.OCTOBER, d) +
			", weekday " + LocalDate.of(2019, Month.OCTOBER, d).getDayOfWeek()));
	}

}
