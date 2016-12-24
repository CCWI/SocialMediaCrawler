package edu.hm.cs.smc.channels.youtube.models;

import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeVideoSnippet extends BaseEntity {
	private String publishedAt;
	private String channelId;
	private String title;
	private String description;
	@OneToMany(cascade = CascadeType.ALL)
	private Map<String, YouTubeThumbnail> thumbnails;
	private String channelTitle;
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeTag> tags;
    private String categoryId;
	private String liveBroadcastContent;
	private String defaultLanguage;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeLocalizedInfo localized;
    private String defaultAudioLanguage;
	
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
	
	public List<YouTubeTag> getTags() {
		return tags;
	}
	
	public void setTags(List<YouTubeTag> tags) {
		this.tags = tags;
	}
	
	public String getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getLiveBroadcastContent() {
		return liveBroadcastContent;
	}
	
	public void setLiveBroadcastContent(String liveBroadcastContent) {
		this.liveBroadcastContent = liveBroadcastContent;
	}
	
	public String getDefaultLanguage() {
		return defaultLanguage;
	}
	
	public void setDefaultLanguage(String defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}
	
	public YouTubeLocalizedInfo getLocalized() {
		return localized;
	}
	
	public void setLocalized(YouTubeLocalizedInfo localized) {
		this.localized = localized;
	}
	
	public String getDefaultAudioLanguage() {
		return defaultAudioLanguage;
	}
	
	public void setDefaultAudioLanguage(String defaultAudioLanguage) {
		this.defaultAudioLanguage = defaultAudioLanguage;
	}
    
}
