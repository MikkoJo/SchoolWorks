package jpaesim;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@javax.persistence.Entity
@NamedQueries({ 
	@NamedQuery(name = "selectAll", query = "SELECT a FROM Tuote a"),
	@NamedQuery(name = "selectByName", query = "SELECT a FROM Tuote a WHERE a.nimi like :name")
	})
public class Tuote implements Serializable {

	private static final long serialVersionUID = 1L;

	// Määrittelee tuote - kauppa suhteen 1 - n
//	@OneToMany
	@OneToMany(cascade = CascadeType.ALL)
//	@OneToMany(cascade = CascadeType.ALL, orphanRemoval=true)
//	@JoinColumn(name = "tuote_id")
	private List<Kauppa> kaupat;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nimi;
	private String koodi;
	private double hinta;
	
	
	public Tuote() {
		kaupat = new ArrayList<>();
	}

	public void addKauppa(Kauppa kauppa) {
		kaupat.add(kauppa);
	}
	
	public void addKaupat(List<Kauppa> kaupat) {
		kaupat.addAll(kaupat);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getKoodi() {
		return koodi;
	}

	public void setKoodi(String koodi) {
		this.koodi = koodi;
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}

	public List<Kauppa> getKaupat() {
		return kaupat;
	}

	public void setKaupat(List<Kauppa> kaupat) {
		this.kaupat = kaupat;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("id=");
		builder.append(id);
		builder.append(", nimi=");
		builder.append(nimi);
		builder.append(", koodi=");
		builder.append(koodi);
		builder.append(", hinta=");
		builder.append(hinta);
		builder.append(", kaupat=");
		builder.append(kaupat);
		return builder.toString();
	}

}

