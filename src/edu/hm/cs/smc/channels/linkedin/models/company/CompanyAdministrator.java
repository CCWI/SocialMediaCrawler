package edu.hm.cs.smc.channels.linkedin.models.company;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class CompanyAdministrator {
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
		return "CompanyAdministrator [dbid=" + dbid + ", isCompanyAdministrator=" + isCompanyAdministrator + "]";
	}
}
