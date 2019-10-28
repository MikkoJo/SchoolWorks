package week8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Kalalista implements KalalistaInterface, Serializable {

	private static final long serialVersionUID = -5499119958349132256L;
	private ArrayList<Kala> kalat;

	public Kalalista() {
		kalat = new ArrayList<>();
	}

	public Kalalista(ArrayList<Kala> kalat) {
		this.kalat = kalat;
	}

	public ArrayList<Kala> get() {
		// palauttaa kalalistan
		return kalat;
	}

	public void lisaa(Kala kala) {
		// lisää uuden kalan
		kalat.add(kala);
	}

	public void lisaa(String laji, String kalastaja, int paino, int pituus) {
		kalat.add(new Kala(laji, kalastaja, paino, pituus));
	}

	public void poista(int indeksi) {
		// poistaa kalan paikasta
		if (indeksi < kalat.size() && indeksi >= 0)
			kalat.remove(indeksi);
	}

	public void jarjesta() {
		// Järjestäminen painon mukaan
		Collections.sort(kalat, new PainoComparator());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Kala kala : kalat) {
			sb.append(kala + "\n");
		}
		return sb.toString();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
