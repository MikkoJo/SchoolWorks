package week7;

public class Kissa extends Elain {
	
	private String aani;
	private String nimi;
	
	public Kissa() {
		super();
	}

	public Kissa(int ika, String sukupuoli, int paino, String aani, String nimi) {
		super(ika, sukupuoli, paino);
		this.aani = aani;
		this.nimi = nimi;
	}
	
	public void sanoMiau() {
		System.out.println(aani);
	}
	
}
