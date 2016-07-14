package edu.hm.twitter;

import java.util.List;

public class TwitterEntities {
	
	private List<TwitterHashtag> twitterHashTag;
	
	private List<TwitterUrl> twitterUrl;
	
	private List<TwitterMedia> twitterMedia;
	
	public TwitterEntities() {
	}

	public TwitterEntities(List<TwitterHashtag> twitterHashTag,
			List<TwitterUrl> twitterUrl, List<TwitterMedia> twitterMedia) {
		this.twitterHashTag = twitterHashTag;
		this.twitterUrl = twitterUrl;
		this.twitterMedia = twitterMedia;
	}

	public List<TwitterHashtag> getTwitterHashTag() {
		return twitterHashTag;
	}

	public void setTwitterHashTag(List<TwitterHashtag> twitterHashTag) {
		this.twitterHashTag = twitterHashTag;
	}

	public List<TwitterUrl> getTwitterUrl() {
		return twitterUrl;
	}

	public void setTwitterUrl(List<TwitterUrl> twitterUrl) {
		this.twitterUrl = twitterUrl;
	}

	public List<TwitterMedia> getTwitterMedia() {
		return twitterMedia;
	}

	public void setTwitterMedia(List<TwitterMedia> twitterMedia) {
		this.twitterMedia = twitterMedia;
	}
	
	

}
