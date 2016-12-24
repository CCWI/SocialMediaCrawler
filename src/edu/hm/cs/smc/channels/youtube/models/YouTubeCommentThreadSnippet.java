package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeCommentThreadSnippet extends BaseEntity {
	private String channelId;
	private String videoId;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeComment topLevelComment;
    private boolean canReply;
	private int totalReplyCount;
	private boolean isPublic;
	
	public String getChannelId() {
		return channelId;
	}
	
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
	public String getVideoId() {
		return videoId;
	}
	
	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}
	
	public YouTubeComment getTopLevelComment() {
		return topLevelComment;
	}
	
	public void setTopLevelComment(YouTubeComment topLevelComment) {
		this.topLevelComment = topLevelComment;
	}
	
	public boolean isCanReply() {
		return canReply;
	}
	
	public void setCanReply(boolean canReply) {
		this.canReply = canReply;
	}
	
	public int getTotalReplyCount() {
		return totalReplyCount;
	}
	
	public void setTotalReplyCount(int totalReplyCount) {
		this.totalReplyCount = totalReplyCount;
	}
	
	public boolean isPublic() {
		return isPublic;
	}
	
	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}
	
}
