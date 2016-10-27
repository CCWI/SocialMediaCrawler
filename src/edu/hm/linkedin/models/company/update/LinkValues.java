package edu.hm.linkedin.models.company.update;

import edu.hm.linkedin.models.company.update.comments.Person;

public class LinkValues {
	private Person person;

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
