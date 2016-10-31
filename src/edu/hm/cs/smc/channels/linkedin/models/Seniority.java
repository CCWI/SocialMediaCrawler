package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class Seniority extends BaseEntity {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	private String entryKey;
	private String entryValue;
	
	public String getDbid() {
		return dbid;
	}
	public void setDbid(String dbid) {
		this.dbid = dbid;
	}
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
