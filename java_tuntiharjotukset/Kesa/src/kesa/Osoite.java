package kesa;

public class Osoite {
	private String postitoimipaikka;
	private String postinumero;
	private String katuosoite;
	private String tyyppi;

	public Osoite(String postitoimipaikka, String postinumero, String katuosoite, String tyyppi) {
		this.postitoimipaikka = postitoimipaikka;
		this.postinumero = postinumero;
		this.katuosoite = katuosoite;
		this.tyyppi = tyyppi;
	}

	@Override
	public String toString() {
		return "Osoite [postitoimipaikka=" + postitoimipaikka + ", postinumero=" + postinumero + ", katuosoite="
				+ katuosoite + ", tyyppi=" + tyyppi + "]";
	}

	
}
