package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInCompanyUpdateComments extends BaseEntity {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String id;
	private int _total;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInCompanyUpdateComment values;
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
	public LinkedInCompanyUpdateComment getValues() {
		return values;
	}
	public void setValues(LinkedInCompanyUpdateComment values) {
		this.values = values;
	}
	@Override
	public String toString() {
		return "LinkedInCompanyUpdateComments [_total=" + _total + ", values=" + values + "]";
	}
}
