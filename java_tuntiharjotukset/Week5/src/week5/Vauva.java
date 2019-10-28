package week5;

public class Vauva extends Ihminen {
	
	private String vaippa;
	
	public Vauva() {
	}

	public Vauva(String nimi, int pituus, int paino, int ika, String vaippa) {
		super(nimi, pituus, paino, ika);
		this.vaippa = vaippa;
	}

	@Override
	public void liiku() {
		System.out.println("Konttaan");
	}

	public String getVaippa() {
		return vaippa;
	}

	public void setVaippa(String vaippa) {
		this.vaippa = vaippa;
	}
	
	
	

}
