package week2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Harj2_7 {

	private static final int SECOND = 0;
	private static final int MINUTE = 0;
	private static final int HOUR = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = 0, m = 0, s = 0;
		
		System.out.print("Annan tunnit: ");
		h = in.nextInt();

		System.out.print("Annan minuutit: ");
		m = in.nextInt();

		System.out.print("Annan sekunnit: ");
		s = in.nextInt();
		
		in.close();
		
		Calendar clock = Calendar.getInstance();
		//GregorianCalendar clock = (GregorianCalendar)Calendar.getInstance();

		clock.clear();
		clock.set(Calendar.HOUR, h);
		clock.set(Calendar.MINUTE, m);
		clock.set(Calendar.SECOND, s);
		
		// Weird, getTimeInMillis calculates time 2h before????
		// Thu Jan 01 00:00:00 EET 1970 is in -7200 seconds
		System.out.println("Asetit ajan: " + (clock.getTimeInMillis() / 1000 + 7200));
//		System.out.println("Asetit ajan: " + clock.getTime());
		
	}

}
