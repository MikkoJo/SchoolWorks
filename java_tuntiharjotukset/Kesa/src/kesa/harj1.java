package kesa;

import java.util.Scanner;

public class harj1 {

	public static void main(String[] args) {

		double kulutus = 7.5;
		double hinta = 1.582;
		double matka = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Anna matka: ");
		matka = in.nextDouble();
		in.close();
		
		double kokKulutus = (matka / 100) * kulutus;
		double kokHinta = kokKulutus * hinta;
		
		System.out.printf("Bensan kulutus on  %.2f litraa.\n", kokKulutus);
//		System.out.println("Matkalle tulee hintaa " + kokHinta + " euroa.");
		System.out.printf("Matkalle tulee hintaa %.2f euroa.\n", kokHinta);
	}

}
