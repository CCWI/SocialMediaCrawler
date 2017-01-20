package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeSubscriptionSubscriberSnippet extends BaseEntity {
	private String title;
	private String description;
	private String channelId;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeSubscriptionSubscriberSnippetThumbnails thumbnails;

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

	public YouTubeSubscriptionSubscriberSnippetThumbnails getThumbnails() {
		return thumbnails;
	}

	public void setThumbnails(YouTubeSubscriptionSubscriberSnippetThumbnails thumbnails) {
		this.thumbnails = thumbnails;
	}

	@Override
	public String toString() {
		return "YouTubeSubscriptionSubscriberSnippet [title=" + title + ", description=" + description + ", channelId="
				+ channelId + ", thumbnails=" + thumbnails + "]";
	}

}
