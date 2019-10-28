package luokka4;

public class Auto {
	private String nimi;
	private String malli;
	
	public Auto(String nimi, String malli) {
		// TODO Auto-generated constructor stub
		this.nimi = nimi;
		this.malli = malli;
	}
	
	public Auto() {
	}

	public void asetaNimi(String nimi) {
		this.nimi = nimi;
	}
	
	public String palautaNimi() {
		return nimi;
	}

	public void asetaMalli(String malli) {
		this.malli = malli;
	}
	
	public String palautaMalli() {
		return malli;
	}
	public void tulosta() {
		System.out.println("Nimi: " + nimi + ", malli: " + malli);
	}
	public String toString() {
		return "Nimi: " + nimi + ", malli: " + malli;
	}
}

