package edu.hm.cs.smc.channels.linkedin.models.company.update;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import edu.hm.cs.smc.channels.linkedin.models.company.update.comments.CompanyUpdateComments;

@Entity
public class CompanyUpdate {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String id;
	private boolean isCommentable;
	private boolean isLikable; 
	private boolean isLiked;
	@OneToOne(cascade=CascadeType.ALL)
	private Likes likes;
	private int numLikes;
	private long timestamp;
	@OneToOne(cascade=CascadeType.ALL)
	private CompanyUpdateComments updateComments;
	@OneToOne(cascade=CascadeType.ALL)
	private UpdateContent updateContent;
	private String updateKey;
	private String updateType;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public Likes getLikes() {
		return likes;
	}
	public void setLikes(Likes likes) {
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
	public CompanyUpdateComments getUpdateComments() {
		return updateComments;
	}
	public void setUpdateComments(CompanyUpdateComments updateComments) {
		this.updateComments = updateComments;
	}
	public UpdateContent getUpdateContent() {
		return updateContent;
	}
	public void setUpdateContent(UpdateContent updateContent) {
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
		return "CompanyUpdate [isCommentable=" + isCommentable + ", isLikable=" + isLikable + ", isLiked=" + isLiked
				+ ", likes=" + likes + ", numLikes=" + numLikes + ", timestamp=" + timestamp + ", updateComments="
				+ updateComments + ", updateContent=" + updateContent + ", updateKey=" + updateKey + ", updateType="
				+ updateType + "]";
	}
}
