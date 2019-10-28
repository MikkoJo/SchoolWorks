package week2;

import java.util.Scanner;

/**
 * 
 * @author Mikko
 *
 */
public class Harj2_6 {

	public static void main(String[] args) {
		
		String nimet = "Aku;Mikki;Roope;Hessu;Pluto;Iines";
		Scanner in = new Scanner(nimet);
		
		String[] osat = in.nextLine().split(";");

		in.close();

		for (int i = 0; i < osat.length; i++) {
			System.out.println(osat[i]);
		}
		Scanner lukija = new Scanner(nimet);
		lukija.useDelimiter(";");
		while (lukija.hasNext()) {
			System.out.println(lukija.next());
		}
		
	}

}
