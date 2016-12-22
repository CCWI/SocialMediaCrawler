package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

/**
 * A <code>YouTubeChannelStatus</code> object encapsulates information about the
 * privacy status of a channel received from the YouTube Data API v3.
 * <br />
 * <br />
 * See <a href=
 * "https://developers.google.com/youtube/v3/docs/channels">https://developers.google.com/youtube/v3/docs/channels</a>
 * 
 * @author adoeschl
 *
 */
@Entity
public class YouTubeChannelStatus extends BaseEntity {
	private String privacyStatus;
	private boolean isLinked;
	private String longUploadsStatus;

	public String getPrivacyStatus() {
		return privacyStatus;
	}

	public void setPrivacyStatus(String privacyStatus) {
		this.privacyStatus = privacyStatus;
	}

	public boolean isLinked() {
		return isLinked;
	}

	public void setLinked(boolean isLinked) {
		this.isLinked = isLinked;
	}

	public String getLongUploadsStatus() {
		return longUploadsStatus;
	}

	public void setLongUploadsStatus(String longUploadsStatus) {
		this.longUploadsStatus = longUploadsStatus;
	}

}
