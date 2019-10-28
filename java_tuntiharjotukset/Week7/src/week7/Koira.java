package week7;

public class Koira extends Elain {

	private String aani;
	private String nimi;
	
	public Koira() {
		super();
	}

	public Koira(int ika, String sukupuoli, int paino, String aani, String nimi) {
		super(ika, sukupuoli, paino);
		this.aani = aani;
		this.nimi = nimi;
	}
	
	public void hauku() {
		System.out.println(aani);
	}

}
