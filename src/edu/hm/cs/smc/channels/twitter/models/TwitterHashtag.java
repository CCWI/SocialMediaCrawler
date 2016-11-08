package edu.hm.cs.smc.channels.twitter.models;

import javax.persistence.*;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class TwitterHashtag extends BaseEntity {
	
	private int[] indices;
	private String text;
	
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
