package kesa;

public class Kissa {
	private String nimi;
	
	public Kissa(String nimi) {
		this.nimi = nimi;
	}

	public void karkuun(Koira k) {
		System.out.println(nimi + "jouksee karkuun oliota " + k);
	}
	
	public String toString() {
		return "Kissa: " + nimi;
	}
}
