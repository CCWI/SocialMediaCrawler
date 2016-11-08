package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInCompanyAdministrator extends BaseEntity {
	private boolean isCompanyAdministrator;

	public boolean isCompanyAdministrator() {
		return isCompanyAdministrator;
	}

	public void setCompanyAdministrator(boolean isCompanyAdministrator) {
		this.isCompanyAdministrator = isCompanyAdministrator;
	}

	@Override
	public String toString() {
		return "LinkedInCompanyAdministrator [dbid=" + dbid + ", isCompanyAdministrator=" + isCompanyAdministrator + "]";
	}
}
