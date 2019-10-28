package week4;

public class Harj4_4 {

	public static void main(String[] args) {
		
		Radio radio = new Radio();
		
		System.out.println("Radio Päälle");
		radio.asetaRadionTila(true);
		System.out.print("Radion tila: ");
		System.out.println(radio.onkoPaalla());

		System.out.print("Volume: " + radio.mikaVoimakkuus() + "\n");
		System.out.println("Ääni kovalle");
		radio.asetaAanenVoimakkuus(9);
		System.out.print("Volume: " + radio.mikaVoimakkuus() + "\n");
		System.out.println("Ääni ulos asteikolta");
		radio.asetaAanenVoimakkuus(91);
		System.out.print("Volume: " + radio.mikaVoimakkuus() + "\n");

		System.out.print("Taajuus: " + radio.mikaTaajuus() + "\n");
		System.out.println("Taajuuden säätö");
		radio.asetaTaajuus(22030.2);
		System.out.print("Taajuus: " + radio.mikaTaajuus() + "\n");
		System.out.println("Taajuus ulos asteikolta");
		radio.asetaTaajuus(26000.1);
		System.out.print("Taajuus: " + radio.mikaTaajuus() + "\n");

		System.out.println("Radio pois päältä");
		radio.asetaRadionTila(false);
		System.out.print("Radion tila: ");
		System.out.println(radio.onkoPaalla());
	}
	
}

