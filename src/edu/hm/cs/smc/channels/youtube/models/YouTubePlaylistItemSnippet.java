package edu.hm.cs.smc.channels.youtube.models;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubePlaylistItemSnippet extends BaseEntity {
	private String publishedAt;
	private String channelId;
	private String title;
	private String description;
	@OneToMany(cascade = CascadeType.ALL)
	private Map<String, YouTubeThumbnail> thumbnails;
    private String channelTitle;
    private String playlistId;
    private int position;
    @OneToOne(cascade = CascadeType.ALL)
    private YouTubePlaylistItemSnippetResourceId resourceId;
	
    public String getPublishedAt() {
		return publishedAt;
	}
	
	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}
	
	public String getChannelId() {
		return channelId;
	}
	
	public void setChannelId(String channelId) {
		this.channelId = channelId;
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
	
	public Map<String, YouTubeThumbnail> getThumbnails() {
		return thumbnails;
	}
	
	public void setThumbnails(Map<String, YouTubeThumbnail> thumbnails) {
		this.thumbnails = thumbnails;
	}
	
	public String getChannelTitle() {
		return channelTitle;
	}
	
	public void setChannelTitle(String channelTitle) {
		this.channelTitle = channelTitle;
	}
	
	public String getPlaylistId() {
		return playlistId;
	}
	
	public void setPlaylistId(String playlistId) {
		this.playlistId = playlistId;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public YouTubePlaylistItemSnippetResourceId getResourceId() {
		return resourceId;
	}
	
	public void setResourceId(YouTubePlaylistItemSnippetResourceId resourceId) {
		this.resourceId = resourceId;
	}
    
}
