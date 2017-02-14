package edu.hm.cs.smc.channels.youtube.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.channels.youtube.YouTubeResponseBase;

@Entity
public class YouTubeComments extends YouTubeResponseBase {
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeComment> items;

	public List<YouTubeComment> getItems() {
		return items;
	}

	public void setItems(List<YouTubeComment> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "YouTubeComments [kind=" + getKind() + ", etag=" + getEtag() + ", nextPageToken=" + getNextPageToken()
				+ ", prevPageToken=" + getPrevPageToken() + ", pageInfo=" + getPageInfo() + ", items=" + items + "]";
	}

}
