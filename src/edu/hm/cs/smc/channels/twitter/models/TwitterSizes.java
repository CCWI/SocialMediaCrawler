package edu.hm.cs.smc.channels.twitter.models;
import javax.persistence.*;

import edu.hm.cs.smc.database.models.BaseEntity;
@Entity
public class TwitterSizes extends BaseEntity {
	
	@OneToOne(cascade=CascadeType.ALL)	
	private TwitterThumb thumb;
	
	@OneToOne(cascade=CascadeType.ALL)	
	private TwitterLarge large;
	
	@OneToOne(cascade=CascadeType.ALL)	
	private TwitterMedium medium;

	@OneToOne(cascade=CascadeType.ALL)	
	private TwitterSmall small;
	
	/**
	 * Information for a medium-sized version of the media.
	 */
	public void setMedium(TwitterMedium value) {
		this.medium = value;
	}
	
	/**
	 * Information for a medium-sized version of the media.
	 */
	public TwitterMedium getMedium() {
		return medium;
	}
	
	/**
	 * Information for a thumbnail-sized version of the media.
	 */
	public void setThumb(TwitterThumb value) {
		this.thumb = value;
	}
	
	/**
	 * Information for a thumbnail-sized version of the media.
	 */
	public TwitterThumb getThumb() {
		return thumb;
	}
	
	/**
	 * Information for a small-sized version of the media.
	 */
	public void setSmall(TwitterSmall value) {
		this.small = value;
	}
	
	/**
	 * Information for a small-sized version of the media.
	 */
	public TwitterSmall getSmall() {
		return small;
	}
	
	/**
	 * Information for a large-sized version of the media.
	 */
	public void setLarge(TwitterLarge value) {
		this.large = value;
	}
	
	/**
	 * Information for a large-sized version of the media.
	 */
	public TwitterLarge getLarge() {
		return large;
	}
}
