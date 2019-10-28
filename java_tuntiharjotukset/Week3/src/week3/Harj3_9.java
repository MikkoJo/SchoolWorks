package week3;

import java.util.Date;

public class Harj3_9 {

	public static void main(String[] args) {

		Date day1 = new Date();
		Date day2 = new Date();
		int ero = 0;
		day2.setHours(2);
		
		ero = day1.compareTo(day2);
		
		if(ero == 0) {
			System.out.println("Aika: " + day1 + " == " + day2); 
		}
		if(ero < 0) {
			System.out.println("Aika: " + day1 + " >> " + day2); 
		}
		if(ero > 0) {
			System.out.println("Aika: " + day1 + " << " + day2); 
		}
	}

}
