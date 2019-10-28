package week8;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sanakirja implements SanakirjaInterface {

	private Map<String, String> sanakirja;
	
	public Sanakirja() {
		sanakirja = new HashMap<>();
	}
	
	@Override
	public void lisaa(String eng, String fin) {
		sanakirja.put(eng, fin);
	}

	@Override
	public String etsi(String hakusana) {
		return sanakirja.get(hakusana);
	}

	@Override
	public String poista(String haettava) {
		return sanakirja.remove(haettava);
	}

	@Override
	public void tulosta() {
		tulosta(sanakirja);
	}
	
	public void tulosta(Map<String, String> tulostettava) {
		for(Map.Entry<String, String> entry: tulostettava.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}

	public void tulostaJarjestyksessa() {
//		TreeMap<String, String> tulostus = new TreeMap<>(sanakirja);
		tulosta(new TreeMap<String, String>(sanakirja));
		}
		
	
	
//	public voi

}
