package edu.hm.cs.smc.channels.twitter.models;
import javax.persistence.*;

import edu.hm.cs.smc.database.models.BaseEntity;
@Entity
public class TwitterUserEntities extends BaseEntity {

	@OneToOne(cascade=CascadeType.ALL)	
	private TwitterDescription description;
	@OneToOne(cascade=CascadeType.ALL)	
	private TwitterURLS url;
	
	/**
	 * User defined profile description field.
	 */
	public void setDescription(TwitterDescription value) {
		this.description = value;
	}
	
	/**
	 * User defined profile description field.
	 */
	public TwitterDescription getDescription() {
		return description;
	}
	
	public TwitterURLS getUrl() {
		return url;
	}

	public void setUrl(TwitterURLS url) {
		this.url = url;
	}
}
