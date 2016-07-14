package edu.hm.youtube;

import java.util.List;
import java.util.Map;

public class YoutubeInformation {
	
	private List<YoutubeChannelsuche> youtubeChannelsucheList;
	
	private List<YoutubeVideosuche> youtubeVideosucheList;

	public List<YoutubeChannelsuche> getYoutubeChannelsucheList() {
		return youtubeChannelsucheList;
	}

	public void setYoutubeChannelsucheList(
			List<YoutubeChannelsuche> youtubeChannelsucheList) {
		this.youtubeChannelsucheList = youtubeChannelsucheList;
	}

	public List<YoutubeVideosuche> getYoutubeVideosucheList() {
		return youtubeVideosucheList;
	}

	public void setYoutubeVideosucheList(
			List<YoutubeVideosuche> youtubeVideosucheList) {
		this.youtubeVideosucheList = youtubeVideosucheList;
	}
	
}
