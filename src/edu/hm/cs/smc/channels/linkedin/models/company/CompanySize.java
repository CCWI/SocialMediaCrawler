package edu.hm.cs.smc.channels.linkedin.models.company;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class CompanySize {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	private String entityKey;
	private int entryValue;
	
	public String getDbid() {
		return dbid;
	}
	public void setDbid(String dbid) {
		this.dbid = dbid;
	}
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
