package vko16;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class RahanLaskenta {
	private BigDecimal raha1;
	private BigDecimal raha2;
	private int[] kertoimet;
	private List<String> tekstit;

	private final static RoundingMode PYORISTYS_MOODI = RoundingMode.HALF_EVEN;
//	private final static int PYORISTYS_MOODI = BigDecimal.ROUND_HALF_EVEN;
	private final static int DESIMAALIT = 2;
	private BigDecimal SATA = new BigDecimal("100");
	private BigDecimal KAKSI = new BigDecimal("2");

	public RahanLaskenta(BigDecimal r1, BigDecimal r2, int kerroin1, int kerroin2, int kerroin3,
			String teksti1, String teksti2) {
		raha1 = pyorista(r1);
		raha2 = pyorista(r2);
		kertoimet = new int[3];
		kertoimet[0] = kerroin1;
		kertoimet[1] = kerroin2;
		kertoimet[2] = kerroin3;
		tekstit = new ArrayList<String>();
		tekstit.add(teksti1);
		tekstit.add(teksti2);
	}

	public List<String> getTekstit() {
		return tekstit;
	}
	
	public void setTekstit(List<String> tekstit) {
		this.tekstit = tekstit;
	}
	
	public int[] getKertoimet() {
		return kertoimet;
	}

	public BigDecimal getSumma() {
		return raha1.add(raha2);
	}

	public BigDecimal getEro() {
		return raha2.subtract(raha1);
	}

	public BigDecimal getKeskiarvo() {
		return getSumma().divide(KAKSI, PYORISTYS_MOODI);
	}

	public BigDecimal getProsentit(BigDecimal lisaprosentti) {
		BigDecimal tulos = raha1.multiply(lisaprosentti);
		tulos = tulos.divide(SATA, PYORISTYS_MOODI);
		return pyorista(tulos);
	}
	
	public BigDecimal getVertailuArvo() {
		return raha1.divide(raha2);
	}

	public BigDecimal getProsentitLisatty(BigDecimal lisaprosentti) {
		return getProsentit(lisaprosentti).add(raha1);
	}

	private BigDecimal pyorista(BigDecimal luku) {
		return luku.setScale(DESIMAALIT, PYORISTYS_MOODI);
	}

	// tulostetan rahayksikkönä
	public String tulostaDollareina() {
		NumberFormat formaatti = NumberFormat.getCurrencyInstance(Locale.US);
		double raha = raha1.doubleValue();
		String dollareina = formaatti.format(raha);
		return tekstit.get(0) + dollareina;
	}

	// tulostetan rahayksikkönä
	public String tulostaEuroina() {
		// NumberFormat formaatti =
		// NumberFormat.getCurrencyInstance(Locale.GERMAN);
		NumberFormat formaatti = NumberFormat.getCurrencyInstance(Locale.GERMANY); // Locale.JAPAN
		double raha = raha1.doubleValue();
		String euroina = formaatti.format(raha);
		return tekstit.get(1) + euroina;
	}

}
