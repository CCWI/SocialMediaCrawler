package edu.hm.cs.smc.channels.youtube.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.channels.youtube.YouTubeResponseBase;

@Entity
public class YouTubePlaylistItems extends YouTubeResponseBase {
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubePlaylistItem> items;

	public List<YouTubePlaylistItem> getItems() {
		return items;
	}

	public void setItems(List<YouTubePlaylistItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "YouTubePlaylistItems [kind=" + getKind() + ", etag=" + getEtag() + ", nextPageToken="
				+ getNextPageToken() + ", prevPageToken=" + getPrevPageToken() + ", pageInfo=" + getPageInfo()
				+ ", items=" + items + "]";
	}

}
