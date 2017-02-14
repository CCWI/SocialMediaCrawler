package edu.hm.cs.smc.channels.youtube;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeResponseBase extends BaseEntity {
	private String kind;
	private String etag;
	private String nextPageToken;
	private String prevPageToken;
	@OneToOne(cascade = CascadeType.ALL)
	private YouTubeResponseBasePageInfo pageInfo;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}

	public String getNextPageToken() {
		return nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

	public String getPrevPageToken() {
		return prevPageToken;
	}

	public void setPrevPageToken(String prevPageToken) {
		this.prevPageToken = prevPageToken;
	}

	public YouTubeResponseBasePageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(YouTubeResponseBasePageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	@Override
	public String toString() {
		return "YouTubeResponseBase [kind=" + kind + ", etag=" + etag + ", nextPageToken=" + nextPageToken
				+ ", prevPageToken=" + prevPageToken + ", pageInfo=" + pageInfo + "]";
	}

}
