package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;
@Entity
public class LinkedInCompanySharingEnabled extends BaseEntity {
	private boolean isCompanySharingEnabled;

	public boolean isCompanyAdministrator() {
		return isCompanySharingEnabled;
	}

	public boolean isCompanySharingEnabled() {
		return isCompanySharingEnabled;
	}

	public void setCompanySharingEnabled(boolean isCompanySharingEnabled) {
		this.isCompanySharingEnabled = isCompanySharingEnabled;
	}

	@Override
	public String toString() {
		return "LinkedInCompanySharingEnabled [dbid=" + dbid + ", isCompanySharingEnabled=" + isCompanySharingEnabled + "]";
	}
}
