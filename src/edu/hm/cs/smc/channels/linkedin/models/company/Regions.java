package edu.hm.cs.smc.channels.linkedin.models.company;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Regions {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	private int _total;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Region> values;
	public String getDbid() {
		return dbid;
	}
	public void setDbid(String dbid) {
		this.dbid = dbid;
	}
	public int get_total() {
		return _total;
	}
	public void set_total(int _total) {
		this._total = _total;
	}
	public List<Region> getValues() {
		return values;
	}
	public void setValues(List<Region> values) {
		this.values = values;
	}
}
