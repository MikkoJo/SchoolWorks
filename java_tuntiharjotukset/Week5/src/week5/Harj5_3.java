package week5;

public class Harj5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tili tili1 = new Tili("Kake K", 123456, 1024.56);
		Tili tili2 = new Tili("Sankari S", 568444566, 5.5);
		Tili tili3 = new Tili("Liisa P", 45454513, 1000);

		System.out.print(tili1);

		tili1.tallenna(25.85);
		System.out.println("Talletetu 25.85\n");
		System.out.print(tili1);

		tili1.laskeKorko();
		System.out.println("Korko laskettu\n" + tili1);

		tili1.tallenna(-33.50);
		System.out.println("Talletetu -33.50\n" + tili1);

		System.out.println(tili2);
		tili2.nosto(20.3);
		System.out.println("Nostettu 20.30\n" + tili2);

		tili2.tallenna(230.75);
		System.out.println("Talletetu 230.75\n" + tili2);

		tili2.palvelumaksu();
		System.out.println("Maksettu palvelumaksu\n" + tili2);

		System.out.println(tili3);
		tili3.laskeKorko();
		System.out.println("Korko laskettu\n" + tili3);

	}

}
