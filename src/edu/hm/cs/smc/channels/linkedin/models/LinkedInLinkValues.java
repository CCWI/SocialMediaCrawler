package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInLinkValues extends BaseEntity {
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInPerson person;

	public LinkedInPerson getPerson() {
		return person;
	}

	public void setPerson(LinkedInPerson person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "LinkedInLinkValues [person=" + person + "]";
	}
}
