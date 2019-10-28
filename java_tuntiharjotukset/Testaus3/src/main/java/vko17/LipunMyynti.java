package vko17;

public class LipunMyynti {
	private int laskuri;
	private Varaus varaus;
	
	public LipunMyynti() {
		laskuri = 1;
	}
	
	public Varaus teeUusiVaraus() {
		varaus = new Varaus(laskuri);
		laskuri++;
		
		return varaus;
	}
	
	public void asetaVaraus(final Varaus varaus) {
		this.varaus = varaus;
	}
	
	public boolean varausAsetettu() {
		if(varaus != null) {
			return true;
		}
		return false;
		
	}
}
