package edu.hm.cs.smc.channels.linkedin.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInHistoricFollowerStatistics extends BaseEntity {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	private int _total;
	@OneToMany(cascade=CascadeType.ALL)
	private List<LinkedInHistoricFollowerStatistic> values;
	
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