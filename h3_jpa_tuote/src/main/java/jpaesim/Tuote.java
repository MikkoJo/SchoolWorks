package jpaesim;

import java.io.Serializable;
import javax.persistence.*;

@javax.persistence.Entity
@NamedQueries({ 
	@NamedQuery(name = "selectAll", query = "SELECT a FROM Tuote a"),
	@NamedQuery(name = "selectByName", query = "SELECT a FROM Tuote a WHERE a.nimi like :name")
	})
public class Tuote implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nimi;
	private String koodi;
	private double hinta;

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
		return builder.toString();
	}

}
