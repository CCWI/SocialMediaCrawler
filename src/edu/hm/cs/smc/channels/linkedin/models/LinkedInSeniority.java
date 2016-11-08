package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInSeniority extends BaseEntity {
	private String entryKey;
	private String entryValue;
	
	public String getEntryKey() {
		return entryKey;
	}
	public void setEntryKey(String entryKey) {
		this.entryKey = entryKey;
	}
	public String getEntryValue() {
		return entryValue;
	}
	public void setEntryValue(String entryValue) {
		this.entryValue = entryValue;
	}
}
