package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

/**
 * A <code>YouTubeInvideoPromotionItem</code> object represents a promoted item
 * that will display during a video playback. The informations are received from
 * the YouTube Data API v3. <br />
 * <br />
 * See <a href=
 * "https://developers.google.com/youtube/v3/docs/channels">https://developers.google.com/youtube/v3/docs/channels</a>
 * 
 * @author adoeschl
 *
 */
@Entity
public class YouTubeInvideoPromotionItem extends BaseEntity {
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeInvideoPromotionItemId id;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeInvideoPromotionItemTiming timing;
	private String customMessage;
	private boolean promotedByContentOwner;

	public YouTubeInvideoPromotionItemId getId() {
		return id;
	}

	public void setId(YouTubeInvideoPromotionItemId id) {
		this.id = id;
	}

	public YouTubeInvideoPromotionItemTiming getTiming() {
		return timing;
	}

	public void setTiming(YouTubeInvideoPromotionItemTiming timing) {
		this.timing = timing;
	}

	public String getCustomMessage() {
		return customMessage;
	}

	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
	}

	public boolean isPromotedByContentOwner() {
		return promotedByContentOwner;
	}

	public void setPromotedByContentOwner(boolean promotedByContentOwner) {
		this.promotedByContentOwner = promotedByContentOwner;
	}

	@Override
	public String toString() {
		return "YouTubeInvideoPromotionItem [id=" + id + ", timing=" + timing + ", customMessage=" + customMessage
				+ ", promotedByContentOwner=" + promotedByContentOwner + "]";
	}

}
