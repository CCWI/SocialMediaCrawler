package edu.hm.cs.smc.channels.linkedin.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInHistoricFollowerStatistics extends BaseEntity {
	private int _total;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="historicFollowerStatistics_fk")
	private List<LinkedInHistoricFollowerStatistic> values;
	
	public int get_total() {
		return _total;
	}
	public void set_total(int _total) {
		this._total = _total;
	}
	public List<LinkedInHistoricFollowerStatistic> getValues() {
		return values;
	}
	public void setValues(List<LinkedInHistoricFollowerStatistic> values) {
		this.values = values;
	}
	@Override
	public String toString() {
		return "LinkedInHistoricFollowerStatistics [dbid=" + dbid + ", _total=" + _total + ", values=" + values + "]";
	}
}
