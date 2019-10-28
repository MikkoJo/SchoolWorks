package kesa;

public class Koira {
	private String nimi;
	
	public Koira(String nimi) {
		this.nimi = nimi;
	}

	public void jahtaa(Kissa k) {
		System.out.println(nimi + "jahtaa oliota " + k);
	}
	
	public String toString() {
		return "Koira: " + nimi;
	}

}
