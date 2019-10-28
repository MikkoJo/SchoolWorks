package week2;

import java.util.Scanner;

public class Harj2_9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String mJono = null;
		System.out.print("Anna merkkijono: ");
		mJono = in.nextLine();
		
		in.close();
		for (int i = 0; i < mJono.length(); i++) {
			System.out.println(i + ": " + mJono.charAt(i));
		}
	
	}

}
