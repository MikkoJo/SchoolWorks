package jpaesim;

import javax.persistence.Entity;

@Entity
public class Kirja extends Tuote {

	private static final long serialVersionUID = 1L;
	private String isbn;
    private String tekijat;

    public Kirja() {
		super();
	}

	public Kirja(String nimi, double hinta, String tekijat, String isbn) {
		super(nimi, hinta);
		this.isbn = isbn;
		this.tekijat = tekijat;
	}

    public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTekijat() {
		return tekijat;
	}

	public void setTekijat(String tekijat) {
		this.tekijat = tekijat;
	}
	
	@Override
	public String toString() {
		return "Kirja [Id=" + getId() + ", Nimi=" + getNimi() + ", ISBN=" + isbn
				+ ", Tekijät=" + tekijat + "]";
	}

}
