package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

/**
 * A <code>YouTubeChannelStatistics</code> object encapsulates statistics for a
 * channel received from the YouTube Data API v3. <br />
 * <br />
 * See <a href=
 * "https://developers.google.com/youtube/v3/docs/channels">https://developers.google.com/youtube/v3/docs/channels</a>
 * 
 * @author adoeschl
 *
 */
@Entity
public class YouTubeChannelStatistics extends BaseEntity {
	private long viewCount;
	private long commentCount;
	private long subscriberCount;
	private boolean hiddenSubscriberCount;
	private long unsigned;

	public long getViewCount() {
		return viewCount;
	}

	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
	}

	public long getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(long commentCount) {
		this.commentCount = commentCount;
	}

	public long getSubscriberCount() {
		return subscriberCount;
	}

	public void setSubscriberCount(long subscriberCount) {
		this.subscriberCount = subscriberCount;
	}

	public boolean isHiddenSubscriberCount() {
		return hiddenSubscriberCount;
	}

	public void setHiddenSubscriberCount(boolean hiddenSubscriberCount) {
		this.hiddenSubscriberCount = hiddenSubscriberCount;
	}

	public long getUnsigned() {
		return unsigned;
	}

	public void setUnsigned(long unsigned) {
		this.unsigned = unsigned;
	}

	@Override
	public String toString() {
		return "YouTubeChannelStatistics [viewCount=" + viewCount + ", commentCount=" + commentCount
				+ ", subscriberCount=" + subscriberCount + ", hiddenSubscriberCount=" + hiddenSubscriberCount
				+ ", unsigned=" + unsigned + "]";
	}

}
