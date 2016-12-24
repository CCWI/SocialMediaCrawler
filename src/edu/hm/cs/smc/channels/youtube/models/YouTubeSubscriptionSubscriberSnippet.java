package edu.hm.cs.smc.channels.youtube.models;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeSubscriptionSubscriberSnippet extends BaseEntity {
	private String title;
	private String description;
	private String channelId;
	@OneToMany(cascade = CascadeType.ALL)
	private Map<String, YouTubeThumbnail> thumbnails;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getChannelId() {
		return channelId;
	}
	
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
	public Map<String, YouTubeThumbnail> getThumbnails() {
		return thumbnails;
	}
	
	public void setThumbnails(Map<String, YouTubeThumbnail> thumbnails) {
		this.thumbnails = thumbnails;
	}
	
}
