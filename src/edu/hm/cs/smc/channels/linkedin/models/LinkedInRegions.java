package edu.hm.cs.smc.channels.linkedin.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInRegions extends BaseEntity {
	private int _total;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="regions_fk")
	private List<LinkedInRegion> values;
	public int get_total() {
		return _total;
	}
	public void set_total(int _total) {
		this._total = _total;
	}
	public List<LinkedInRegion> getValues() {
		return values;
	}
	public void setValues(List<LinkedInRegion> values) {
		this.values = values;
	}
}
