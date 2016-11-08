package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInCompanySize extends BaseEntity {
	private String entityKey;
	private int entryValue;
	
	public String getEntityKey() {
		return entityKey;
	}
	public void setEntityKey(String entityKey) {
		this.entityKey = entityKey;
	}
	public int getEntryValue() {
		return entryValue;
	}
	public void setEntryValue(int entryValue) {
		this.entryValue = entryValue;
	}
}
