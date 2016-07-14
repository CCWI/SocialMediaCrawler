package edu.hm.twitter;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="twitterStatus")
public class TwitterStatus {
	
	// Simple Attributes
	private Date createdAt;
	private String favoriteCount;
	private boolean favorited;
	private String filterLevel;
	@Id
	private String id;
	private String idStr;
	private String inReplyToScreenName;
	private String inReplyToStatusId;
	private String inReplyToStatusIdStr;
	private String inReplyToUserId;
	private String inReplyToUserIdStr;
	private String lang;
	private boolean possiblySensitive;
	private String quotedStatusId;
	private String quotedStatusIdStr;
	private String retweetCount;
	private boolean retweeted;
	private String source;
	private String text;
	private boolean truncated;
	private String userId;
	
	// Complex Attributes
	@Transient
	private TwitterUser user;
	@Transient
	private TwitterEntities entities;
	
	public TwitterStatus(Date createdAt, String favoriteCount,
			boolean favorited, String filterLevel, String id, String idStr,
			String inReplyToScreenName, String inReplyToStatusId,
			String inReplyToStatusIdStr, String inReplyToUserId,
			String inReplyToUserIdStr, String lang, boolean possiblySensitive,
			String quotedStatusId, String quotedStatusIdStr,
			String retweetCount, boolean retweeted, String source, String text,
			boolean truncated, String userId, TwitterUser user, TwitterEntities entities) {
		this.createdAt = createdAt;
		this.favoriteCount = favoriteCount;
		this.favorited = favorited;
		this.filterLevel = filterLevel;
		this.id = id;
		this.idStr = idStr;
		this.inReplyToScreenName = inReplyToScreenName;
		this.inReplyToStatusId = inReplyToStatusId;
		this.inReplyToStatusIdStr = inReplyToStatusIdStr;
		this.inReplyToUserId = inReplyToUserId;
		this.inReplyToUserIdStr = inReplyToUserIdStr;
		this.lang = lang;
		this.possiblySensitive = possiblySensitive;
		this.quotedStatusId = quotedStatusId;
		this.quotedStatusIdStr = quotedStatusIdStr;
		this.retweetCount = retweetCount;
		this.retweeted = retweeted;
		this.source = source;
		this.text = text;
		this.truncated = truncated;
		this.userId = userId;
		this.user = user;
		this.entities = entities;
	}


	

	public TwitterEntities getEntities() {
		return entities;
	}




	public void setEntities(TwitterEntities entities) {
		this.entities = entities;
	}




	public Date getCreatedAt() {
		return createdAt;
	}




	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}




	public String getFavoriteCount() {
		return favoriteCount;
	}




	public void setFavoriteCount(String favoriteCount) {
		this.favoriteCount = favoriteCount;
	}




	public boolean isFavorited() {
		return favorited;
	}




	public void setFavorited(boolean favorited) {
		this.favorited = favorited;
	}




	public String getFilterLevel() {
		return filterLevel;
	}




	public void setFilterLevel(String filterLevel) {
		this.filterLevel = filterLevel;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getIdStr() {
		return idStr;
	}




	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}




	public String getInReplyToScreenName() {
		return inReplyToScreenName;
	}




	public void setInReplyToScreenName(String inReplyToScreenName) {
		this.inReplyToScreenName = inReplyToScreenName;
	}




	public String getInReplyToStatusId() {
		return inReplyToStatusId;
	}




	public void setInReplyToStatusId(String inReplyToStatusId) {
		this.inReplyToStatusId = inReplyToStatusId;
	}




	public String getInReplyToStatusIdStr() {
		return inReplyToStatusIdStr;
	}




	public void setInReplyToStatusIdStr(String inReplyToStatusIdStr) {
		this.inReplyToStatusIdStr = inReplyToStatusIdStr;
	}




	public String getInReplyToUserId() {
		return inReplyToUserId;
	}




	public void setInReplyToUserId(String inReplyToUserId) {
		this.inReplyToUserId = inReplyToUserId;
	}




	public String getInReplyToUserIdStr() {
		return inReplyToUserIdStr;
	}




	public void setInReplyToUserIdStr(String inReplyToUserIdStr) {
		this.inReplyToUserIdStr = inReplyToUserIdStr;
	}




	public String getLang() {
		return lang;
	}




	public void setLang(String lang) {
		this.lang = lang;
	}




	public boolean isPossiblySensitive() {
		return possiblySensitive;
	}




	public void setPossiblySensitive(boolean possiblySensitive) {
		this.possiblySensitive = possiblySensitive;
	}




	public String getQuotedStatusId() {
		return quotedStatusId;
	}




	public void setQuotedStatusId(String quotedStatusId) {
		this.quotedStatusId = quotedStatusId;
	}




	public String getQuotedStatusIdStr() {
		return quotedStatusIdStr;
	}




	public void setQuotedStatusIdStr(String quotedStatusIdStr) {
		this.quotedStatusIdStr = quotedStatusIdStr;
	}




	public String getRetweetCount() {
		return retweetCount;
	}




	public void setRetweetCount(String retweetCount) {
		this.retweetCount = retweetCount;
	}




	public boolean isRetweeted() {
		return retweeted;
	}




	public void setRetweeted(boolean retweeted) {
		this.retweeted = retweeted;
	}




	public String getSource() {
		return source;
	}




	public void setSource(String source) {
		this.source = source;
	}




	public String getText() {
		return text;
	}




	public void setText(String text) {
		this.text = text;
	}




	public boolean isTruncated() {
		return truncated;
	}




	public void setTruncated(boolean truncated) {
		this.truncated = truncated;
	}




	public String getUserId() {
		return userId;
	}




	public void setUserId(String userId) {
		this.userId = userId;
	}




	public TwitterUser getUser() {
		return user;
	}




	public void setUser(TwitterUser user) {
		this.user = user;
	}




	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tweet-ID: ");
		builder.append(this.id);
		builder.append("\r User-ID: ");
		builder.append(this.user.getId());
		builder.append("\r User-Name: ");
		builder.append(this.user.getScreenName());
		builder.append("\r Tweet-Date: ");
		builder.append(this.createdAt);
		return builder.toString();
	}
}
