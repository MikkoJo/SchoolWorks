package week5;

public class Harj5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tili2 tili1 = new Tili2("Kake K", 123456, 1024.56);
		Tili2 tili2 = new Tili2("Sankari S", 568444566, 5.5);
		//Tili2 tili3 = new Tili2("Liisa P", 45454513, 1000);

		if (tili1.tallenna(25.85)) {
			System.out.println("Talletus onnistui.\t" + tili1);
		}
		
		if(tili1.tallenna(-33.50)) {
			System.out.println("Negatiivinen tallennus epäonnistui" + tili1);
		}

		if (tili2.tallenna(500.00)) {
			System.out.println("Talletus onnistui.\t" + tili2);
		}

		if (tili2.nosto(355.75)) {
			System.out.println("Nosto onnistui.\t\t" + tili2);
		}

		if (!tili2.nosto(-155.75)) {
			System.out.println("Negatiivinen nosto epäonnistui.\t\t" + tili2);
		}

		if (tili2.tallenna(230.75)) {
			System.out.println("Talletus onnistui.\t" + tili2);
		}

		if (!tili2.nosto(22155.75)) {
			System.out.println("Ylisuuri nosto epäonnistui.\t\t" + tili2);
		}

		if (Tili2.teeTilisiirto(333.33, tili1, tili2)) {
			System.out.println("Tilisiirto onnistui.\t" + tili1 + ", " + tili2);  
		}

		if (!Tili2.teeTilisiirto(3333.33, tili1, tili2)) {
			System.out.println("Tilisiirto epäonnistui.\t" + tili1 + ", " + tili2 );  
		}

		tili1.laskeKorko();
		tili2.laskeKorko();

		if (tili2.palkka()) {
			System.out.println("Palkan maksu onnistui.\t" + tili2);
		}
		
		if (tili2.lainanlyhennys()) {
			System.out.println("Lainan lyhennys onnistui.\t" + tili2);
		}

		if (tili2.nosto(1238.75)) {
			System.out.println("Nosto onnistui.\t\t" + tili2);
		}

		if (!tili2.lainanlyhennys()) {
			System.out.println("Lainan lyhennys epäonnistui.\t" + tili2);
		}

		System.out.println("Loppusaldot.\n" + tili1 + tili2 );  
	}

}
