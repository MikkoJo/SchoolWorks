package jpaharkat;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SimpleEntity
 * 
 */
@Entity
@NamedQueries({
@NamedQuery(name = "selectAll", query = "SELECT ent FROM SimpleEntity ent"),
@NamedQuery(name = "nameParam", query = "SELECT ent FROM SimpleEntity ent WHERE ent.name LIKE :name"),
@NamedQuery(name = "findFromLine", query = "SELECT ent FROM SimpleEntity ent WHERE ent.name LIKE :kirj1 OR ent.name LIKE :kirj2 OR ent.desc LIKE :kirj2")
})
public class SimpleEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String desc;
	
	// Muut ominaisuudet



	public SimpleEntity() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	// Getters, Setters ja toString()

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", desc=" + desc;
	}


}
