package edu.hm.cs.smc.channels.youtube.models;

import java.util.Date;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

/**
 * A <code>YouTubeChannelContentOwnerDetails</code> object encapsulates channel
 * data that is relevant for YouTube Partners linked with the channel. The
 * informations are received from the YouTube Data API v3. <br />
 * <br />
 * See <a href=
 * "https://developers.google.com/youtube/v3/docs/channels">https://developers.google.com/youtube/v3/docs/channels</a>
 * 
 * @author adoeschl
 *
 */
@Entity
public class YouTubeChannelContentOwnerDetails extends BaseEntity {
	private String contentOwner;
	private Date timeLinked;

	public String getContentOwner() {
		return contentOwner;
	}

	public void setContentOwner(String contentOwner) {
		this.contentOwner = contentOwner;
	}

	public Date getTimeLinked() {
		return timeLinked;
	}

	public void setTimeLinked(Date timeLinked) {
		this.timeLinked = timeLinked;
	}

	@Override
	public String toString() {
		return "YouTubeChannelContentOwnerDetails [contentOwner=" + contentOwner + ", timeLinked=" + timeLinked + "]";
	}

}
