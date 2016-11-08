package edu.hm.cs.smc.channels.twitter.models;
import java.util.List;
import javax.persistence.*;

import edu.hm.cs.smc.database.models.BaseEntity;
/**
 * Entities provide metadata and additional contextual information about content posted on Twitter. Entities are never divorced from the content they describe. In API v1.1, entities are returned wherever Tweets are found in the API. Entities are instrumental in resolving URLs.
 */
@Entity
public class TwitterEntities extends BaseEntity {
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="entitiesHashtag_fk")
	private List<TwitterHashtag> hashtags;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="entitiesMedia_fk")
	private List<TwitterMedia> media;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="entitiesSymbol_fk")
	private List<TwitterSymbol> symbols;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="entitiesUrl_fk")
	private List<TwitterURLS> urls;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="entitiesUserMention_fk")
	private List<TwitterUserMention> user_mentions;
	
	/**
	 * Represents URLs included in the text of a Tweet or within textual fields of a user object.
	 */
	public List<TwitterHashtag> getHashtags() {
		return hashtags;
	}
	public void setHahstag(List<TwitterHashtag> values) {
		this.hashtags = values;
	}
	
	public List<TwitterMedia> getMedia() {
		return media;
	}
	public void setMedia(List<TwitterMedia> values) {
		this.media = values;
	}
	
	public List<TwitterUserMention> getUserMention() {
		return user_mentions;
	}
	public void setUserMention(List<TwitterUserMention> values) {
		this.user_mentions = values;
	}

	public List<TwitterSymbol> getSymbol() {
		return symbols;
	}
	public void setSymbol(List<TwitterSymbol> values) {
		this.symbols = values;
	}
	
	public List<TwitterURLS> getUrl() {
		return urls;
	}
	public void setUrl(List<TwitterURLS> values) {
		this.urls = values;
	}
}
