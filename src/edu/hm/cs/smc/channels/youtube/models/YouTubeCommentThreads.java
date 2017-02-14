package edu.hm.cs.smc.channels.youtube.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.channels.youtube.YouTubeResponseBase;

@Entity
public class YouTubeCommentThreads extends YouTubeResponseBase {
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeCommentThread> items;

	public List<YouTubeCommentThread> getItems() {
		return items;
	}

	public void setItems(List<YouTubeCommentThread> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "YouTubeCommentThreads [kind=" + getKind() + ", etag=" + getEtag() + ", nextPageToken="
				+ getNextPageToken() + ", prevPageToken=" + getPrevPageToken() + ", pageInfo=" + getPageInfo()
				+ ", items=" + items + "]";
	}

}
