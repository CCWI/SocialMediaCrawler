package edu.hm.cs.smc.channels.twitter.models;
import javax.persistence.*;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class TwitterUserMention extends BaseEntity {
	
	private long id;
	private String id_str;
	private int[] indices;
	private String name;
	private String screen_name;

	/**
	 * ID of the mentioned user, as an integer.
	 */
	public void setId(long value) {
		this.id = value;
	}
	
	/**
	 * ID of the mentioned user, as an integer.
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * If of the mentioned user, as a string.
	 */
	public void setId_str(String value) {
		this.id_str = value;
	}
	
	/**
	 * If of the mentioned user, as a string.
	 */
	public String getId_str() {
		return id_str;
	}
	
	public int[] getIndices() {
		return indices;
	}

	public void setIndices(int[] indices) {
		this.indices = indices;
	}

	/**
	 * Screen name of the referenced user.
	 */
	public void setScreen_name(String value) {
		this.screen_name = value;
	}
	
	/**
	 * Screen name of the referenced user.
	 */
	public String getScreen_name() {
		return screen_name;
	}
	
	/**
	 * Display name of the referenced user.
	 */
	public void setName(String value) {
		this.name = value;
	}
	
	/**
	 * Display name of the referenced user.
	 */
	public String getName() {
		return name;
	}
}
