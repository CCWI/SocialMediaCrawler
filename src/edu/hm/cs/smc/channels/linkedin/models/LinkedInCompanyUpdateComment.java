package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInCompanyUpdateComment extends BaseEntity {
	private String comment;
	private int id;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInPerson person;
	private int sequeceNumber;
	private long timestamp;
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LinkedInPerson getPerson() {
		return person;
	}
	public void setPerson(LinkedInPerson person) {
		this.person = person;
	}
	public int getSequeceNumber() {
		return sequeceNumber;
	}
	public void setSequeceNumber(int sequeceNumber) {
		this.sequeceNumber = sequeceNumber;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
}
