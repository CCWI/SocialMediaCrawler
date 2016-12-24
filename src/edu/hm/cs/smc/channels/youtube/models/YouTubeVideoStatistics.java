package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeVideoStatistics extends BaseEntity {
	private long viewCount;
	private long likeCount;
	private long dislikeCount;
	private long favoriteCount;
	private long commentCount;
	
	public long getViewCount() {
		return viewCount;
	}
	
	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
	}
	
	public long getLikeCount() {
		return likeCount;
	}
	
	public void setLikeCount(long likeCount) {
		this.likeCount = likeCount;
	}
	
	public long getDislikeCount() {
		return dislikeCount;
	}
	
	public void setDislikeCount(long dislikeCount) {
		this.dislikeCount = dislikeCount;
	}
	
	public long getFavoriteCount() {
		return favoriteCount;
	}
	
	public void setFavoriteCount(long favoriteCount) {
		this.favoriteCount = favoriteCount;
	}
	
	public long getCommentCount() {
		return commentCount;
	}
	
	public void setCommentCount(long commentCount) {
		this.commentCount = commentCount;
	}
	
}
