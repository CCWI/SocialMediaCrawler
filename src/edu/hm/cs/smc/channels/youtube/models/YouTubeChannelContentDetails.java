package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

/**
 * A <code>YouTubeChannelContentDetails</code> object encapsulates information
 * about the channel's content received from the YouTube Data API v3. <br />
 * <br />
 * See <a href=
 * "https://developers.google.com/youtube/v3/docs/channels">https://developers.google.com/youtube/v3/docs/channels</a>
 * 
 * @author adoeschl
 *
 */
@Entity
public class YouTubeChannelContentDetails extends BaseEntity {
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeContentDetailsRelatedPlaylists relatedPlaylists;

	public YouTubeContentDetailsRelatedPlaylists getRelatedPlaylists() {
		return relatedPlaylists;
	}

	public void setRelatedPlaylists(YouTubeContentDetailsRelatedPlaylists relatedPlaylists) {
		this.relatedPlaylists = relatedPlaylists;
	}

	@Override
	public String toString() {
		return "YouTubeChannelContentDetails [relatedPlaylists=" + relatedPlaylists + "]";
	}

}
