package week10;

import java.io.Serializable;

public class Henkilo implements Serializable {
	
	private static final long serialVersionUID = 8246792988076911441L;

	private String etunimi;
	private String sukunimi;
	private String sotu;
	
	Henkilo(String etunimi, String sukunimi, String sotu) {
		if (!checkID(sotu)) {
			throw new IllegalArgumentException ("Invalid sotu");
		}
		else {
			this.sotu = sotu;
		}
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
	}
	
	Henkilo () {
		
	}
	
	public String palautaSotu() {
		return this.sotu;
	}

	public String palautaEtunimi() {
		return this.etunimi;
	}

	public String palautaSukunimi() {
		return this.sukunimi;
	}

	public String palautaTiedot() {
		return this.etunimi + " " + this.sukunimi + " " + this.sotu;
		
	}

	public void muutaEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}

	public void muutaSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}
	
	private boolean checkID(String sotu) {
		//Check syntax
		if (!sotu.matches("[0-9]{6}[-aA+][0-9]{3}.")) {
			return false;
		}
		
		char[] checkDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
							'A', 'B', 'C', 'D', 'E', 'F', 'H', 'J', 'K', 'L', 'M',
							'N', 'P', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y'};
		
		int numberForm = Integer.parseInt(sotu.substring(0, 6) + sotu.substring(7, 10));
		int modulo = numberForm & 31;
		
		char lastChar = sotu.charAt(10);
		
		if (lastChar != checkDigits[modulo]) {
			return false;
		}
		
		return true;
		
	}
}