package jpaesim;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@javax.persistence.Entity

public class Tuote implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	// Määrittelee tuote - kauppa suhteen 1 - n 
	// List<Kauppa> tietorakenteena

	private static final long serialVersionUID = 1L;

	// TODO: Tuotteen muut ominaisuudet

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
