package edu.hm.cs.smc.channels.twitter.models;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import edu.hm.cs.smc.database.models.BaseEntity;
@Entity
public class TwitterSymbol extends BaseEntity {
	
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	private String text;

	public String getDbid() {
		return dbid;
	}

	public void setDbid(String dbid) {
		this.dbid = dbid;
	}
	
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
