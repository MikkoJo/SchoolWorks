package week8;

import java.io.Serializable;
import java.util.Comparator;

public class Kala implements Serializable {

	private static final long serialVersionUID = -2576154363964127399L;
	private String laji;
	private String kalastaja;
	private int paino;
	private int pituus;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Kala() {}

	public Kala(String laji, String kalastaja, int paino, int pituus) {
		this.laji = laji;
		this.kalastaja = kalastaja;
		this.paino = paino;
		this.pituus = pituus;
	}

	public String getLaji() {
		return laji;
	}

	public void setLaji(String laji) {
		this.laji = laji;
	}

	public String getKalastaja() {
		return kalastaja;
	}

	public void setKalastaja(String kalastaja) {
		this.kalastaja = kalastaja;
	}

	public int getPaino() {
		return paino;
	}

	public void setPaino(int paino) {
		this.paino = paino;
	}

	public int getPituus() {
		return pituus;
	}

	public void setPituus(int pituus) {
		this.pituus = pituus;
	}
	
	@Override
	public String toString() {
		return kalastaja +": " + laji + ", " + paino + "g, " + pituus + "cm";
	}
	
	
}

class PainoComparator implements Comparator<Kala> {

	@Override
	public int compare(Kala o1, Kala o2) {
		return o2.getPaino() - o1.getPaino();
	}

}

