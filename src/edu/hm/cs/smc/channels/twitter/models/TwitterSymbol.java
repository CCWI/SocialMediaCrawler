package edu.hm.cs.smc.channels.twitter.models;
import javax.persistence.*;

import edu.hm.cs.smc.database.models.BaseEntity;
@Entity
public class TwitterSymbol extends BaseEntity {
	
	private String text;

	/**
	 * The symbol text
	 */
	public void setText(String value) {
		this.text = value;
	}
	
	/**
	 * The symbol text
	 */
	public String getText() {
		return text;
	}
}
