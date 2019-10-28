package week5;

public class Ihminen extends Nisakas {

	private int paino;
	private int pituus;
	private String nimi;
	
	public Ihminen() {
		
	}
	
	public Ihminen(String nimi, int pituus, int paino, int ika) {
		this.nimi = nimi;
		this.pituus = pituus;
		this.paino = paino;
		this.setIka(ika);
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

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	@Override
	public void liiku() {
		System.out.println("Liikun");
	}
	
	public void kasva() {
		setIka(getIka() + 1);
	}
	
	

}
