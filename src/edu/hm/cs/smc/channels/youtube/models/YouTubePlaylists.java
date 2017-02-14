package edu.hm.cs.smc.channels.youtube.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import edu.hm.cs.smc.channels.youtube.YouTubeResponseBase;

@Entity
public class YouTubePlaylists extends YouTubeResponseBase {
	@OneToMany(cascade = CascadeType.ALL)
	private List<YouTubePlaylist> items;

	public List<YouTubePlaylist> getItems() {
		return items;
	}

	public void setItems(List<YouTubePlaylist> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "YouTubePlaylists [kind=" + getKind() + ", etag=" + getEtag() + ", nextPageToken=" + getNextPageToken()
				+ ", prevPageToken=" + getPrevPageToken() + ", pageInfo=" + getPageInfo() + ", items=" + items + "]";
	}

}
