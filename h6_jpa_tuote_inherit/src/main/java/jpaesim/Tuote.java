package jpaesim;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

@javax.persistence.Entity
//@NamedQuery(name = "selectTuotteet", query = "TODO: Tuote, johon liitetään kaupat")
public class Tuote implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	@ManyToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name = "tuote_id")
//	@JoinTable(
//			 joinColumns={@JoinColumn(name="id")},
//			 inverseJoinColumns={@JoinColumn(name="id")}
//			 )
	@ManyToMany(targetEntity = Kauppa.class)
//	@ManyToMany(mappedBy = "tuotteet")
	private Collection<Kauppa> kaupat;
	private String nimi;
	private String koodi;
	private double hinta;
	
	
	public Tuote() {
		kaupat = new ArrayList<>();
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

	public Collection<Kauppa> getKaupat() {
		return kaupat;
	}

	public void setKaupat(List<Kauppa> kaupat) {
		this.kaupat = kaupat;
		kaupat.forEach(k -> k.addTuote(this));
	}
	
	public void addKauppa(Kauppa kauppa) {
		kaupat.add(kauppa);
	}
	
	public void addKaupat(List<Kauppa> kaupat) {
		this.kaupat.addAll(kaupat);
		kaupat.forEach(k -> k.addTuote(this));
}

	@Override
	public String toString() {
//		return "Tuote [id=" + id + "]";
		return "Tuote [id=" + id + ", nimi=" + nimi + ", koodi=" + koodi + ", hinta=" + hinta + ", kaupat=" + kaupat
				+ "]";
	}
	
}
