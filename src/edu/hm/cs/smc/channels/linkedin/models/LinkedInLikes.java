package edu.hm.cs.smc.channels.linkedin.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInLikes extends BaseEntity {
	private int _total;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="likes_fk")
	private List<LinkedInLike> values;
	
	public String getId() {
		return dbid;
	}
	public void setId(String id) {
		this.dbid = id;
	}
	public int get_total() {
		return _total;
	}
	public void set_total(int _total) {
		this._total = _total;
	}
	public List<LinkedInLike> getValues() {
		return values;
	}
	public void setValues(List<LinkedInLike> values) {
		this.values = values;
	}
	@Override
	public String toString() {
		return "LinkedInLikes [_total=" + _total + ", values=" + values + "]";
	}
}
