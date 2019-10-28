package week8;

public class SanakirjaTest {

	public static void main(String args[]) {

		Sanakirja tietokonetermit = new Sanakirja();
		tietokonetermit.lisaa("object", "olio");
		tietokonetermit.lisaa("computer", "tietokone");
		tietokonetermit.lisaa("program", "ohjelma");
		tietokonetermit.lisaa("programming", "ohjelmointi");
		tietokonetermit.lisaa("system", "järjestelmä");
		tietokonetermit.lisaa("compiler", "kääntäjä");
		tietokonetermit.lisaa("linker", "linkittäjä");
		tietokonetermit.lisaa("interpreter", "tulkki");
		tietokonetermit.lisaa("byte-code", "tavukoodi");
		tietokonetermit.lisaa("execute", "suorittaa");
		tietokonetermit.lisaa("execute", "ajaa");

		System.out.println("Haettiin: object =  " + tietokonetermit.etsi("object"));
		System.out.println("Haettiin: execute = " + tietokonetermit.etsi("execute"));

		System.out.println("*".repeat(70));
		tietokonetermit.tulosta();
		
		System.out.println("*".repeat(70));
		System.out.println("Poistettiin: compiler = " + tietokonetermit.poista("compiler"));
		System.out.println("Poistettiin: interpreter = " + tietokonetermit.poista("interpreter"));

		System.out.println("*".repeat(70));
		tietokonetermit.tulosta();
		
		System.out.println("*".repeat(30) + "Järjestetty" + "*".repeat(30));
		tietokonetermit.tulostaJarjestyksessa();

	}

}
