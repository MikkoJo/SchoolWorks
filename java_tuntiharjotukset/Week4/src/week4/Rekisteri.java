package week4;

import java.io.Serializable;
import java.util.ArrayList;

public class Rekisteri implements Serializable{
	private static final long serialVersionUID = -371065838679490802L;

	private ArrayList<Henkilo> henkilot = null;
	
	public Rekisteri() {
		this.henkilot = new ArrayList<>();
	}
	public int palautaHenkilomaara() {
		return henkilot.size();
	}

	public Henkilo palautaHenkilo(int index) {
		try {
			return henkilot.get(index);
		}
		
		catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

	public void lisaaHenkilo(Henkilo henk) {
		this.henkilot.add(henk);
	}

	public Henkilo etsiHenkilo(String sotu) {

		for (int i = 0; i < henkilot.size(); i++) {
			if (sotu.equals(henkilot.get(i).palautaSotu())) {
				return henkilot.get(i);
			}
		}
		return null;
	}
}
