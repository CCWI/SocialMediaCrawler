package edu.hm.cs.smc.channels.linkedin.models.company.update;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class CompanyUpdates {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	private int _count;
	private int _start;
	private int _total;
	@OneToMany(cascade=CascadeType.ALL)
	private List<CompanyUpdate> values;
	
	public String getId() {
		return dbid;
	}
	public void setId(String id) {
		this.dbid = id;
	}
	public int get_count() {
		return _count;
	}
	public void set_count(int _count) {
		this._count = _count;
	}
	public int get_start() {
		return _start;
	}
	public void set_start(int _start) {
		this._start = _start;
	}
	public int get_total() {
		return _total;
	}
	public void set_total(int _total) {
		this._total = _total;
	}
	public List<CompanyUpdate> getValues() {
		return values;
	}
	public void setValues(List<CompanyUpdate> values) {
		this.values = values;
	}
	@Override
	public String toString() {
		return "CompanyUpdates [_count=" + _count + ", _start=" + _start + ", _total=" + _total + ", values=" + values
				+ "]";
	}
}
