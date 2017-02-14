package edu.hm.cs.smc.channels.youtube.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeCommentSnippet extends BaseEntity {
	private String authorDisplayName;
	private String authorProfileImageUrl;
	private String authorChannelUrl;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeSnippetAuthorChannelId authorChannelId;
	private String channelId;
	private String videoId;
	private String textDisplay;
	private String textOriginal;
	private String parentId;
	private boolean canRate;
	private String viewerRating;
	private int likeCount;
	private String moderationStatus;
	private Date publishedAt;
	private Date updatedAt;

	public String getAuthorDisplayName() {
		return authorDisplayName;
	}

	public void setAuthorDisplayName(String authorDisplayName) {
		this.authorDisplayName = authorDisplayName;
	}

	public String getAuthorProfileImageUrl() {
		return authorProfileImageUrl;
	}

	public void setAuthorProfileImageUrl(String authorProfileImageUrl) {
		this.authorProfileImageUrl = authorProfileImageUrl;
	}

	public String getAuthorChannelUrl() {
		return authorChannelUrl;
	}

	public void setAuthorChannelUrl(String authorChannelUrl) {
		this.authorChannelUrl = authorChannelUrl;
	}

	public YouTubeSnippetAuthorChannelId getAuthorChannelId() {
		return authorChannelId;
	}

	public void setAuthorChannelId(YouTubeSnippetAuthorChannelId authorChannelId) {
		this.authorChannelId = authorChannelId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getTextDisplay() {
		return textDisplay;
	}

	public void setTextDisplay(String textDisplay) {
		this.textDisplay = textDisplay;
	}

	public String getTextOriginal() {
		return textOriginal;
	}

	public void setTextOriginal(String textOriginal) {
		this.textOriginal = textOriginal;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public boolean isCanRate() {
		return canRate;
	}

	public void setCanRate(boolean canRate) {
		this.canRate = canRate;
	}

	public String getViewerRating() {
		return viewerRating;
	}

	public void setViewerRating(String viewerRating) {
		this.viewerRating = viewerRating;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public String getModerationStatus() {
		return moderationStatus;
	}

	public void setModerationStatus(String moderationStatus) {
		this.moderationStatus = moderationStatus;
	}

	public Date getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(Date publishedAt) {
		this.publishedAt = publishedAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "YouTubeCommentSnippet [authorDisplayName=" + authorDisplayName + ", authorProfileImageUrl="
				+ authorProfileImageUrl + ", authorChannelUrl=" + authorChannelUrl + ", authorChannelId="
				+ authorChannelId + ", channelId=" + channelId + ", videoId=" + videoId + ", textDisplay=" + textDisplay
				+ ", textOriginal=" + textOriginal + ", parentId=" + parentId + ", canRate=" + canRate
				+ ", viewerRating=" + viewerRating + ", likeCount=" + likeCount + ", moderationStatus="
				+ moderationStatus + ", publishedAt=" + publishedAt + ", updatedAt=" + updatedAt + "]";
	}

}
