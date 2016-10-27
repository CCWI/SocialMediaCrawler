package edu.hm.cs.smc.channels.linkedin.models.company.update.comments;

public class CompanyUpdateComment {
	private String comment;
	private int id;
	private Person person;
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
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
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
