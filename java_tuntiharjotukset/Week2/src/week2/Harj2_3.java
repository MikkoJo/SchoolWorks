package week2;

import java.util.Scanner;

public class Harj2_3 {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int eka = 0, toka = 0;
			
			System.out.print("Anna eka luku: ");
			eka = in.nextInt();
			System.out.print("Anna toka luku: ");
			toka = in.nextInt();
			System.out.println("Summa: " + eka + " + " + toka + " = " + (eka + toka));
			System.out.println("Tulo: " + eka + " * " + toka + " = " + (eka * toka));
			System.out.println("Erotus: " + eka + " - " + toka + " = " + (eka - toka));
	}
			
}
