package week5;

import java.text.NumberFormat;

/*
 * Versio 3
 * 
 * Versio 1: Metodeista puutuu tarkistukset
 * Versio 2: Metodit korjattu ja lisätty niitä lisää
 * Versio 3: Lisätty palkka ja lainanlyhennes metodit
 */
public class Tili2 {
	
	private static final double KORKO = 0.045;  // Korkotaso 4.5%
	private static final double PALVELUMAKSU = 9.00;  // Kuukausittainen sopimusmaksu
	private static final double PALKKA = 552.33;
	private static final double LYHENNYS = 44.89; 

	private long tilinumero;
	private double saldo;
	private String nimi;

	public Tili2() {
		
	}
	
	public Tili2(String nimi, long tilinumero, double saldo) {
		this.nimi = nimi;
		this.tilinumero = tilinumero;
		this.saldo = saldo;
	}
	
	// kasvattaa saldoa summalla
	public boolean tallenna(double talletus) {
		if (talletus > 0) {
			saldo += talletus;
			return true;
		}
		return false;
	}
	
	// vähentää saldoa summalla
	public boolean nosto(double poisto) {
		if(poisto > 0 && poisto <= saldo) {
			saldo -= poisto;
			return true;
		}
		return false;
	}

	public static boolean teeTilisiirto(double summa, Tili2 lahde, Tili2 kohde) {
		if(summa > 0 && lahde.getSaldo() >= summa) {
			lahde.nosto(summa);
			kohde.tallenna(summa);
			return true;
		}
		return false;
	}

	// laskee saldolle koron ja lisää sen saldoon
	public void laskeKorko () {
		saldo += saldo * KORKO;
	}
	
	// vähentää salodosta palvelumaksun
	public void palvelumaksu () {
		saldo -= PALVELUMAKSU;
	}

	public boolean palkka() {
		return this.tallenna(PALKKA);
	}
	
	public boolean lainanlyhennys() {
		return this.nosto(LYHENNYS);
	}
	// palauttaa tilin saldon
	public double getSaldo ()  {
		return this.saldo;
	}
	
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return tilinumero + "\t" + nimi + "\t" + fmt.format(saldo) + "\n";

//		return "Omistaja: " + nimi + ", Tilinumero: " + tilinumero + ", Saldo: " + saldo;
	}

}
