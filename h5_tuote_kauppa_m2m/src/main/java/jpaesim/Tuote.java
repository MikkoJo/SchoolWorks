package jpaesim;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@javax.persistence.Entity
//@NamedQuery(name = "selectTuotteet", query = "TODO: Tuote, johon liitetään kaupat")

public class Tuote implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	// Tuotteet
	
	// Määrittelee tuote - kauppa monen-suhde-moneen suhteena (m - n )
	// Sopiva kokoelmatyyppi

	private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	// public Collection<Kauppa> getKaupat() ...

	@Override
	public String toString() {
		return "Tuote [id=" + id + "]";
		//return "Tuote [id=" + id + ", nimi=" + nimi + ", koodi=" + koodi + ", hinta=" + hinta + ", kaupat=" + kaupat
		//		+ "]";
	}
	
}
