package edu.hm.cs.smc.channels.twitter.models;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import edu.hm.cs.smc.database.models.BaseEntity;
@Entity
public class TwitterDescription extends BaseEntity {
	
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	@OneToOne(cascade=CascadeType.ALL)	
	private TwitterURLS urls;
	
	public String getDbid() {
		return dbid;
	}

	public void setDbid(String dbid) {
		this.dbid = dbid;
	}

	public TwitterURLS getUrls() {
		return urls;
	}

	public void setUrls(TwitterURLS urls) {
		this.urls = urls;
	}
}
