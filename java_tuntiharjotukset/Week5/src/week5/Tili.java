package week5;

import java.text.NumberFormat;


/*
 * Versio 1
 * 
 * Versio 1: Metodeista puutuu tarkistukset
 */
public class Tili {
	
	private static final double KORKO = 0.045;  // Korkotaso 4.5%
	private static final double PALVELUMAKSU = 9.00;  // Kuukausittainen sopimusmaksu

	private long tilinumero;
	private double saldo;
	private String nimi;

	public Tili() {
		
	}
	
	public Tili(String nimi, long tilinumero, double saldo) {
		this.nimi = nimi;
		this.tilinumero = tilinumero;
		this.saldo = saldo;
	}
	
	// kasvattaa saldoa summalla
	public void tallenna(double talletus) {
		saldo += talletus;
	}
	// vähentää saldoa summalla
	public void nosto(double poisto) {
		saldo -= poisto;
	}
	// laskee saldolle koron ja lisää sen saldoon
	public void laskeKorko () {
		saldo += saldo * KORKO;
	}
	
	// vähentää salodosta palvelumaksun
	public void palvelumaksu () {
		saldo -= PALVELUMAKSU;
		
	}
	// palauttaa tilin saldon
	public double getSaldo ()  {
		return this.saldo;
		
	}
	
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
//		String paluu = String.format(tilinumero + "\t" + nimi + "\t%.2f\n", saldo);
//		return "Omistaja: " + nimi + ", Tilinumero: " + tilinumero + ", Saldo: " + saldo;
//		return paluu;
		return tilinumero + "\t" + nimi + "\t" + fmt.format(saldo);
	}

}
