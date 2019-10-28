package week2;

import java.util.Scanner;

public class Harj2_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int luku = 0;
		
		
		try {
			while (true) {
				System.out.print("Anna kokonaisluku (Lopetus syöttämällä muuta): ");
				luku = in.nextInt();
				if (luku == 0) {
					System.out.println("Luku oli nolla.");
				}
				else if (luku % 2 == 0) {
					System.out.println("Luku oli parillinen.");
				}
				else {
					System.out.println("Luku oli pariton.");
				}
			}
		}

		catch (Exception e) {
			System.out.println("Ohjelma loppui!");
		}
		finally {
			in.close();
		}
	}

}
