package edu.hm.youtube;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.SearchListResponse;
import com.google.api.services.youtube.model.SearchResult;
import com.google.api.services.youtube.model.Video;
import com.google.api.services.youtube.model.VideoListResponse;

import edu.hm.socialmediacrawler.Utf8Checker;
import edu.hm.youtube.exception.VideoNotFoundException;
import edu.hm.youtube.exception.YoutubeException;

public class Youtube {

	private static final String API_KEY = "";

	private static final String APPLICATION_NAME = "";
	
	private static final int MAX_PAGING_NUMBER = 2;

	/**
	 * Define a global instance of a Youtube object, which will be used to make
	 * YouTube Data API requests.
	 */
	private static YouTube youtube;

	public YoutubeKomplettsuche completeSearch(String keyword) throws YoutubeException {

		try {
			initializeApiRequest();
			YouTube.Search.List search = createQuery("id,snippet", 0, keyword,
					null, null);

			// Call the API and print results.
			SearchListResponse searchResponse = search.execute();

			YoutubeKomplettsuche youtubeKomplettsuche = new YoutubeKomplettsuche();
			youtubeKomplettsuche.setSuchtreffer(searchResponse.getPageInfo().getTotalResults());
			youtubeKomplettsuche.setSchluesselwort(keyword);
			return youtubeKomplettsuche;
		} catch (Exception e) {
			throw new YoutubeException(e);
		}

	}

	public YoutubeInformation channelSearch(List<String> channelIDs,
			String keyword) throws YoutubeException {
		YoutubeInformation youtubeInformation = new YoutubeInformation();
		List<YoutubeChannelsuche> channelsucheList = new ArrayList<YoutubeChannelsuche>();
		List<YoutubeVideosuche> videosuchList = new ArrayList<YoutubeVideosuche>();

		try {
			boolean allPagesRead = false;
			
			initializeApiRequest();
			
			Map<String, Integer> channelInformation = new HashMap<String, Integer>();
			
			for (String channelID : channelIDs) {
				YouTube.Search.List search = createQuery("id,snippet", 50,
						keyword, channelID, null);
				
				allPagesRead = false;
				
				for (int i = 0; ((i < MAX_PAGING_NUMBER) && !allPagesRead); i++){
					// Call the API and print results.
					SearchListResponse searchResponse = search.execute();
					
					// Set ChannelInformation
					channelInformation.put(channelID, searchResponse
							.getPageInfo().getTotalResults());

					List<SearchResult> searchResultList = searchResponse
							.getItems();

					videosuchList.addAll(fetchVideos(channelID, searchResultList, keyword));

					
					if (searchResponse.getNextPageToken() == null)
					{
					    allPagesRead = true;                          
					}
					else
					{
					   search.setPageToken(searchResponse.getNextPageToken());
					   allPagesRead = false;
					}

				}
			}
			for (String key : channelInformation.keySet()) {
				YoutubeChannelsuche youtubeChannelsuche = new YoutubeChannelsuche();
				youtubeChannelsuche.setChannelid(key);
				youtubeChannelsuche.setSuchtreffer(channelInformation.get(key));
				youtubeChannelsuche.setSchluesselwort(keyword);
				channelsucheList.add(youtubeChannelsuche);
			}
			youtubeInformation.setYoutubeChannelsucheList(channelsucheList);
			youtubeInformation.setYoutubeVideosucheList(videosuchList);
			return youtubeInformation;

		} catch (Exception e) {
			throw new YoutubeException(e);
		}
	}

	private List<YoutubeVideosuche> fetchVideos(String channelID,
			List<SearchResult> searchResultList, String keyword) throws IOException,
			VideoNotFoundException, TooManyVideosFoundException {
		List<YoutubeVideosuche> videosuchelist = new ArrayList<YoutubeVideosuche>();
		
		if (searchResultList != null) {
			Iterator<SearchResult> searchResultIterator = searchResultList
					.iterator();

			while (searchResultIterator.hasNext()) {
				SearchResult singleVideo = searchResultIterator
						.next();
				YoutubeVideosuche youtubeVideosuche = new YoutubeVideosuche();
				youtubeVideosuche.setChannelid(channelID);
				youtubeVideosuche.setChanneltitel(Utf8Checker.macheUtf8Konform(singleVideo
						.getSnippet().getChannelTitle()));
				youtubeVideosuche.setVideoid(singleVideo.getId()
						.getVideoId());
				youtubeVideosuche.setVideotitel(Utf8Checker.macheUtf8Konform(singleVideo
						.getSnippet().getTitle()));
				youtubeVideosuche.setVideobeschreibung(Utf8Checker.macheUtf8Konform(singleVideo
						.getSnippet().getDescription()));
				youtubeVideosuche.setVeroeffentlichungsdatum(new Timestamp(singleVideo
						.getSnippet().getPublishedAt().getValue())); 
				
				
				
				// Call the YouTube Data API's youtube.videos.list
				// method to
				// retrieve the resources that represent the
				// specified
				// videos.
				YouTube.Videos.List listVideosRequest = youtube
						.videos().list("statistics")
						.setId(singleVideo.getId().getVideoId());
				listVideosRequest.setKey(API_KEY);
				VideoListResponse listResponse = listVideosRequest
						.execute();

				List<Video> videoResultList = listResponse
						.getItems();

				if (videoResultList.size() == 0) {
					throw new VideoNotFoundException(
							singleVideo.getId().getVideoId(),
							"Das Video mit der ID '"
									+ singleVideo.getId()
											.getVideoId()
									+ "' konnte nicht gefunden werden.");
				} else if (videoResultList.size() > 1) {
					throw new TooManyVideosFoundException(
							"Es wurde nur ein Video erwartet, jedoch wurden '"
									+ videoResultList.size()
									+ "' gefunden");
				} else {
					Video video = videoResultList.get(0);
					youtubeVideosuche.setArt(video.getKind());
					youtubeVideosuche.setEtag(video.getEtag());
					youtubeVideosuche.setViewcount(video
							.getStatistics().getViewCount());
					youtubeVideosuche.setLikecount(video
							.getStatistics().getLikeCount());
					youtubeVideosuche.setDislikecount(video
							.getStatistics().getDislikeCount());
					youtubeVideosuche.setFavouritecount(video
							.getStatistics().getFavoriteCount());
					youtubeVideosuche.setCommentcount(video
							.getStatistics().getCommentCount());
					youtubeVideosuche.setSchluesselwort(keyword);
					
					videosuchelist.add(youtubeVideosuche);
					
				}
			}
		}
		return videosuchelist;
	}

	private YouTube.Search.List createQuery(String part,
			long numberOfVideosReturned, String keyword, String channelId,
			String fields) throws IOException {
		// Define the API request for retrieving search results.
		YouTube.Search.List search = youtube.search().list(part);

		// Set your developer key from the Google Developers Console for
		// non-authenticated requests. See:
		// https://console.developers.google.com/
		search.setKey(API_KEY);

		// Set the search query
		search.setQ(keyword);

		// Restrict the search results to only include videos. See:
		// https://developers.google.com/youtube/v3/docs/search/list#type
		search.setType("video");

		// Restrict the search to a specific channelID
		if (!(channelId == null || channelId.isEmpty())) {
			search.setChannelId(channelId);
		}

		// To increase efficiency, only retrieve the fields that the
		// application uses.
		if (!(fields == null || fields.isEmpty())) {
			search.setFields(fields);
		}

		// Number of Results per Page
		search.setMaxResults(numberOfVideosReturned);

		return search;

	}

	private void initializeApiRequest() {
		// This object is used to make YouTube Data API requests. The last
		// argument is required, but since we don't need anything
		// initialized when the HttpRequest is initialized, we override
		// the interface and provide a no-op function.
		youtube = new YouTube.Builder(new NetHttpTransport(),
				new JacksonFactory(), new HttpRequestInitializer() {
					public void initialize(HttpRequest request)
							throws IOException {
					}
				}).setApplicationName(APPLICATION_NAME).build();

	}

}
