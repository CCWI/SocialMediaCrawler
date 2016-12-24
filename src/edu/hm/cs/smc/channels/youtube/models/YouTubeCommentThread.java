package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeCommentThread extends BaseEntity {
	private String kind;
	private String etag;
	private String id;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeCommentThreadSnippet snippet;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeCommentThreadReplies replies;
	
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
	
	public YouTubeCommentThreadSnippet getSnippet() {
		return snippet;
	}
	
	public void setSnippet(YouTubeCommentThreadSnippet snippet) {
		this.snippet = snippet;
	}
	
	public YouTubeCommentThreadReplies getReplies() {
		return replies;
	}
	
	public void setReplies(YouTubeCommentThreadReplies replies) {
		this.replies = replies;
	}
	
}
