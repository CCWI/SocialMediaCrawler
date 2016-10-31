package edu.hm.cs.smc.channels.linkedin.models.company;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Function {
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
