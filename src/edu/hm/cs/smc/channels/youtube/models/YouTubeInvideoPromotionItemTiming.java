package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

/**
 * A <code>YouTubeInvideoPromotionItemTiming</code> object represents the time
 * during a video playback when a promoted item will display. These timing
 * settings override the channel's default timing settings. The informations are
 * received from the YouTube Data API v3.
 * <br />
 * <br />
 * See <a href=
 * "https://developers.google.com/youtube/v3/docs/channels">https://developers.google.com/youtube/v3/docs/channels</a>
 * 
 * @author adoeschl
 *
 */
@Entity
public class YouTubeInvideoPromotionItemTiming extends BaseEntity {
	private String type;
	private long offsetMs;
	private long durationMs;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getOffsetMs() {
		return offsetMs;
	}

	public void setOffsetMs(long offsetMs) {
		this.offsetMs = offsetMs;
	}

	public long getDurationMs() {
		return durationMs;
	}

	public void setDurationMs(long durationMs) {
		this.durationMs = durationMs;
	}

}
