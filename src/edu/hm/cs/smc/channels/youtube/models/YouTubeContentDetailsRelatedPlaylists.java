package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

/**
 * A <code>YouTubeContentDetailsRelatedPlaylists</code> object is a map that
 * identifies playlists associated with a channel, such as the channel's
 * uploaded videos or liked videos. The informations are received from the
 * YouTube Data API v3. <br />
 * <br />
 * See <a href=
 * "https://developers.google.com/youtube/v3/docs/channels">https://developers.google.com/youtube/v3/docs/channels</a>
 * 
 * @author adoeschl
 *
 */
@Entity
public class YouTubeContentDetailsRelatedPlaylists extends BaseEntity {
	private String likes;
	private String favorites;
	private String uploads;
	private String watchHistory;
	private String watchLater;

	public String getLikes() {
		return likes;
	}

	public void setLikes(String likes) {
		this.likes = likes;
	}

	public String getFavorites() {
		return favorites;
	}

	public void setFavorites(String favorites) {
		this.favorites = favorites;
	}

	public String getUploads() {
		return uploads;
	}

	public void setUploads(String uploads) {
		this.uploads = uploads;
	}

	public String getWatchHistory() {
		return watchHistory;
	}

	public void setWatchHistory(String watchHistory) {
		this.watchHistory = watchHistory;
	}

	public String getWatchLater() {
		return watchLater;
	}

	public void setWatchLater(String watchLater) {
		this.watchLater = watchLater;
	}

	@Override
	public String toString() {
		return "YouTubeContentDetailsRelatedPlaylists [likes=" + likes + ", favorites=" + favorites + ", uploads="
				+ uploads + ", watchHistory=" + watchHistory + ", watchLater=" + watchLater + "]";
	}

}
