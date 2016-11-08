package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInFollowers extends BaseEntity {
	private int numberOfFollowers;
	public int getNumberOfFollowers() {
		return numberOfFollowers;
	}
	public void setNumberOfFollowers(int numberOfFollowers) {
		this.numberOfFollowers = numberOfFollowers;
	}
	@Override
	public String toString() {
		return "LinkedInFollowers [dbid=" + dbid + ", numberOfFollowers=" + numberOfFollowers + "]";
	}
}
