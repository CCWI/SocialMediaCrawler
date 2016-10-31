package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInCompanyAdministrator extends BaseEntity {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	
	private boolean isCompanyAdministrator;

	public String getDbid() {
		return dbid;
	}

	public void setDbid(String dbid) {
		this.dbid = dbid;
	}

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
