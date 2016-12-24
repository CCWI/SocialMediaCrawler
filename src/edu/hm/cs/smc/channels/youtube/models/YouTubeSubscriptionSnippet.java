package edu.hm.cs.smc.channels.youtube.models;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeSubscriptionSnippet extends BaseEntity {
	private String publishedAt;
	private String channelTitle;
	private String title;
	private String description;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeSubscriptionSnippetResourceId resourceId;
    private String channelId;
    @OneToMany(cascade = CascadeType.ALL)
	private Map<String, YouTubeThumbnail> thumbnails;
	
    public String getPublishedAt() {
		return publishedAt;
	}
	
	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}
	
	public String getChannelTitle() {
		return channelTitle;
	}
	
	public void setChannelTitle(String channelTitle) {
		this.channelTitle = channelTitle;
	}
	
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
	
	public YouTubeSubscriptionSnippetResourceId getResourceId() {
		return resourceId;
	}
	
	public void setResourceId(YouTubeSubscriptionSnippetResourceId resourceId) {
		this.resourceId = resourceId;
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
