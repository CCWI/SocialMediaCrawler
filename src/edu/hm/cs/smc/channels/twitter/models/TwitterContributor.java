package edu.hm.cs.smc.channels.twitter.models;
import javax.persistence.*;

import edu.hm.cs.smc.database.models.BaseEntity;
/**
 * Users who contributed to the authorship of the tweet, on behalf of the official tweet author.
 */
@Entity
public class TwitterContributor extends BaseEntity {
	
	private long id;
	private String idStr;
	private String screeName;
	
	/**
	 * The integer representation of the ID of the user who contributed to this Tweet.
	 */
	public void setId(long value) {
		this.id = value;
	}
	
	/**
	 * The integer representation of the ID of the user who contributed to this Tweet.
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * The string representation of the ID of the user who contributed to this Tweet.
	 */
	public void setIdStr(String value) {
		this.idStr = value;
	}
	
	/**
	 * The string representation of the ID of the user who contributed to this Tweet.
	 */
	public String getIdStr() {
		return idStr;
	}
	
	/**
	 * The screen name of the user who contributed to this Tweet.
	 */
	public void setScreeName(String value) {
		this.screeName = value;
	}
	
	/**
	 * The screen name of the user who contributed to this Tweet.
	 */
	public String getScreeName() {
		return screeName;
	}
}
