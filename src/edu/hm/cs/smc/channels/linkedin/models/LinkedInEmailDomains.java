package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInEmailDomains extends BaseEntity {
	private int _count;

	public int get_count() {
		return _count;
	}

	public void set_count(int _count) {
		this._count = _count;
	}
}
