package edu.hm.cs.smc.channels.twitter.models;
import javax.persistence.*;

import edu.hm.cs.smc.database.models.BaseEntity;
@Entity
public class TwitterURL extends BaseEntity {
	
	@OneToOne(cascade=CascadeType.ALL)	
	private TwitterURLS urls;
	
	public TwitterURLS getUrls() {
		return urls;
	}

	public void setUrls(TwitterURLS urls) {
		this.urls = urls;
	}
}
