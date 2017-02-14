package edu.hm.cs.smc.channels.youtube.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.channels.youtube.YouTubeResponseBase;

@Entity
public class YouTubeChannels extends YouTubeResponseBase {
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubeChannel> items;

	public List<YouTubeChannel> getItems() {
		return items;
	}

	public void setItems(List<YouTubeChannel> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "YouTubeChannels [kind=" + getKind() + ", etag=" + getEtag() + ", nextPageToken=" + getNextPageToken()
				+ ", prevPageToken=" + getPrevPageToken() + ", pageInfo=" + getPageInfo() + ", items=" + items + "]";
	}

}
