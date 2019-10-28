package week7;

public class Harj7_1Test {

	public static void main(String[] args) {

		Tyontekija tyontekija = new Tyontekija("Paavo Postinkantaja", "Postimies", 2400.0);
		Johtaja johtaja = new Johtaja("Pekka Posse", "Henkilöstöpäällikkö", 6050.0 , "Skoda Octavia", 9500.0);
		
		System.out.println(tyontekija);
		System.out.println(johtaja);
		
		tyontekija.setAsema("Postilogistiikan valvoja");
		tyontekija.setPalkka(3.999);
		johtaja.setPalkka(6400.0);
		johtaja.setAuto("BMW");
		johtaja.setBonus(12000.2);

		System.out.println(tyontekija);
		System.out.println(johtaja);
	}

}
