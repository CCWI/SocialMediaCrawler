package edu.hm.cs.smc.channels.linkedin.models.company;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Views {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	private int clicks;
	private int comments;
	@OneToOne(cascade=CascadeType.ALL)
	private Date date;
	private int engagement;
	private int impressions;
	private int likes;
	private int shares;
	
	public String getDbid() {
		return dbid;
	}
	public void setDbid(String dbid) {
		this.dbid = dbid;
	}
	public int getClicks() {
		return clicks;
	}
	public void setClicks(int clicks) {
		this.clicks = clicks;
	}
	public int getComments() {
		return comments;
	}
	public void setComments(int comments) {
		this.comments = comments;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getEngagement() {
		return engagement;
	}
	public void setEngagement(int engagement) {
		this.engagement = engagement;
	}
	public int getImpressions() {
		return impressions;
	}
	public void setImpressions(int impressions) {
		this.impressions = impressions;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getShares() {
		return shares;
	}
	public void setShares(int shares) {
		this.shares = shares;
	}
}
