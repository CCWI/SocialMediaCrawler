package edu.hm.cs.smc.channels.youtube.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.channels.youtube.YouTubeResponseBase;

@Entity
public class YouTubeVideos extends YouTubeResponseBase {
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeVideo> items;

	public List<YouTubeVideo> getItems() {
		return items;
	}

	public void setItems(List<YouTubeVideo> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "YouTubeVideos [kind=" + getKind() + ", etag=" + getEtag() + ", nextPageToken=" + getNextPageToken()
				+ ", prevPageToken=" + getPrevPageToken() + ", pageInfo=" + getPageInfo() + ", items=" + items + "]";
	}

}
