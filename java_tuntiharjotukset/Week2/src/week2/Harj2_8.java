package week2;

import java.util.Scanner;

public class Harj2_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inputSeconds = 0;
		int h = 0, m = 0, s = 0;
		
		System.out.print("Anna sekunnit: ");
		inputSeconds = in.nextInt();

		
		in.close();
		
		h = inputSeconds / 3600;
		m =  (inputSeconds % 3600) / 60;
		s = (inputSeconds % 3600) % 60; 
//		m = (inputSeconds - h * 3600) / 60;
//		s = (inputSeconds - (h * 3600 + m * 60)); 
		System.out.println("Asetit ajan: ");
		System.out.println("Tunnit: " + h);
		System.out.println("Minuutit: " + m);
		System.out.println("Sekunnit: " + s);
		
	}

}
