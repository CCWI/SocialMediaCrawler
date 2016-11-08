package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInHeaders extends BaseEntity {
	private int _total;
	@OneToOne
	private LinkedInHeaderValues values;
	
	public int get_total() {
		return _total;
	}
	public void set_total(int _total) {
		this._total = _total;
	}
	public LinkedInHeaderValues getValues() {
		return values;
	}
	public void setValues(LinkedInHeaderValues values) {
		this.values = values;
	}
}
