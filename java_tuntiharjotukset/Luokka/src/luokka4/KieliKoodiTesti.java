package luokka4;
/* On olemassa myös maa ja sillä omat standardit kielet sekä kielikoodit
* nimi		iso639-1	iso639-2
* Finnish	fi			fin
* Swedish	sv			swe
* French	fr			fra
*/
public class KieliKoodiTesti {

	public static void main(String[] args) {

		Kieli fi = new Kieli("Finnish", "fi", "fin");
		Kieli sv = new Kieli("Swedish", "sv", "swe");
		Kieli fr = new Kieli("French", "fr", "fra");
		// Kuinka voidaan tallentaa oliotaulukkoon
		
		Kieli[] kielet = new Kieli[3];
		
		kielet[0] = fi;
		kielet[1] = sv;
		kielet[2] = fr;
		
		for (Kieli k: kielet) {
			System.out.println(k);
		}
	}

}
