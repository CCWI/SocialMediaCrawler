package edu.hm.cs.smc.channels.linkedin.models.company.update;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Likes {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String id;
	private int _total;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkValues values;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int get_total() {
		return _total;
	}
	public void set_total(int _total) {
		this._total = _total;
	}
	public LinkValues getValues() {
		return values;
	}
	public void setValues(LinkValues values) {
		this.values = values;
	}
	@Override
	public String toString() {
		return "Likes [_total=" + _total + ", values=" + values + "]";
	}
}
