package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubePlaylistItem extends BaseEntity {
	private String kind;
	private String etag;
	private String id;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubePlaylistItemSnippet snippet;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubePlaylistItemContentDetails contentDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubePlaylistItemStatus status;

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

	public YouTubePlaylistItemSnippet getSnippet() {
		return snippet;
	}

	public void setSnippet(YouTubePlaylistItemSnippet snippet) {
		this.snippet = snippet;
	}

	public YouTubePlaylistItemContentDetails getContentDetails() {
		return contentDetails;
	}

	public void setContentDetails(YouTubePlaylistItemContentDetails contentDetails) {
		this.contentDetails = contentDetails;
	}

	public YouTubePlaylistItemStatus getStatus() {
		return status;
	}

	public void setStatus(YouTubePlaylistItemStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "YouTubePlaylistItem [kind=" + kind + ", etag=" + etag + ", id=" + id + ", snippet=" + snippet
				+ ", contentDetails=" + contentDetails + ", status=" + status + "]";
	}

}
