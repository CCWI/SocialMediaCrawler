package edu.hm.cs.smc.channels.linkedin.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInCountsByMonth extends BaseEntity {
	private int _total;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="countsByMonth_fk")
	private List<LinkedInCount> values;
	
	public int get_total() {
		return _total;
	}
	public void set_total(int _total) {
		this._total = _total;
	}
	public List<LinkedInCount> getValues() {
		return values;
	}
	public void setValues(List<LinkedInCount> values) {
		this.values = values;
	}
}
