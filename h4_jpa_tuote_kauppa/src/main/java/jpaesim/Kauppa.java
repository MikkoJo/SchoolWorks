package jpaesim;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

@javax.persistence.Entity
public class Kauppa implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private static final long serialVersionUID = 1L;

	// TODO: Kaupan muut ominaisuudet
	
	public Kauppa() {
		super();
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	@Override
	public String toString() {
		// TODO: Lisää tänne Kaupan kaikki ominaisuudet
		return "Kauppa [id=" + id + "]";
	}

}
