package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeComment extends BaseEntity {
	private String kind;
	private String etag;
	private String id;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeCommentSnippet snippet;

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

	public YouTubeCommentSnippet getSnippet() {
		return snippet;
	}

	public void setSnippet(YouTubeCommentSnippet snippet) {
		this.snippet = snippet;
	}

	@Override
	public String toString() {
		return "YouTubeComment [kind=" + kind + ", etag=" + etag + ", id=" + id + ", snippet=" + snippet + "]";
	}

}
