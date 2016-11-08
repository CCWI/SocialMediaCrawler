package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInHeaderValues extends BaseEntity {
	private String name;
	private String value;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
