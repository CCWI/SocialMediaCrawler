package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInCompanyUpdate extends BaseEntity {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	private boolean isCommentable;
	private boolean isLikable; 
	private boolean isLiked;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInLikes likes;
	private int numLikes;
	private long timestamp;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInCompanyUpdateComments updateComments;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInUpdateContent updateContent;
	private String updateKey;
	private String updateType;
	
	public String getId() {
		return dbid;
	}
	public void setId(String id) {
		this.dbid = id;
	}
	public boolean isCommentable() {
		return isCommentable;
	}
	public void setCommentable(boolean isCommentable) {
		this.isCommentable = isCommentable;
	}
	public boolean isLikable() {
		return isLikable;
	}
	public void setLikable(boolean isLikable) {
		this.isLikable = isLikable;
	}
	public boolean isLiked() {
		return isLiked;
	}
	public void setLiked(boolean isLiked) {
		this.isLiked = isLiked;
	}
	public LinkedInLikes getLikes() {
		return likes;
	}
	public void setLikes(LinkedInLikes likes) {
		this.likes = likes;
	}
	public int getNumLikes() {
		return numLikes;
	}
	public void setNumLikes(int numLikes) {
		this.numLikes = numLikes;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public LinkedInCompanyUpdateComments getUpdateComments() {
		return updateComments;
	}
	public void setUpdateComments(LinkedInCompanyUpdateComments updateComments) {
		this.updateComments = updateComments;
	}
	public LinkedInUpdateContent getUpdateContent() {
		return updateContent;
	}
	public void setUpdateContent(LinkedInUpdateContent updateContent) {
		this.updateContent = updateContent;
	}
	public String getUpdateKey() {
		return updateKey;
	}
	public void setUpdateKey(String updateKey) {
		this.updateKey = updateKey;
	}
	public String getUpdateType() {
		return updateType;
	}
	public void setUpdateType(String updateType) {
		this.updateType = updateType;
	}
	@Override
	public String toString() {
		return "LinkedInCompanyUpdate [isCommentable=" + isCommentable + ", isLikable=" + isLikable + ", isLiked=" + isLiked
				+ ", likes=" + likes + ", numLikes=" + numLikes + ", timestamp=" + timestamp + ", updateComments="
				+ updateComments + ", updateContent=" + updateContent + ", updateKey=" + updateKey + ", updateType="
				+ updateType + "]";
	}
}