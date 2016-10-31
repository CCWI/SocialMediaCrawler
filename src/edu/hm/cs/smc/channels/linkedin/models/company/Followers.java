package edu.hm.cs.smc.channels.linkedin.models.company;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Followers {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	private int numberOfFollowers;
	public String getDbid() {
		return dbid;
	}
	public void setDbid(String dbid) {
		this.dbid = dbid;
	}
	public int getNumberOfFollowers() {
		return numberOfFollowers;
	}
	public void setNumberOfFollowers(int numberOfFollowers) {
		this.numberOfFollowers = numberOfFollowers;
	}
	@Override
	public String toString() {
		return "Followers [dbid=" + dbid + ", numberOfFollowers=" + numberOfFollowers + "]";
	}
}
