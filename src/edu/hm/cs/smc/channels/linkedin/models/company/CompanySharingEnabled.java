package edu.hm.cs.smc.channels.linkedin.models.company;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class CompanySharingEnabled {
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
