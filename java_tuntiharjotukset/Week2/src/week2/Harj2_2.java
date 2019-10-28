package week2;

import java.util.Scanner;

//import java.util.Scanner;

public class Harj2_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] luvut = new int[3];
		int max = 0;
		
		System.out.print("Anna eka luku: ");
		luvut[0] = in.nextInt();
		System.out.print("Anna toka luku: ");
		luvut[1] = in.nextInt();
		System.out.print("Anna kolmas luku: ");
		luvut[2] = in.nextInt();
		
		for (int i = 0; i < 3; i++) {
			if (max < luvut[i]) {
				max = luvut[i];
			}
		}
		System.out.println("Suurin luku: " + max);
	}

}
