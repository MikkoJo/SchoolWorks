package week5;

public class Aikuinen extends Ihminen {
	
	private String auto;

	public Aikuinen() {
		
	}
	
	public Aikuinen(String nimi, int pituus, int paino, int ika, String auto) {
		super(nimi, pituus, paino, ika);
		this.auto = auto;
	}

	@Override
	public void liiku() {
		System.out.println("Kävelen");
	}

	public String getAuto() {
		return auto;
	}

	public void setAuto(String auto) {
		this.auto = auto;
	}
	
	
	
	

}
