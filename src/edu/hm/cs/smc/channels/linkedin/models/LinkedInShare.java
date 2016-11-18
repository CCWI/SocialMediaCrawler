package edu.hm.cs.smc.channels.linkedin.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInShare extends BaseEntity {
	@Column(length=1000)
	private String comment;
	private String id;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInSource source;
	private Date timestamp;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInVisibility visibility;
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LinkedInSource getSource() {
		return source;
	}
	public void setSource(LinkedInSource source) {
		this.source = source;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public LinkedInVisibility getVisibility() {
		return visibility;
	}
	public void setVisibility(LinkedInVisibility visibility) {
		this.visibility = visibility;
	}
	@Override
	public String toString() {
		return "LinkedInShare [comment=" + comment + ", id=" + id + ", source=" + source + ", timestamp=" + timestamp
				+ ", visibility=" + visibility + "]";
	}
}
