package week2;

import java.util.Scanner;

public class Harj2_4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double first = 0, second = 0, third = 0;
		
		System.out.print("Anna eka luku: ");
		first = in.nextDouble();
		System.out.print("Anna toka luku: ");
		second = in.nextDouble();
		System.out.print("Anna kolmas luku: ");
		third = in.nextDouble();

		System.out.println("Lukujen keskiarvo: " + ((first + second + third) / 3));
	}

}
