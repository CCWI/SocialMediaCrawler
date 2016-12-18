package edu.hm.cs.smc.channels.youtube.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

/**
 * A <code>YouTubeChannelInvideoPromotion</code> object encapsulates
 * information about a promotional campaign associated with a channel. A
 * channel can use an in-video promotional campaign to display the thumbnail
 * image of a promoted video in the video player during playback of the
 * channel's videos. The informations are received from the YouTube Data API v3.
 * <br />
 * <br />
 * See <a href=
 * "https://developers.google.com/youtube/v3/docs/channels">https://developers.google.com/youtube/v3/docs/channels</a>
 * 
 * @author adoeschl
 *
 */
@Entity
public class YouTubeChannelInvideoPromotion extends BaseEntity {
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeInvideoPromotionDefaultTiming defaultTiming;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeInvideoPromotionPosition position;
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeInvideoPromotionItem> items;
	private boolean useSmartTiming;

	public YouTubeInvideoPromotionDefaultTiming getDefaultTiming() {
		return defaultTiming;
	}

	public void setDefaultTiming(YouTubeInvideoPromotionDefaultTiming defaultTiming) {
		this.defaultTiming = defaultTiming;
	}

	public YouTubeInvideoPromotionPosition getPosition() {
		return position;
	}

	public void setPosition(YouTubeInvideoPromotionPosition position) {
		this.position = position;
	}

	public List<YouTubeInvideoPromotionItem> getItems() {
		return items;
	}

	public void setItems(List<YouTubeInvideoPromotionItem> items) {
		this.items = items;
	}

	public boolean isUseSmartTiming() {
		return useSmartTiming;
	}

	public void setUseSmartTiming(boolean useSmartTiming) {
		this.useSmartTiming = useSmartTiming;
	}

}
