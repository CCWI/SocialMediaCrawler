package edu.hm.cs.smc.channels.twitter.models;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class TwitterHashtag extends BaseEntity {
	
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")	
	private String dbid;
	private int[] indices;
	private String text;
	
	public String getDbid() {
		return dbid;
	}

	public void setDbid(String dbid) {
		this.dbid = dbid;
	}
	
	public int[] getIndices() {
		return indices;
	}

	public void setIndices(int[] indices) {
		this.indices = indices;
	}

	/**
	 * Name of the hashtag, minus the leading '#' character.
	 */
	public void setText(String value) {
		this.text = value;
	}
	
	/**
	 * Name of the hashtag, minus the leading '#' character.
	 */
	public String getText() {
		return text;
	}
}
