package jpaesim;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

@javax.persistence.Entity
public class Kauppa implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToMany(mappedBy="kaupat")
//	@ManyToMany
	private Collection<Tuote> tuotteet;

	private String nimi;
	private String osoite;

	private static final long serialVersionUID = 1L;

	// TODO: Kaupan muut ominaisuudet
	
	public Kauppa() {
		super();
		tuotteet = new ArrayList<>();
	}

	public Integer getId() {
		return this.id;
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

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	public void setTuotteet(List<Tuote> tuotteet) {
		this.tuotteet = tuotteet;
		tuotteet.forEach(t -> t.addKauppa(this));
	}
	
	public Collection<Tuote> getTuotteet() {
		return tuotteet;
	}
	
	public void addTuote(Tuote tuote) {
		tuotteet.add(tuote);
	}

	public void addTuoteet(List<Tuote> tuotteet) {
		this.tuotteet.addAll(tuotteet);
		tuotteet.forEach(t -> t.addKauppa(this));
	}

	@Override
	public String toString() {
		return "Kauppa [id=" + id + ", nimi=" + nimi + ", osoite=" + osoite + "]";
	}
//	@Override
//	public String toString() {
//		return "Kauppa [id=" + id + "]";


}
