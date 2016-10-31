package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import edu.hm.cs.smc.database.models.BaseEntity;
@Entity
public class CompanySharingEnabled extends BaseEntity {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	
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
		return "CompanySharingEnabled [dbid=" + dbid + ", isCompanySharingEnabled=" + isCompanySharingEnabled + "]";
	}
}
