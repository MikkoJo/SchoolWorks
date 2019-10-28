package week3;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Harj3_5b {
	public static void main(String[] args) {
		
		int[] count = new int[6];
		Scanner sc = new Scanner(System.in);
		int number = 0;
		boolean cont = true;

		while(cont) {
			System.out.print("Anna uusi arvosa (ei numero lopettaa)>");
			try {
				number = sc.nextInt();
				if (number >= 0 && number <= 5) {
					count[number]++;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("LOPETUS: Muu  kuin numero");
				cont = false;
				sc.close();
			}
		} 
		
		System.out.println("*** Tulostetaan löydet luvut***");
		for (int j = 0; j < count.length; j++) {
			System.out.print(j + ":" + count[j] + " | ");
			for (int k= 0 ; k < count[j]; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
