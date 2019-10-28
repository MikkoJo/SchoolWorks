package kesa;

public class PisteSovellus {
	public static void main(String[] a) {
		tulostaPisteet();
		tulostaPisteetPoikkeukset();
	}

	static void tulostaPisteet() {
		Piste piste = new Piste();
		System.out.println(piste);
		piste.setPoint(21, 7);
		System.out.println(piste);

		Pikseli pikseli = new Pikseli(12, 5, 9);
		System.out.println(pikseli);
	}

	static void tulostaPisteetPoikkeukset() {
		Piste p1 = new Piste(4, 2);
		Piste p2 = null;

		try {
			p2 = (Piste) p1.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("** P1: **");
		System.out.println(p1);
		System.out.println("** P2: **");
		System.out.println(p2);
		System.out.println("\np1==p2: " + p1.equals(p2));
	}

}
