package edu.hm.cs.smc.channels.linkedin.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.database.models.BaseEntity;
@Entity
public class LinkedInMemberIsAdministrator extends BaseEntity {
	private int _count;
	private int _start;
	private int _total;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="memberIsAdministrator_fk")
	private List<LinkedInCompany> values;
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
	public List<LinkedInCompany> getValues() {
		return values;
	}
	public void setValues(List<LinkedInCompany> values) {
		this.values = values;
	}
	@Override
	public String toString() {
		return "LinkedInMemberIsAdministrator [_count=" + _count + ", _start=" + _start + ", _total=" + _total
				+ ", values=" + values + "]";
	}
}
