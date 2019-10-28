package week3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Harj3_11 {

	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		
		int year = cal.get(Calendar.YEAR);
		int month= cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		
		
		
		System.out.printf("Aika: %d:%d:%d", hour, minute, second);
	}
}
