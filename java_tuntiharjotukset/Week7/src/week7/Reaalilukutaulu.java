package week7;

import java.util.ArrayList;

public class Reaalilukutaulu implements TauluRajapinta {

	private ArrayList<Double> luku = new ArrayList<Double>();
	
	public Reaalilukutaulu() {}
	

	public boolean lisaa(double uusi) { // lisää uuden alkion taulun loppuun
		if(!Double.isNaN(uusi)) {
			luku.add(uusi);
			return true;
		}
		
		return false;
	}
	public boolean poista() {      // poistaa viimeisen alkion taulusta
		if(luku.isEmpty()) {
			return false;
		}
		luku.remove(luku.size() - 1);
		return true;
	}
	public void tulosta() {        // Tulostaa kaikki taulun alkiot
		for(double d:luku) {
			System.out.println(d);
		}
	}

}
