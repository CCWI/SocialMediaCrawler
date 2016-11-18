package edu.hm.cs.smc.channels.linkedin.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInCompanyUpdateComment extends BaseEntity {
	private String comment;
	private long id;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInPerson person;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInCompany company;
	private int sequeceNumber;
	private Date timestamp;
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LinkedInPerson getPerson() {
		return person;
	}
	public void setPerson(LinkedInPerson person) {
		this.person = person;
	}
	public LinkedInCompany getCompany() {
		return company;
	}
	public void setCompany(LinkedInCompany company) {
		this.company = company;
	}
	public int getSequeceNumber() {
		return sequeceNumber;
	}
	public void setSequeceNumber(int sequeceNumber) {
		this.sequeceNumber = sequeceNumber;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
