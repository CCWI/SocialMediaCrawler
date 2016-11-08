package edu.hm.cs.smc.channels.linkedin.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInViewsMyMonth extends BaseEntity {
	private int _total;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="viewsByMonth_fk")
	private List<LinkedInViews> values;
	
	public int get_total() {
		return _total;
	}
	public void set_total(int _total) {
		this._total = _total;
	}
	public List<LinkedInViews> getValues() {
		return values;
	}
	public void setValues(List<LinkedInViews> values) {
		this.values = values;
	}
}
