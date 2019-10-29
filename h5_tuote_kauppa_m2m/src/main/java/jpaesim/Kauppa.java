package jpaesim;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;

@javax.persistence.Entity
public class Kauppa implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	// TODO: Muut ominaisuudet

	@ManyToMany //- määritettävä kentän nimi, joka mäpätään tänne Tuote taulusta (mappedBy="kaupat")
	private Collection<Tuote> tuotteet;

	private static final long serialVersionUID = 1L;

	public Kauppa() {
		super();
	}


	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Collection<Tuote> getTuotteet() {
		return tuotteet;
	}

	public void setTuotteet(Collection<Tuote> tuotteet) {
		this.tuotteet = tuotteet;
	}



	@Override
	public String toString() {
		return "Kauppa [id=" + id + "]";
	}

}
