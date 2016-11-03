package edu.hm.cs.smc.database.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ConfigLinkedInCompanyId {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int dbid;
	
	private int companyId;

	public int getDbid() {
		return dbid;
	}

	public void setDbid(int dbid) {
		this.dbid = dbid;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
}
