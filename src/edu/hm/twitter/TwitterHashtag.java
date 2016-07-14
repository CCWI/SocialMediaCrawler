package edu.hm.twitter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="twitterHashtag", 
uniqueConstraints={@UniqueConstraint(columnNames={"ID"})})
public class TwitterHashtag {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false, unique=true, length=11)
	private int id;
	
	@Column(name="statusId", columnDefinition="TEXT")
	private String statusId;
	
	@Column(name="hashtagText", columnDefinition="TEXT")
	private String hashtagText;

	public TwitterHashtag(String statusId, String hashtagText) {
		this.statusId = statusId;
		this.hashtagText = hashtagText;
	}

	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public String getHashtagText() {
		return hashtagText;
	}

	public void setHashtagText(String hashtagText) {
		this.hashtagText = hashtagText;
	}
	
	

}
