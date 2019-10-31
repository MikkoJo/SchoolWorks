package jpaesim;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;


@NamedQuery(name = "etsiHalvat", query = "SELECT t FROM Tuote t WHERE t.hinta <= :rajahinta")
@Entity
//@MappedSuperclass
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Inheritance(strategy = InheritanceType.JOINED)
public class Tuote implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
//	private Collection<Kauppa> kaupat;
	private String nimi;
	private double hinta;
	
	
	public Tuote() {
	}

	public Tuote(String nimi, double hinta) {
		this.nimi = nimi;
		this.hinta = hinta;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	@Access(AccessType.PROPERTY)
	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}

	@Override
	public String toString() {
//		return "Tuote [id=" + id + "]";
		return "Tuote [id=" + id + ", nimi=" + nimi + ", hinta=" + hinta + "]";
	}

}
