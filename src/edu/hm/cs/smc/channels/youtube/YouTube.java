package edu.hm.cs.smc.channels.youtube;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

import com.github.scribejava.apis.GoogleApi20;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Response;
import com.github.scribejava.core.model.Verb;
import com.github.scribejava.core.oauth.OAuth20Service;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import edu.hm.cs.smc.channels.generic.models.Request;
import edu.hm.cs.smc.channels.generic.models.RequestNetwork;
import edu.hm.cs.smc.channels.generic.models.RequestParameter;
import edu.hm.cs.smc.channels.generic.models.RequestType;
import edu.hm.cs.smc.channels.youtube.models.YouTubeChannel;
import edu.hm.cs.smc.channels.youtube.models.YouTubeChannels;
import edu.hm.cs.smc.channels.youtube.models.YouTubeCommentThreads;
import edu.hm.cs.smc.channels.youtube.models.YouTubeComments;
import edu.hm.cs.smc.channels.youtube.models.YouTubePlaylist;
import edu.hm.cs.smc.channels.youtube.models.YouTubePlaylistItems;
import edu.hm.cs.smc.channels.youtube.models.YouTubePlaylists;
import edu.hm.cs.smc.channels.youtube.models.YouTubeSubscriptions;
import edu.hm.cs.smc.channels.youtube.models.YouTubeVideo;
import edu.hm.cs.smc.channels.youtube.models.YouTubeVideos;

public class YouTube {
	private String clientId;
	private String clientSecret;
	private OAuth20Service service;
	private OAuth2AccessToken accessToken;

	public static final String REFRESH_TOKEN_NAME = "youtube.refresh-token";
	public static final String CLIENT_ID_NAME = "youtube.client-id";
	public static final String CLIENT_SECRET_NAME = "youtube.client-secret";

	public static final String SCOPE = "profile https://www.googleapis.com/auth/youtube.force-ssl";
	public static final String CALLBACK = "http://localhost/auth/youtube/callback";
	public static final String STATE = UUID.randomUUID().toString();

	public static final String PART_PARAMETER_NAME = "part";
	public static final String ID_PARAMETER_NAME = "id";
	public static final String CHANNEL_ID_PARAMETER_NAME = "channelId";
	public static final String PLAYLIST_ID_PARAMETER_NAME = "playlistId";
	public static final String VIDEO_ID_PARAMETER_NAME = "videoId";
	public static final String PARENT_ID_PARAMETER_NAME = "parentId";
	public static final String MINE_PARAMETER_NAME = "mine";
	public static final String MY_SUBSCRIBERS_PARAMETER_NAME = "mySubscribers";
	public static final String FOR_USERNAME_PARAMETER_NAME = "forUsername";
	public static final String PAGE_TOKEN_PARAMETER_NAME = "pageToken";
	public static final String MAX_RESULTS_PARAMETER_NAME = "maxResults";

	public YouTube(Properties properties) {
		clientId = properties.getProperty(CLIENT_ID_NAME);
		clientSecret = properties.getProperty(CLIENT_SECRET_NAME);

		service = new ServiceBuilder().apiKey(clientId).apiSecret(clientSecret).scope(SCOPE).state(STATE)
				.callback(CALLBACK).build(GoogleApi20.instance());

		if (properties.containsKey(REFRESH_TOKEN_NAME)) {
			String refreshToken = properties.getProperty(REFRESH_TOKEN_NAME);
			try {
				accessToken = service.refreshAccessToken(refreshToken);
			} catch (IOException | InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * Returns a {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 * object with a {@link edu.hm.cs.smc.channels.youtube.models.YouTubeChannel
	 * YouTubeChannel} that matches the <code>channelId</code> parameter. If no
	 * match exists, the {@link edu.hm.cs.smc.channels.generic.models.Request
	 * Request} object contains <code>null</code>.
	 * 
	 * @param channelId
	 *            the id of the requested channel
	 * @return the {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 *         object with the matching channel or with <code>null</code>
	 */
	public Request getChannel(String channelId) {
		String url = "https://www.googleapis.com/youtube/v3/channels?%s&%s";

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();

		// Add part parameter
		RequestParameter partParameter = new RequestParameter();
		partParameter.setName(PART_PARAMETER_NAME);
		partParameter.setValue("brandingSettings,contentDetails,contentOwnerDetails,id,invideoPromotion,"
				+ "localizations,snippet,statistics,status,topicDetails");
		requestParameters.add(partParameter);

		// Add id parameter
		RequestParameter idParameter = new RequestParameter();
		idParameter.setName(ID_PARAMETER_NAME);
		idParameter.setValue(channelId);
		requestParameters.add(idParameter);

		// Send request
		Response response = null;
		try {
			response = request(url, partParameter.getRequestNotation(), idParameter.getRequestNotation());
		} catch (InterruptedException | ExecutionException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Convert Json response into Java object
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX").create();
		YouTubeChannel result = null;
		try {
			result = gson.fromJson(response.getBody(), YouTubeChannels.class).getItems().get(0);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Save request and response
		Request request = new Request();
		request.setUrl(url);
		request.setParameters(requestParameters);
		request.setRequestType(RequestType.GET);
		request.setNetwork(RequestNetwork.YOUTUBE);
		request.setResponse(result);

		return request;
	}

	/**
	 * Returns a {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 * object with {@link edu.hm.cs.smc.channels.youtube.models.YouTubePlaylists
	 * YouTubePlaylists} that match the <code>channelId</code> parameter. If no
	 * match exists, the {@link edu.hm.cs.smc.channels.generic.models.Request
	 * Request} object contains <code>null</code>.
	 * 
	 * @param channelId
	 *            the id of the channel for which the playlists should be
	 *            returned
	 * @param pageToken
	 *            the <code>pageToken</code> identifies a specific page in the
	 *            result set that should be returned (in the response, the
	 *            <code>nextPageToken</code> and <code>prevPageToken</code>
	 *            properties identify other pages that could be retrieved)
	 * @return the {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 *         object with the matching playlists or with <code>null</code>
	 */
	public Request getPlaylists(String channelId, String pageToken) {
		String url = "https://www.googleapis.com/youtube/v3/playlists?%s&%s&%s";

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();

		// Add part parameter
		RequestParameter partParameter = new RequestParameter();
		partParameter.setName(PART_PARAMETER_NAME);
		partParameter.setValue("contentDetails,id,localizations,player,snippet,status");
		requestParameters.add(partParameter);

		// Add channelId parameter
		RequestParameter channelIdParameter = new RequestParameter();
		channelIdParameter.setName(CHANNEL_ID_PARAMETER_NAME);
		channelIdParameter.setValue(channelId);
		requestParameters.add(channelIdParameter);

		// Add maxResults parameter
		RequestParameter maxResultsParameter = new RequestParameter();
		maxResultsParameter.setName(MAX_RESULTS_PARAMETER_NAME);
		maxResultsParameter.setValue("50");
		requestParameters.add(maxResultsParameter);

		// Send request
		Response response = null;
		try {
			if (pageToken != null) {
				// Add pageToken parameter
				RequestParameter pageTokenParameter = new RequestParameter();
				pageTokenParameter.setName(PAGE_TOKEN_PARAMETER_NAME);
				pageTokenParameter.setValue(pageToken);
				requestParameters.add(pageTokenParameter);

				url += "&%s";

				response = request(url, partParameter.getRequestNotation(), channelIdParameter.getRequestNotation(),
						maxResultsParameter.getRequestNotation(), pageTokenParameter.getRequestNotation());
			} else {
				response = request(url, partParameter.getRequestNotation(), channelIdParameter.getRequestNotation(),
						maxResultsParameter.getRequestNotation());
			}
		} catch (InterruptedException | ExecutionException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Convert Json response into Java object
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX").create();
		YouTubePlaylists result = null;
		try {
			result = gson.fromJson(response.getBody(), YouTubePlaylists.class);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Save request and response
		Request request = new Request();
		request.setUrl(url);
		request.setParameters(requestParameters);
		request.setRequestType(RequestType.GET);
		request.setNetwork(RequestNetwork.YOUTUBE);
		request.setResponse(result);

		return request;
	}

	/**
	 * Returns a {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 * object with a
	 * {@link edu.hm.cs.smc.channels.youtube.models.YouTubePlaylist
	 * YouTubePlaylist} that matches the <code>playlistId</code> parameter. If
	 * no match exists, the {@link edu.hm.cs.smc.channels.generic.models.Request
	 * Request} object contains <code>null</code>.
	 * 
	 * @param playlistId
	 *            the id of the requested playlist
	 * @return the {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 *         object with the matching playlist or with <code>null</code>
	 */
	public Request getPlaylist(String playlistId) {
		String url = "https://www.googleapis.com/youtube/v3/playlists?%s&%s";

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();

		// Add part parameter
		RequestParameter partParameter = new RequestParameter();
		partParameter.setName(PART_PARAMETER_NAME);
		partParameter.setValue("contentDetails,id,localizations,player,snippet,status");
		requestParameters.add(partParameter);

		// Add id parameter
		RequestParameter idParameter = new RequestParameter();
		idParameter.setName(ID_PARAMETER_NAME);
		idParameter.setValue(playlistId);
		requestParameters.add(idParameter);

		// Send request
		Response response = null;
		try {
			response = request(url, partParameter.getRequestNotation(), idParameter.getRequestNotation());
		} catch (InterruptedException | ExecutionException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Convert Json response into Java object
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX").create();
		YouTubePlaylist result = null;
		try {
			result = gson.fromJson(response.getBody(), YouTubePlaylists.class).getItems().get(0);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Save request and response
		Request request = new Request();
		request.setUrl(url);
		request.setParameters(requestParameters);
		request.setRequestType(RequestType.GET);
		request.setNetwork(RequestNetwork.YOUTUBE);
		request.setResponse(result);

		return request;
	}

	/**
	 * Returns a {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 * object with
	 * {@link edu.hm.cs.smc.channels.youtube.models.YouTubePlaylistItems
	 * YouTubePlaylistItems} that match the <code>playlistId</code> parameter.
	 * If no match exists, the
	 * {@link edu.hm.cs.smc.channels.generic.models.Request Request} object
	 * contains <code>null</code>.
	 * 
	 * @param playlistId
	 *            the id of the playlist for which the playlist items should be
	 *            returned
	 * @param pageToken
	 *            the <code>pageToken</code> identifies a specific page in the
	 *            result set that should be returned (in the response, the
	 *            <code>nextPageToken</code> and <code>prevPageToken</code>
	 *            properties identify other pages that could be retrieved)
	 * @return the {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 *         object with the matching playlist items or with <code>null</code>
	 */
	public Request getPlaylistItems(String playlistId, String pageToken) {
		String url = "https://www.googleapis.com/youtube/v3/playlistItems?%s&%s&%s";

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();

		// Add part parameter
		RequestParameter partParameter = new RequestParameter();
		partParameter.setName(PART_PARAMETER_NAME);
		partParameter.setValue("contentDetails,id,snippet,status");
		requestParameters.add(partParameter);

		// Add playlistId parameter
		RequestParameter playlistIdParameter = new RequestParameter();
		playlistIdParameter.setName(PLAYLIST_ID_PARAMETER_NAME);
		playlistIdParameter.setValue(playlistId);
		requestParameters.add(playlistIdParameter);

		// Add maxResults parameter
		RequestParameter maxResultsParameter = new RequestParameter();
		maxResultsParameter.setName(MAX_RESULTS_PARAMETER_NAME);
		maxResultsParameter.setValue("50");
		requestParameters.add(maxResultsParameter);

		// Send request
		Response response = null;
		try {
			if (pageToken != null) {
				// Add pageToken parameter
				RequestParameter pageTokenParameter = new RequestParameter();
				pageTokenParameter.setName(PAGE_TOKEN_PARAMETER_NAME);
				pageTokenParameter.setValue(pageToken);
				requestParameters.add(pageTokenParameter);

				url += "&%s";

				response = request(url, partParameter.getRequestNotation(), playlistIdParameter.getRequestNotation(),
						maxResultsParameter.getRequestNotation(), pageTokenParameter.getRequestNotation());
			} else {
				response = request(url, partParameter.getRequestNotation(), playlistIdParameter.getRequestNotation(),
						maxResultsParameter.getRequestNotation());
			}
		} catch (InterruptedException | ExecutionException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Convert Json response into Java object
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX").create();
		YouTubePlaylistItems result = null;
		try {
			result = gson.fromJson(response.getBody(), YouTubePlaylistItems.class);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Save request and response
		Request request = new Request();
		request.setUrl(url);
		request.setParameters(requestParameters);
		request.setRequestType(RequestType.GET);
		request.setNetwork(RequestNetwork.YOUTUBE);
		request.setResponse(result);

		return request;
	}

	/**
	 * Returns a {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 * object with a {@link edu.hm.cs.smc.channels.youtube.models.YouTubeVideo
	 * YouTubeVideo} that matches the <code>videoId</code> parameter. If no
	 * match exists, the {@link edu.hm.cs.smc.channels.generic.models.Request
	 * Request} object contains <code>null</code>.
	 * 
	 * @param videoId
	 *            the id of the requested video
	 * @return the {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 *         object with the matching video or with <code>null</code>
	 */
	public Request getVideo(String videoId) {
		String url = "https://www.googleapis.com/youtube/v3/videos?%s&%s";

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();

		// Add part parameter
		RequestParameter partParameter = new RequestParameter();
		partParameter.setName(PART_PARAMETER_NAME);
		partParameter.setValue(
				"contentDetails,id,liveStreamingDetails,localizations,player,recordingDetails,snippet,statistics,status,topicDetails");
		requestParameters.add(partParameter);

		// Add id parameter
		RequestParameter idParameter = new RequestParameter();
		idParameter.setName(ID_PARAMETER_NAME);
		idParameter.setValue(videoId);
		requestParameters.add(idParameter);

		// Send request
		Response response = null;
		try {
			response = request(url, partParameter.getRequestNotation(), idParameter.getRequestNotation());
		} catch (InterruptedException | ExecutionException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Convert Json response into Java object
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX").create();
		YouTubeVideo result = null;
		try {
			result = gson.fromJson(response.getBody(), YouTubeVideos.class).getItems().get(0);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Save request and response
		Request request = new Request();
		request.setUrl(url);
		request.setParameters(requestParameters);
		request.setRequestType(RequestType.GET);
		request.setNetwork(RequestNetwork.YOUTUBE);
		request.setResponse(result);

		return request;
	}

	/**
	 * Returns a {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 * object with a {@link edu.hm.cs.smc.channels.youtube.models.YouTubeVideo
	 * YouTubeVideo} of the authenticated user that matches the
	 * <code>videoId</code> parameter. If no match exists, the
	 * {@link edu.hm.cs.smc.channels.generic.models.Request Request} object
	 * contains <code>null</code>.
	 * 
	 * @param videoId
	 *            the id of the requested video
	 * @return the {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 *         object with the matching video or with <code>null</code>
	 */
	public Request getMyVideo(String videoId) {
		String url = "https://www.googleapis.com/youtube/v3/videos?%s&%s";

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();

		// Add part parameter
		RequestParameter partParameter = new RequestParameter();
		partParameter.setName(PART_PARAMETER_NAME);
		partParameter.setValue(
				"contentDetails,fileDetails,id,liveStreamingDetails,localizations,player,processingDetails,recordingDetails,snippet,statistics,status,suggestions,topicDetails");
		requestParameters.add(partParameter);

		// Add id parameter
		RequestParameter idParameter = new RequestParameter();
		idParameter.setName(ID_PARAMETER_NAME);
		idParameter.setValue(videoId);
		requestParameters.add(idParameter);

		// Send request
		Response response = null;
		try {
			response = request(url, partParameter.getRequestNotation(), idParameter.getRequestNotation());
		} catch (InterruptedException | ExecutionException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Convert Json response into Java object
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX").create();
		YouTubeVideo result = null;
		try {
			result = gson.fromJson(response.getBody(), YouTubeVideos.class).getItems().get(0);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Save request and response
		Request request = new Request();
		request.setUrl(url);
		request.setParameters(requestParameters);
		request.setRequestType(RequestType.GET);
		request.setNetwork(RequestNetwork.YOUTUBE);
		request.setResponse(result);

		return request;
	}

	/**
	 * Returns a {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 * object with
	 * {@link edu.hm.cs.smc.channels.youtube.models.YouTubeCommentThreads
	 * YouTubeCommentThreads} of a video that matches the <code>videoId</code>
	 * parameter. If no match exists, the
	 * {@link edu.hm.cs.smc.channels.generic.models.Request Request} object
	 * contains <code>null</code>. Warning: the comment threads do not
	 * necessarily contain all replies to a comment! To get all replies, use
	 * {@link #getComments(String, String) getComments} instead.
	 * 
	 * @param videoId
	 *            the id of the video for which the comment threads should be
	 *            returned
	 * @param withReplies
	 *            set this parameter's value to <code>true</code> to retrieve
	 *            top-level comments and replies, if any exist, to that
	 *            comments; to get only the top-level comments, set the value to
	 *            <code>false</code>
	 * @param pageToken
	 *            the <code>pageToken</code> identifies a specific page in the
	 *            result set that should be returned (in the response, the
	 *            <code>nextPageToken</code> and <code>prevPageToken</code>
	 *            properties identify other pages that could be retrieved)
	 * @return the {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 *         object with the matching comment threads or with
	 *         <code>null</code>
	 */
	public Request getCommentThreadsOfVideo(String videoId, Boolean withReplies, String pageToken) {
		String url = "https://www.googleapis.com/youtube/v3/commentThreads?%s&%s&%s";

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();

		// Add part parameter
		RequestParameter partParameter = new RequestParameter();
		partParameter.setName(PART_PARAMETER_NAME);
		if (withReplies) {
			partParameter.setValue("id,replies,snippet");
		} else {
			partParameter.setValue("id,snippet");
		}
		requestParameters.add(partParameter);

		// Add videoId parameter
		RequestParameter videoIdParameter = new RequestParameter();
		videoIdParameter.setName(VIDEO_ID_PARAMETER_NAME);
		videoIdParameter.setValue(videoId);
		requestParameters.add(videoIdParameter);

		// Add maxResults parameter
		RequestParameter maxResultsParameter = new RequestParameter();
		maxResultsParameter.setName(MAX_RESULTS_PARAMETER_NAME);
		maxResultsParameter.setValue("100");
		requestParameters.add(maxResultsParameter);

		// Send request
		Response response = null;
		try {
			if (pageToken != null) {
				// Add pageToken parameter
				RequestParameter pageTokenParameter = new RequestParameter();
				pageTokenParameter.setName(PAGE_TOKEN_PARAMETER_NAME);
				pageTokenParameter.setValue(pageToken);
				requestParameters.add(pageTokenParameter);

				url += "&%s";

				response = request(url, partParameter.getRequestNotation(), videoIdParameter.getRequestNotation(),
						maxResultsParameter.getRequestNotation(), pageTokenParameter.getRequestNotation());
			} else {
				response = request(url, partParameter.getRequestNotation(), videoIdParameter.getRequestNotation(),
						maxResultsParameter.getRequestNotation());
			}
		} catch (InterruptedException | ExecutionException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Convert Json response into Java object
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX").create();
		YouTubeCommentThreads result = null;
		try {
			result = gson.fromJson(response.getBody(), YouTubeCommentThreads.class);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Save request and response
		Request request = new Request();
		request.setUrl(url);
		request.setParameters(requestParameters);
		request.setRequestType(RequestType.GET);
		request.setNetwork(RequestNetwork.YOUTUBE);
		request.setResponse(result);

		return request;
	}

	/**
	 * Returns a {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 * object with
	 * {@link edu.hm.cs.smc.channels.youtube.models.YouTubeCommentThreads
	 * YouTubeCommentThreads} of a channel that matches the
	 * <code>channelId</code> parameter. If no match exists, the
	 * {@link edu.hm.cs.smc.channels.generic.models.Request Request} object
	 * contains <code>null</code>. Warning: the comment threads do not
	 * necessarily contain all replies to a comment! To get all replies, use
	 * {@link #getComments(String, String) getComments} instead.
	 * 
	 * @param channelId
	 *            the id of the channel for which the comment threads should be
	 *            returned
	 * @param withReplies
	 *            set this parameter's value to <code>true</code> to retrieve
	 *            top-level comments and replies, if any exist, to that
	 *            comments; to get only the top-level comments, set the value to
	 *            <code>false</code>
	 * @param pageToken
	 *            the <code>pageToken</code> identifies a specific page in the
	 *            result set that should be returned (in the response, the
	 *            <code>nextPageToken</code> and <code>prevPageToken</code>
	 *            properties identify other pages that could be retrieved)
	 * @return the {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 *         object with the matching comment threads or with
	 *         <code>null</code>
	 */
	public Request getCommentThreadsOfChannel(String channelId, Boolean withReplies, String pageToken) {
		String url = "https://www.googleapis.com/youtube/v3/commentThreads?%s&%s&%s";

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();

		// Add part parameter
		RequestParameter partParameter = new RequestParameter();
		partParameter.setName(PART_PARAMETER_NAME);
		if (withReplies) {
			partParameter.setValue("id,replies,snippet");
		} else {
			partParameter.setValue("id,snippet");
		}
		requestParameters.add(partParameter);

		// Add channelId parameter
		RequestParameter channelIdParameter = new RequestParameter();
		channelIdParameter.setName(CHANNEL_ID_PARAMETER_NAME);
		channelIdParameter.setValue(channelId);
		requestParameters.add(channelIdParameter);

		// Add maxResults parameter
		RequestParameter maxResultsParameter = new RequestParameter();
		maxResultsParameter.setName(MAX_RESULTS_PARAMETER_NAME);
		maxResultsParameter.setValue("100");
		requestParameters.add(maxResultsParameter);

		// Send request
		Response response = null;
		try {
			if (pageToken != null) {
				// Add pageToken parameter
				RequestParameter pageTokenParameter = new RequestParameter();
				pageTokenParameter.setName(PAGE_TOKEN_PARAMETER_NAME);
				pageTokenParameter.setValue(pageToken);
				requestParameters.add(pageTokenParameter);

				url += "&%s";

				response = request(url, partParameter.getRequestNotation(), channelIdParameter.getRequestNotation(),
						maxResultsParameter.getRequestNotation(), pageTokenParameter.getRequestNotation());
			} else {
				response = request(url, partParameter.getRequestNotation(), channelIdParameter.getRequestNotation(),
						maxResultsParameter.getRequestNotation());
			}
		} catch (InterruptedException | ExecutionException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Convert Json response into Java object
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX").create();
		YouTubeCommentThreads result = null;
		try {
			result = gson.fromJson(response.getBody(), YouTubeCommentThreads.class);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Save request and response
		Request request = new Request();
		request.setUrl(url);
		request.setParameters(requestParameters);
		request.setRequestType(RequestType.GET);
		request.setNetwork(RequestNetwork.YOUTUBE);
		request.setResponse(result);

		return request;
	}

	/**
	 * Returns a {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 * object with {@link edu.hm.cs.smc.channels.youtube.models.YouTubeComments
	 * YouTubeComments} that match the <code>parentId</code> parameter. If no
	 * match exists, the {@link edu.hm.cs.smc.channels.generic.models.Request
	 * Request} object contains <code>null</code>.
	 * 
	 * @param parentId
	 *            the id of the top-level comment for which the comments
	 *            (replies) should be returned
	 * @param pageToken
	 *            the <code>pageToken</code> identifies a specific page in the
	 *            result set that should be returned (in the response, the
	 *            <code>nextPageToken</code> and <code>prevPageToken</code>
	 *            properties identify other pages that could be retrieved)
	 * @return the {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 *         object with the matching comments or with <code>null</code>
	 */
	public Request getComments(String parentId, String pageToken) {
		String url = "https://www.googleapis.com/youtube/v3/comments?%s&%s&%s";

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();

		// Add part parameter
		RequestParameter partParameter = new RequestParameter();
		partParameter.setName(PART_PARAMETER_NAME);
		partParameter.setValue("id,snippet");
		requestParameters.add(partParameter);

		// Add parentId parameter
		RequestParameter parentIdParameter = new RequestParameter();
		parentIdParameter.setName(PARENT_ID_PARAMETER_NAME);
		parentIdParameter.setValue(parentId);
		requestParameters.add(parentIdParameter);

		// Add maxResults parameter
		RequestParameter maxResultsParameter = new RequestParameter();
		maxResultsParameter.setName(MAX_RESULTS_PARAMETER_NAME);
		maxResultsParameter.setValue("100");
		requestParameters.add(maxResultsParameter);

		// Send request
		Response response = null;
		try {
			if (pageToken != null) {
				// Add pageToken parameter
				RequestParameter pageTokenParameter = new RequestParameter();
				pageTokenParameter.setName(PAGE_TOKEN_PARAMETER_NAME);
				pageTokenParameter.setValue(pageToken);
				requestParameters.add(pageTokenParameter);

				url += "&%s";

				response = request(url, partParameter.getRequestNotation(), parentIdParameter.getRequestNotation(),
						maxResultsParameter.getRequestNotation(), pageTokenParameter.getRequestNotation());
			} else {
				response = request(url, partParameter.getRequestNotation(), parentIdParameter.getRequestNotation(),
						maxResultsParameter.getRequestNotation());
			}
		} catch (InterruptedException | ExecutionException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Convert Json response into Java object
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX").create();
		YouTubeComments result = null;
		try {
			result = gson.fromJson(response.getBody(), YouTubeComments.class);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Save request and response
		Request request = new Request();
		request.setUrl(url);
		request.setParameters(requestParameters);
		request.setRequestType(RequestType.GET);
		request.setNetwork(RequestNetwork.YOUTUBE);
		request.setResponse(result);

		return request;
	}

	/**
	 * Returns a {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 * object with
	 * {@link edu.hm.cs.smc.channels.youtube.models.YouTubeSubscriptions
	 * YouTubeSubscriptions} of a channel that matches the
	 * <code>channelId</code> parameter. If no match exists, the
	 * {@link edu.hm.cs.smc.channels.generic.models.Request Request} object
	 * contains <code>null</code>.
	 * 
	 * @param channelId
	 *            the id of the channel for which the subscriptions should be
	 *            returned
	 * @param pageToken
	 *            the <code>pageToken</code> identifies a specific page in the
	 *            result set that should be returned (in the response, the
	 *            <code>nextPageToken</code> and <code>prevPageToken</code>
	 *            properties identify other pages that could be retrieved)
	 * @return the {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 *         object with the matching subscriptions or with <code>null</code>
	 */
	public Request getSubscriptionsOfChannel(String channelId, String pageToken) {
		String url = "https://www.googleapis.com/youtube/v3/subscriptions?%s&%s&%s";

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();

		// Add part parameter
		RequestParameter partParameter = new RequestParameter();
		partParameter.setName(PART_PARAMETER_NAME);
		partParameter.setValue("contentDetails,id,snippet,subscriberSnippet");
		requestParameters.add(partParameter);

		// Add channelId parameter
		RequestParameter channelIdParameter = new RequestParameter();
		channelIdParameter.setName(CHANNEL_ID_PARAMETER_NAME);
		channelIdParameter.setValue(channelId);
		requestParameters.add(channelIdParameter);

		// Add maxResults parameter
		RequestParameter maxResultsParameter = new RequestParameter();
		maxResultsParameter.setName(MAX_RESULTS_PARAMETER_NAME);
		maxResultsParameter.setValue("50");
		requestParameters.add(maxResultsParameter);

		// Send request
		Response response = null;
		try {
			if (pageToken != null) {
				// Add pageToken parameter
				RequestParameter pageTokenParameter = new RequestParameter();
				pageTokenParameter.setName(PAGE_TOKEN_PARAMETER_NAME);
				pageTokenParameter.setValue(pageToken);
				requestParameters.add(pageTokenParameter);

				url += "&%s";

				response = request(url, partParameter.getRequestNotation(), channelIdParameter.getRequestNotation(),
						maxResultsParameter.getRequestNotation(), pageTokenParameter.getRequestNotation());
			} else {
				response = request(url, partParameter.getRequestNotation(), channelIdParameter.getRequestNotation(),
						maxResultsParameter.getRequestNotation());
			}
		} catch (InterruptedException | ExecutionException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Convert Json response into Java object
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX").create();
		YouTubeSubscriptions result = null;
		try {
			result = gson.fromJson(response.getBody(), YouTubeSubscriptions.class);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Save request and response
		Request request = new Request();
		request.setUrl(url);
		request.setParameters(requestParameters);
		request.setRequestType(RequestType.GET);
		request.setNetwork(RequestNetwork.YOUTUBE);
		request.setResponse(result);

		return request;
	}

	/**
	 * Returns a {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 * object with
	 * {@link edu.hm.cs.smc.channels.youtube.models.YouTubeSubscriptions
	 * YouTubeSubscriptions} of the authenticated user. If no match exists, the
	 * {@link edu.hm.cs.smc.channels.generic.models.Request Request} object
	 * contains <code>null</code>.
	 * 
	 * @param pageToken
	 *            the <code>pageToken</code> identifies a specific page in the
	 *            result set that should be returned (in the response, the
	 *            <code>nextPageToken</code> and <code>prevPageToken</code>
	 *            properties identify other pages that could be retrieved)
	 * @return the {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 *         object with the matching subscriptions or with <code>null</code>
	 */
	public Request getMySubscriptions(String pageToken) {
		String url = "https://www.googleapis.com/youtube/v3/subscriptions?%s&%s&%s";

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();

		// Add part parameter
		RequestParameter partParameter = new RequestParameter();
		partParameter.setName(PART_PARAMETER_NAME);
		partParameter.setValue("contentDetails,id,snippet,subscriberSnippet");
		requestParameters.add(partParameter);

		// Add mine parameter
		RequestParameter mineParameter = new RequestParameter();
		mineParameter.setName(MINE_PARAMETER_NAME);
		mineParameter.setValue("true");
		requestParameters.add(mineParameter);

		// Add maxResults parameter
		RequestParameter maxResultsParameter = new RequestParameter();
		maxResultsParameter.setName(MAX_RESULTS_PARAMETER_NAME);
		maxResultsParameter.setValue("50");
		requestParameters.add(maxResultsParameter);

		// Send request
		Response response = null;
		try {
			if (pageToken != null) {
				// Add pageToken parameter
				RequestParameter pageTokenParameter = new RequestParameter();
				pageTokenParameter.setName(PAGE_TOKEN_PARAMETER_NAME);
				pageTokenParameter.setValue(pageToken);
				requestParameters.add(pageTokenParameter);

				url += "&%s";

				response = request(url, partParameter.getRequestNotation(), mineParameter.getRequestNotation(),
						maxResultsParameter.getRequestNotation(), pageTokenParameter.getRequestNotation());
			} else {
				response = request(url, partParameter.getRequestNotation(), mineParameter.getRequestNotation(),
						maxResultsParameter.getRequestNotation());
			}
		} catch (InterruptedException | ExecutionException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Convert Json response into Java object
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX").create();
		YouTubeSubscriptions result = null;
		try {
			result = gson.fromJson(response.getBody(), YouTubeSubscriptions.class);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Save request and response
		Request request = new Request();
		request.setUrl(url);
		request.setParameters(requestParameters);
		request.setRequestType(RequestType.GET);
		request.setNetwork(RequestNetwork.YOUTUBE);
		request.setResponse(result);

		return request;
	}

	/**
	 * Returns a {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 * object with
	 * {@link edu.hm.cs.smc.channels.youtube.models.YouTubeSubscriptions
	 * YouTubeSubscriptions} that represent the subscribers of the authenticated
	 * user. If no match exists, the
	 * {@link edu.hm.cs.smc.channels.generic.models.Request Request} object
	 * contains <code>null</code>.
	 * 
	 * @param pageToken
	 *            the <code>pageToken</code> identifies a specific page in the
	 *            result set that should be returned (in the response, the
	 *            <code>nextPageToken</code> and <code>prevPageToken</code>
	 *            properties identify other pages that could be retrieved)
	 * @return the {@link edu.hm.cs.smc.channels.generic.models.Request Request}
	 *         object with the matching subscriptions or with <code>null</code>
	 */
	public Request getMySubscribers(String pageToken) {
		String url = "https://www.googleapis.com/youtube/v3/subscriptions?%s&%s&%s";

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();

		// Add part parameter
		RequestParameter partParameter = new RequestParameter();
		partParameter.setName(PART_PARAMETER_NAME);
		partParameter.setValue("contentDetails,id,snippet,subscriberSnippet");
		requestParameters.add(partParameter);

		// Add mySubscribers parameter
		RequestParameter mySubscribersParameter = new RequestParameter();
		mySubscribersParameter.setName(MY_SUBSCRIBERS_PARAMETER_NAME);
		mySubscribersParameter.setValue("true");
		requestParameters.add(mySubscribersParameter);

		// Add maxResults parameter
		RequestParameter maxResultsParameter = new RequestParameter();
		maxResultsParameter.setName(MAX_RESULTS_PARAMETER_NAME);
		maxResultsParameter.setValue("50");
		requestParameters.add(maxResultsParameter);

		// Send request
		Response response = null;
		try {
			if (pageToken != null) {
				// Add pageToken parameter
				RequestParameter pageTokenParameter = new RequestParameter();
				pageTokenParameter.setName(PAGE_TOKEN_PARAMETER_NAME);
				pageTokenParameter.setValue(pageToken);
				requestParameters.add(pageTokenParameter);

				url += "&%s";

				response = request(url, partParameter.getRequestNotation(), mySubscribersParameter.getRequestNotation(),
						maxResultsParameter.getRequestNotation(), pageTokenParameter.getRequestNotation());
			} else {
				response = request(url, partParameter.getRequestNotation(), mySubscribersParameter.getRequestNotation(),
						maxResultsParameter.getRequestNotation());
			}
		} catch (InterruptedException | ExecutionException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Convert Json response into Java object
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX").create();
		YouTubeSubscriptions result = null;
		try {
			result = gson.fromJson(response.getBody(), YouTubeSubscriptions.class);
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Save request and response
		Request request = new Request();
		request.setUrl(url);
		request.setParameters(requestParameters);
		request.setRequestType(RequestType.GET);
		request.setNetwork(RequestNetwork.YOUTUBE);
		request.setResponse(result);

		return request;
	}

	/**
	 * Returns the id of a channel whose name matches the
	 * <code>channelName</code> parameter. If no match exists, <code>null</code>
	 * is returned.
	 * 
	 * @param channelName
	 *            the name of the channel whose id is requested
	 * @return the id of the matching channel or <code>null</code>
	 */
	public String getChannelId(String channelName) {
		String url = "https://www.googleapis.com/youtube/v3/channels?%s&%s";

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();

		// Add part parameter
		RequestParameter partParameter = new RequestParameter();
		partParameter.setName(PART_PARAMETER_NAME);
		partParameter.setValue("id");
		requestParameters.add(partParameter);

		// Add forUsername parameter
		RequestParameter forUsernameParameter = new RequestParameter();
		forUsernameParameter.setName(FOR_USERNAME_PARAMETER_NAME);
		forUsernameParameter.setValue(channelName);
		requestParameters.add(forUsernameParameter);

		// Send request
		Response response = null;
		try {
			response = request(url, partParameter.getRequestNotation(), forUsernameParameter.getRequestNotation());
		} catch (InterruptedException | ExecutionException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Convert Json response into Java object
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX").create();
		String result = null;
		try {
			result = ((YouTubeChannel) gson.fromJson(response.getBody(), YouTubeChannels.class).getItems().get(0))
					.getId();
		} catch (JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * Returns a {@link java.util.List List} of
	 * {@link edu.hm.cs.smc.channels.generic.models.Request Requests}, which
	 * holds all results of a pageable YouTube request. Note that the
	 * {@link edu.hm.cs.smc.channels.generic.models.Request Request} object must
	 * hold an response whose type extends the
	 * {@link edu.hm.cs.smc.channels.youtube.YouTubeResponseBase
	 * YouTubeResponseBase}. Also make sure the <code>pageableRequest</code>
	 * holds the first page of the response. If there are no results,
	 * <code>null</code> is returned.
	 * 
	 * @param pageableRequest
	 *            the initial pageable request whose results are collected until
	 *            its end
	 * @return the {@link java.util.List List} of
	 *         {@link edu.hm.cs.smc.channels.generic.models.Request Requests},
	 *         which holds all results of a pageable YouTube request
	 */
	public List<Request> getAllResults(Request pageableRequest) {
		List<Request> allResults = new ArrayList<>();
		allResults.add(pageableRequest);

		Map<String, String> requestParameter = new HashMap<>();
		for (RequestParameter aParameter : pageableRequest.getParameters()) {
			requestParameter.put(aParameter.getName(), aParameter.getValue());
		}

		Request request = pageableRequest;
		String nextPageToken = ((YouTubeResponseBase) pageableRequest.getResponse()).getNextPageToken();
		while (nextPageToken != null) {
			if (pageableRequest.getResponse() instanceof YouTubePlaylists) {
				request = getPlaylists(requestParameter.get(CHANNEL_ID_PARAMETER_NAME), nextPageToken);
			} else if (pageableRequest.getResponse() instanceof YouTubePlaylistItems) {
				request = getPlaylistItems(requestParameter.get(PLAYLIST_ID_PARAMETER_NAME), nextPageToken);
			} else if (pageableRequest.getResponse() instanceof YouTubeCommentThreads) {
				String videoId = requestParameter.get(VIDEO_ID_PARAMETER_NAME);
				boolean withReplies = requestParameter.get(PART_PARAMETER_NAME).contains("replies");
				if (videoId != null) {
					request = getCommentThreadsOfVideo(videoId, withReplies, nextPageToken);
				} else {
					request = getCommentThreadsOfChannel(requestParameter.get(CHANNEL_ID_PARAMETER_NAME), withReplies,
							nextPageToken);
				}
			} else if (pageableRequest.getResponse() instanceof YouTubeComments) {
				request = getComments(requestParameter.get(PARENT_ID_PARAMETER_NAME), nextPageToken);
			} else if (pageableRequest.getResponse() instanceof YouTubeSubscriptions) {
				if (requestParameter.containsKey(CHANNEL_ID_PARAMETER_NAME)) {
					request = getSubscriptionsOfChannel(requestParameter.get(CHANNEL_ID_PARAMETER_NAME), nextPageToken);
				} else if (requestParameter.containsKey(MINE_PARAMETER_NAME)) {
					request = getMySubscriptions(nextPageToken);
				} else {
					request = getMySubscribers(nextPageToken);
				}
			}

			allResults.add(request);

			nextPageToken = ((YouTubeResponseBase) request.getResponse()).getNextPageToken();
		}

		return allResults;
	}

	/**
	 * Sends an authorized request to the YouTube Data API and returns the
	 * response.
	 * 
	 * @param url
	 *            the request url
	 * @param query
	 *            the additional request parameters
	 * @return the response of the request
	 * @throws InterruptedException
	 * @throws ExecutionException
	 * @throws IOException
	 */
	private Response request(String url, String... query) throws InterruptedException, ExecutionException, IOException {
		OAuthRequest request = new OAuthRequest(Verb.GET, String.format(url, (Object[]) query));
		service.signRequest(accessToken, request);
		Response response = service.execute(request);
		return response;
	}

}
