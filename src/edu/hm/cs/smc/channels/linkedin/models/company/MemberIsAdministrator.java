package edu.hm.cs.smc.channels.linkedin.models.company;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.channels.linkedin.models.company.update.Company;

public class MemberIsAdministrator {
	private int _count;
	private int _start;
	private int _total;
	@OneToOne(cascade=CascadeType.ALL)
	private List<Company> values;
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
	public List<Company> getValues() {
		return values;
	}
	public void setValues(List<Company> values) {
		this.values = values;
	}
	@Override
	public String toString() {
		return "MemberIsAdministrator [_count=" + _count + ", _start=" + _start + ", _total=" + _total + ", values="
				+ values + "]";
	}
}
