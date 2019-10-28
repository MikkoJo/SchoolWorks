package kesa;

public class Puhelinnumero {
	private int puhelin;
	private String tyyppi; // matka, koti, tyo hyv�ksyt��n!

	public Puhelinnumero(int puhelin, String tyyppi) {
		this.puhelin = puhelin;
		if(tyyppi.equalsIgnoreCase("matka") || 
				tyyppi.equalsIgnoreCase("koti") || 
				tyyppi.equalsIgnoreCase("ty�")) {
			this.tyyppi = tyyppi;
		}
	}

	@Override
	public String toString() {
		return "puhelin [" + puhelin + ", " + tyyppi + "]";
	}

}
