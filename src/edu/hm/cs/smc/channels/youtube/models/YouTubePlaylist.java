package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubePlaylist extends BaseEntity {
	private String kind;
	private String etag;
	private String id;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubePlaylistSnippet snippet;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubePlaylistStatus status;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubePlaylistContentDetails contentDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubePlaylistPlayer player;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeLocalizations localizations;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public YouTubePlaylistSnippet getSnippet() {
		return snippet;
	}

	public void setSnippet(YouTubePlaylistSnippet snippet) {
		this.snippet = snippet;
	}

	public YouTubePlaylistStatus getStatus() {
		return status;
	}

	public void setStatus(YouTubePlaylistStatus status) {
		this.status = status;
	}

	public YouTubePlaylistContentDetails getContentDetails() {
		return contentDetails;
	}

	public void setContentDetails(YouTubePlaylistContentDetails contentDetails) {
		this.contentDetails = contentDetails;
	}

	public YouTubePlaylistPlayer getPlayer() {
		return player;
	}

	public void setPlayer(YouTubePlaylistPlayer player) {
		this.player = player;
	}

	public YouTubeLocalizations getLocalizations() {
		return localizations;
	}

	public void setLocalizations(YouTubeLocalizations localizations) {
		this.localizations = localizations;
	}

	@Override
	public String toString() {
		return "YouTubePlaylist [kind=" + kind + ", etag=" + etag + ", id=" + id + ", snippet=" + snippet + ", status="
				+ status + ", contentDetails=" + contentDetails + ", player=" + player + ", localizations="
				+ localizations + "]";
	}

}
