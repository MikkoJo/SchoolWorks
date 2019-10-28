package kesa;

import java.util.Arrays;

public class Tyontekija {
	private String nimi;
	private Osoite osoitteet[];
	private Puhelinnumero puhelinnumerot[];
	private int osoiteIndex = 0;
	private int puhnoIndex = 0;
	
	public Tyontekija() {
	}

	public Tyontekija(String nimi) {
		this.nimi = nimi;
		this.osoitteet = new Osoite[3];
		this.puhelinnumerot = new Puhelinnumero[3];
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public void lisaaOsoite(Osoite os) {
		if(osoiteIndex < 3) {
			osoitteet[osoiteIndex] = os;
			osoiteIndex++;
		}
		
	}

	public void lisaaPuhelinnumero(Puhelinnumero puhno) {
		if(puhnoIndex < 3) {
			puhelinnumerot[puhnoIndex] = puhno;
			puhnoIndex++;
		}
	}

	@Override
	public String toString() {
		return "Tyontekija\n[nimi=" + nimi + ",\nosoitteet=" + Arrays.toString(osoitteet) +
				",\npuhelinnumerot=" + Arrays.toString(puhelinnumerot) + "\n]";
	}
	
	
	
}
