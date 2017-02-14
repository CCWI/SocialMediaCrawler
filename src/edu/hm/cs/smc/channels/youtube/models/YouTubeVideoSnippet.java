package edu.hm.cs.smc.channels.youtube.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeVideoSnippet extends BaseEntity {
	private Date publishedAt;
	private String channelId;
	private String title;
	private String description;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeVideoSnippetThumbnails thumbnails;
	private String channelTitle;
	@ElementCollection
	private List<String> tags;
	private String categoryId;
	private String liveBroadcastContent;
	private String defaultLanguage;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeLocalization localized;
	private String defaultAudioLanguage;

	public Date getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(Date publishedAt) {
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

	public YouTubeVideoSnippetThumbnails getThumbnails() {
		return thumbnails;
	}

	public void setThumbnails(YouTubeVideoSnippetThumbnails thumbnails) {
		this.thumbnails = thumbnails;
	}

	public String getChannelTitle() {
		return channelTitle;
	}

	public void setChannelTitle(String channelTitle) {
		this.channelTitle = channelTitle;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
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

	public YouTubeLocalization getLocalized() {
		return localized;
	}

	public void setLocalized(YouTubeLocalization localized) {
		this.localized = localized;
	}

	public String getDefaultAudioLanguage() {
		return defaultAudioLanguage;
	}

	public void setDefaultAudioLanguage(String defaultAudioLanguage) {
		this.defaultAudioLanguage = defaultAudioLanguage;
	}

	@Override
	public String toString() {
		return "YouTubeVideoSnippet [publishedAt=" + publishedAt + ", channelId=" + channelId + ", title=" + title
				+ ", description=" + description + ", thumbnails=" + thumbnails + ", channelTitle=" + channelTitle
				+ ", tags=" + tags + ", categoryId=" + categoryId + ", liveBroadcastContent=" + liveBroadcastContent
				+ ", defaultLanguage=" + defaultLanguage + ", localized=" + localized + ", defaultAudioLanguage="
				+ defaultAudioLanguage + "]";
	}

}
