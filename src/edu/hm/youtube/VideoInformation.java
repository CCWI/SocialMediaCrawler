package edu.hm.youtube;

import java.math.BigInteger;

import com.google.api.client.util.DateTime;

public class VideoInformation {

	private String channelID;

	private String channeltitle;

	private String videoID;

	private String videoTitle;

	private String videodescription;

	private DateTime publishingDate;

	private String kind;

	private String etag;

	private BigInteger viewCount;

	private BigInteger likeCount;

	private BigInteger dislikeCount;

	private BigInteger favoriteCount;

	private BigInteger commentCount;

	public String getChannelID() {
		return channelID;
	}

	public void setChannelID(String channelID) {
		this.channelID = channelID;
	}

	public String getChanneltitle() {
		return channeltitle;
	}

	public void setChanneltitle(String channeltitle) {
		this.channeltitle = channeltitle;
	}

	public String getVideoID() {
		return videoID;
	}

	public void setVideoID(String videoID) {
		this.videoID = videoID;
	}

	public String getVideoTitle() {
		return videoTitle;
	}

	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}

	public String getVideodescription() {
		return videodescription;
	}

	public void setVideodescription(String videodescription) {
		this.videodescription = videodescription;
	}

	public DateTime getPublishingDate() {
		return publishingDate;
	}

	public void setPublishingDate(DateTime publishingDate) {
		this.publishingDate = publishingDate;
	}

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

	public BigInteger getViewCount() {
		return viewCount;
	}

	public void setViewCount(BigInteger viewCount) {
		this.viewCount = viewCount;
	}

	public BigInteger getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(BigInteger likeCount) {
		this.likeCount = likeCount;
	}

	public BigInteger getDislikeCount() {
		return dislikeCount;
	}

	public void setDislikeCount(BigInteger dislikeCount) {
		this.dislikeCount = dislikeCount;
	}

	public BigInteger getFavoriteCount() {
		return favoriteCount;
	}

	public void setFavoriteCount(BigInteger favoriteCount) {
		this.favoriteCount = favoriteCount;
	}

	public BigInteger getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(BigInteger commentCount) {
		this.commentCount = commentCount;
	}
}
