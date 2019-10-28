package week2;

import java.util.Scanner;

public class Harj2_12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arvaus = 0;
		int luku = (int)(Math.random() * 100) + 1;
		boolean oikein = false;
//		System.out.println(luku);

		do {
			System.out.print("Arvaa luku (1-100) (Luovuta antamalla negatiivinen luku): ");
			try {
				arvaus = in.nextInt();
			}
			catch (NumberFormatException e) {
				System.out.println("Virheellinen arvo");
				break;
			}
			if (arvaus < 0 || arvaus > 100){
				System.out.println("Luovutit");
				oikein = true;
			}
			else if (arvaus < luku) {
				System.out.println("Luku on suurempi.");
			}
			else if (arvaus > luku) {
				System.out.println("Luku on pienempi.");
			}
			else {
				System.out.println("Arvasit oikein!");
				oikein = true;
			}
			
		} while(!oikein); 

		
		
	}

}
