package week2;

import java.util.Scanner;

public class Harj2_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] luvut = new int[5];

		// Do this right
		try {
			System.out.print("Anna eka luku: ");
			luvut[0] = in.nextInt();
			System.out.print("Anna toka luku: ");
			luvut[1] = in.nextInt();
			System.out.print("Anna kolmas luku: ");
			luvut[2] = in.nextInt();
			System.out.print("Anna neljäs luku: ");
			luvut[3] = in.nextInt();
			System.out.print("Anna viides luku: ");
			luvut[4] = in.nextInt();
	
			for(int i = luvut.length-1; i >= 0; i--) {
				System.out.println(luvut[i]);
			}
		
		}
		
		catch (Exception e) {
			System.out.println("Virheellinen syöte!!!!!");
		}
		

	}
}
