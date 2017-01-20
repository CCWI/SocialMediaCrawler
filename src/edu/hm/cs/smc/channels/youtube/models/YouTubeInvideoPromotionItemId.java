package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

/**
 * A <code>YouTubeInvideoPromotionItemId</code> object identifies a promoted
 * item received from the YouTube Data API v3. <br />
 * <br />
 * See <a href=
 * "https://developers.google.com/youtube/v3/docs/channels">https://developers.google.com/youtube/v3/docs/channels</a>
 * 
 * @author adoeschl
 *
 */
@Entity
public class YouTubeInvideoPromotionItemId extends BaseEntity {
	private String type;
	private String videoId;
	private String websiteUrl;
	private String recentlyUploadedBy;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	public String getRecentlyUploadedBy() {
		return recentlyUploadedBy;
	}

	public void setRecentlyUploadedBy(String recentlyUploadedBy) {
		this.recentlyUploadedBy = recentlyUploadedBy;
	}

	@Override
	public String toString() {
		return "YouTubeInvideoPromotionItemId [type=" + type + ", videoId=" + videoId + ", websiteUrl=" + websiteUrl
				+ ", recentlyUploadedBy=" + recentlyUploadedBy + "]";
	}

}
