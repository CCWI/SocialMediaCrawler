package edu.hm.cs.smc.channels.youtube.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeCommentThreadReplies extends BaseEntity {
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeComment> comments;

	public List<YouTubeComment> getComments() {
		return comments;
	}

	public void setComments(List<YouTubeComment> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "YouTubeCommentThreadReplies [comments=" + comments + "]";
	}

}
