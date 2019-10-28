package kesa;

public class KissaKoiraTest {
	public static void main(String[] args) {
		Kissa katti = new Kissa("Katti");
		Koira musti = new Koira("Musti");
		System.out.println(katti + "\n" + musti);
		musti.jahtaa(katti);
		katti.karkuun(musti);
	}

}
