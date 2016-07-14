package edu.hm.socialmediacrawler.datenbankzugriff.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="config_fb_seiten", 
uniqueConstraints={@UniqueConstraint(columnNames={"ID"})})
public class FacebookpagesFBID {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false, unique=true, length=11)
	private int id;
	
	@Column(name="fbid", columnDefinition="TEXT")
	private String fbid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFbid() {
		return fbid;
	}

	public void setFbid(String url) {
		this.fbid = url;
	}
}