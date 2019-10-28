package luokka4;

/* Tehdään luokka Kieli, johon voi tallentaa kielen nimiä, sekä
 * niistä käytettäviä koodeja.'
 * On olemassa myös maa ja sillä omat standardit kielet sekä kielikoodit
 * nimi		iso639-1	iso639-2
 * Finnish	fi			fin
 * Swedish	sv			swe
 * French	fr			fra
 */
public class Kieli {
	private String nimi;
	private String koodi1; //ISO639-1
	private String koodi2; //ISO639-2/T

	public Kieli() {
		
	}
	public Kieli(String nimi, String koodi1, String koodi2) {
		this.nimi = nimi;
		this.koodi1 = koodi1;
		this.koodi2 = koodi2;
	}
	
	public String toString() {
		return "Nimi: " + nimi + " iso639-1: " + koodi1 + " iso639-2: " + koodi2;
	}
}

