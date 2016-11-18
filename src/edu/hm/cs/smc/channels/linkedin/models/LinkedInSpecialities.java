package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInSpecialities extends BaseEntity {
	private int _total;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="specialities_fk")
	// TODO: Add attribute values
	public int get_total() {
		return _total;
	}
	public void set_total(int _total) {
		this._total = _total;
	}
}
