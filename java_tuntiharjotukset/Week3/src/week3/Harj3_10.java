package week3;

import java.util.Date;

public class Harj3_10{

	public static void main(String[] args) {

		Date day1 = new Date();
		Date day2 = new Date();
		int ero = 0;
		day2.setMinutes(2);
		
		System.out.println(day2.before(day1));
		System.out.println(day2.after(day1));
		
		ero = day1.compareTo(day2);
		
		if(ero == 0) {
			System.out.println("Aika: " + day1 + " == " + day2); 
		}
		if(ero < 0) {
			System.out.println("Aika: " + day1 + " << " + day2); 
		}
		if(ero > 0) {
			System.out.println("Aika: " + day1 + " >> " + day2); 
		}
	}

}
