package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInCount extends BaseEntity {
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInDate date;
	private int newCount;
	private int totalCount;
	
	public LinkedInDate getDate() {
		return date;
	}
	public void setDate(LinkedInDate date) {
		this.date = date;
	}
	public int getNewCount() {
		return newCount;
	}
	public void setNewCount(int newCount) {
		this.newCount = newCount;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
}
