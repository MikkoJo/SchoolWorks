package week7;

public class Tyontekija {
	private String nimi;
	private String asema;
	private double palkka;
	
	Tyontekija() {}

	Tyontekija(String nimi, String asema, double palkka) {
		this.nimi = nimi;
		this.asema = asema;
		this.palkka = palkka;
	}
	
	public String getNimi() {
		return nimi;
	}
	
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
	public String getAsema() {
		return asema;
	}
	
	public void setAsema(String asema) {
		this.asema = asema;
	}
	
	public double getPalkka() {
		return palkka;
	}
	
	public void setPalkka(double palkka) {
		this.palkka = palkka;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + this.nimi + " Asema: " + this.asema + " Palkka: " + this.palkka;
	}
}
