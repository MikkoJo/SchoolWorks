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
	private String nimi;
	private String osoite;

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

	@Override
	public String toString() {
		return "Kauppa [id=" + id + ", nimi=" + nimi + ", osoite=" + osoite + "]";
	}

}
