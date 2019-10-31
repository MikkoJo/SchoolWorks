package jpaesim;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "etsiKaalliitLevyt"
	, query = "SELECT c FROM Cd c WHERE c.hinta >= :rajahinta")
public class Cd extends Tuote {
    
	private static final long serialVersionUID = 1L;
	private String artisti;
    private int pituus;
    private int biiseja;

    public Cd() {
		super();
	}
    
    

	public Cd(String artisti, String nimi, int pituus, int biiseja, double hinta) {
		super(nimi, hinta);
		this.artisti = artisti;
		this.pituus = pituus;
		this.biiseja = biiseja;
	}



	public String getArtisti() {
		return artisti;
	}

	public void setArtisti(String artisti) {
		this.artisti = artisti;
	}

	public int getPituus() {
		return pituus;
	}

	public void setPituus(int pituus) {
		this.pituus = pituus;
	}

	public int getBiiseja() {
		return biiseja;
	}

	public void setBiiseja(int biiseja) {
		this.biiseja = biiseja;
	}

	@Override
	public String toString() {
		return "Cd [Id=" + getId() + ", Nimi=" + getNimi() + ", Artisti=" 
				+ artisti + ", Pituus="	+ pituus + ", Biiseja="
				+ biiseja + ", Hinta=" + getHinta() + "]";
	}
    
    
}
