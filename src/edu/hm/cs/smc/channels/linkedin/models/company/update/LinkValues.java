package edu.hm.cs.smc.channels.linkedin.models.company.update;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import edu.hm.cs.smc.channels.linkedin.models.company.update.comments.Person;
import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkValues extends BaseEntity {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Person person;

	public String getDbid() {
		return dbid;
	}

	public void setDbid(String dbid) {
		this.dbid = dbid;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "LinkValues [person=" + person + "]";
	}
}
