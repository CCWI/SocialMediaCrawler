package edu.hm.cs.smc.channels.linkedin.models.company;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import edu.hm.cs.smc.channels.linkedin.models.company.update.Company;
import edu.hm.cs.smc.database.models.BaseEntity;
@Entity
public class MemberIsAdministrator extends BaseEntity {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	private int _count;
	private int _start;
	private int _total;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Company> values;
	public String getDbid() {
		return dbid;
	}
	public void setDbid(String dbid) {
		this.dbid = dbid;
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
	public List<Company> getValues() {
		return values;
	}
	public void setValues(List<Company> values) {
		this.values = values;
	}
	@Override
	public String toString() {
		return "MemberIsAdministrator [dbid=" + dbid + ", _count=" + _count + ", _start=" + _start + ", _total="
				+ _total + ", values=" + values + "]";
	}
}
