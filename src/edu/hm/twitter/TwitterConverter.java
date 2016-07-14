package edu.hm.twitter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.json.*;

public class TwitterConverter {

	TwitterStatus twitterStatus;

	public TwitterConverter() {
		this.twitterStatus = null;
	}

	public void generateTwitterObjects(String jsonString) {

		JSONObject jsonObject = new JSONObject(jsonString);

		// General Tweet Status Infos
		String createdAtStr = getStringOrNull(jsonObject, "created_at");
		Date createdAt = getTwitterDate(createdAtStr);
		String favoriteCount = getStringOrNull(jsonObject, "favorite_count");
		boolean favorited = false;
		try {
			favorited = jsonObject.getBoolean("favorited");
		} catch (Exception ex) {
			
		}
		String filterLevel = getStringOrNull(jsonObject, "filter_level");
		String id = getStringOrNull(jsonObject, "id");
		String idStr = getStringOrNull(jsonObject, "id_str");
		String inReplyToScreenName = getStringOrNull(jsonObject,
				"in_reply_to_screen_name");
		String inReplyToStatusId = getStringOrNull(jsonObject,
				"in_reply_to_status_id");
		String inReplyToStatusIdStr = getStringOrNull(jsonObject,
				"in_reply_to_status_id_str");
		String inReplyToUserId = getStringOrNull(jsonObject,
				"in_reply_to_user_id");
		String inReplyToUserIdStr = getStringOrNull(jsonObject,
				"in_reply_to_user_id_str");
		String lang = getStringOrNull(jsonObject, "lang");
		
		boolean possiblySensitive = false;
		try {
			possiblySensitive = jsonObject.getBoolean("possibly_sensitive");
		} catch (Exception e) {
			
		}
		
		String quotedStatusId = getStringOrNull(jsonObject, "quoted_status_id");
		String quotedStatusIdStr = getStringOrNull(jsonObject,
				"quoted_status_id_str");
		String retweetCount = getStringOrNull(jsonObject, "retweet_count");
		
		boolean retweeted = false;
		try {
			retweeted = jsonObject.getBoolean("retweeted");
		} catch (Exception e) {
			
		}
		String source = getStringOrNull(jsonObject, "source");
		
		String text = getStringOrNull(jsonObject, "text");
		
		boolean truncated = false;
		try {
			truncated = jsonObject.getBoolean("truncated");
		} catch (Exception e) {
			
		}

		// Twitter User
		JSONObject twUserObject = jsonObject.getJSONObject("user");

		// User Tweet Infos
		String userCreatedAtStr = getStringOrNull(twUserObject, "created_at");
		Date userCreatedAt = getTwitterDate(userCreatedAtStr);
		
		boolean defaultProfile = true;
		try {
			defaultProfile = twUserObject.getBoolean("default_profile");
		} catch (Exception e) {
			
		}
		
		boolean defaultProfileImage = true;
		try {
			defaultProfileImage = twUserObject
					.getBoolean("default_profile_image");
		} catch (Exception e) {
			
		}
		
		String description = getStringOrNull(twUserObject, "description");
		String unt = getStringOrNull(twUserObject, "unt");
		String favouritesCount = getStringOrNull(twUserObject,
				"favourites_count");
		String followRequestSent = getStringOrNull(twUserObject,
				"follow_request_sent");
		String following = getStringOrNull(twUserObject, "following");
		String followersCount = getStringOrNull(twUserObject, "followers_count");
		String friendsCount = getStringOrNull(twUserObject, "friends_count");
		
		boolean geoEnabled = false;
		try {
			geoEnabled = twUserObject.getBoolean("geo_enabled");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		String userId = getStringOrNull(twUserObject, "id");
		String userIdStr = getStringOrNull(twUserObject, "id_str");
		
		boolean isTranslator = false;
		try {
			isTranslator = twUserObject.getBoolean("is_translator");
		} catch (Exception e) {
			
		}
		
		String langUser = getStringOrNull(twUserObject, "lang");
		String listedCount = getStringOrNull(twUserObject, "listed_count");
		String location = getStringOrNull(twUserObject, "location");
		String name = getStringOrNull(twUserObject, "name");
		String notifications = getStringOrNull(twUserObject, "notifications");
		String profileBackgroundColor = getStringOrNull(twUserObject,
				"profile_background_color");
		String profileBackgroundImageUrl = getStringOrNull(twUserObject,
				"profile_background_image_url");
		String profileBackgroundImageUrlHttps = getStringOrNull(twUserObject,
				"profile_background_image_url_https");
		
		boolean profileBackgroundTile = false;
		try {
			profileBackgroundTile = twUserObject
					.getBoolean("profile_background_tile");
		} catch (Exception e) {
			
		}
		
		String profileBannerUrl = getStringOrNull(twUserObject,
				"profile_banner_url");
		String profileImageUrl = getStringOrNull(twUserObject,
				"profile_image_url");
		String profileImageUrlHttps = getStringOrNull(twUserObject,
				"profile_image_url_https");
		String profileLinkColor = getStringOrNull(twUserObject,
				"profile_link_color");
		String profileSidebarBorderColor = getStringOrNull(twUserObject,
				"profile_sidebar_border_color");
		String profileSidebarFillColor = getStringOrNull(twUserObject,
				"profile_sidebar_fill_color");
		String profileTextColor = getStringOrNull(twUserObject,
				"profile_text_color");
		
		boolean profileUseBackgroundImage = false;
		try {
			profileUseBackgroundImage = twUserObject
					.getBoolean("profile_use_background_image");
		} catch (Exception e) {
			
		}
		
		boolean isProtected = true;
		try {
			isProtected = twUserObject.getBoolean("protected");
		} catch (Exception e) {
			
		}
		
		String screenName = getStringOrNull(twUserObject, "screen_name");
		String statusesCount = getStringOrNull(twUserObject, "statuses_count");
		String timeZone = getStringOrNull(twUserObject, "time_zone");
		String url = getStringOrNull(twUserObject, "url");
		String utcOffset = getStringOrNull(twUserObject, "utc_offset");
		
		boolean verified = false;
		try {
			verified = twUserObject.getBoolean("verified");
		} catch (Exception e) {
	
		}

		// Entities auslesen
		TwitterEntities twitterEntities = readEntities(jsonObject, id);

		TwitterUser twitterUser = new TwitterUser(userCreatedAt,
				defaultProfile, defaultProfileImage, description, unt,
				favouritesCount, followRequestSent, following, followersCount,
				friendsCount, geoEnabled, userId, userIdStr, isTranslator,
				langUser, listedCount, location, name, notifications,
				profileBackgroundColor, profileBackgroundImageUrl,
				profileBackgroundImageUrlHttps, profileBackgroundTile,
				profileBannerUrl, profileImageUrl, profileImageUrlHttps,
				profileLinkColor, profileSidebarBorderColor,
				profileSidebarFillColor, profileTextColor,
				profileUseBackgroundImage, isProtected, screenName,
				statusesCount, timeZone, url, utcOffset, verified);
		TwitterStatus twitterStatus = new TwitterStatus(createdAt,
				favoriteCount, favorited, filterLevel, id, idStr,
				inReplyToScreenName, inReplyToStatusId, inReplyToStatusIdStr,
				inReplyToUserId, inReplyToUserIdStr, lang, possiblySensitive,
				quotedStatusId, quotedStatusIdStr, retweetCount, retweeted,
				source, text, truncated, userId, twitterUser, twitterEntities);

		this.twitterStatus = twitterStatus;

	}

	private TwitterEntities readEntities(JSONObject jsonObject, String statusId) {

		JSONObject twEntities;

		try {
			twEntities = jsonObject.getJSONObject("entities");
		} catch (JSONException ex) {
			return null;
		}

		TwitterEntities twitterEntities = new TwitterEntities();
		
		// URLs auslesen

		try {
			JSONArray array = twEntities.getJSONArray("urls");

			List<TwitterUrl> twitterUrls = new ArrayList<TwitterUrl>();

			for (int i = 0; i < array.length(); i++) {

				JSONObject object = array.getJSONObject(i);
				String url = getStringOrNull(object, "url");
				String expandedUrl = getStringOrNull(object, "expanded_url");
				String displayUrl = getStringOrNull(object, "display_url");
				
				TwitterUrl twitterUrl = new TwitterUrl(statusId, url, expandedUrl, displayUrl);
				twitterUrls.add(twitterUrl);

			}
			
			twitterEntities.setTwitterUrl(twitterUrls);

		} catch (JSONException ex) {
		}
		
		// Hashtags auslesen
		
		try {
			JSONArray array = twEntities.getJSONArray("hashtags");

			List<TwitterHashtag> twitterHashtags = new ArrayList<TwitterHashtag>();

			for (int i = 0; i < array.length(); i++) {

				JSONObject object = array.getJSONObject(i);
				String text = getStringOrNull(object, "text");
				
				TwitterHashtag twitterHashtag = new TwitterHashtag(statusId, text);
				twitterHashtags.add(twitterHashtag);

			}
			
			twitterEntities.setTwitterHashTag(twitterHashtags);

		} catch (JSONException ex) {
		}
		
		// Media auslesen
		
		try {
			JSONArray array = twEntities.getJSONArray("media");

			List<TwitterMedia> twitterMedias = new ArrayList<TwitterMedia>();

			for (int i = 0; i < array.length(); i++) {

				JSONObject object = array.getJSONObject(i);
				String mediaId = getStringOrNull(object, "id");
				String mediaIdStr = getStringOrNull(object, "id_str");
				String mediaUrl = getStringOrNull(object, "media_url");
				String mediaUrlHttps = getStringOrNull(object, "media_url_https");
				String url = getStringOrNull(object, "url");
				String displayUrl = getStringOrNull(object, "display_url");
				String expandedUrl = getStringOrNull(object, "expanded_url");
				String type = getStringOrNull(object, "type");
				
				TwitterMedia twitterMedia = new TwitterMedia(statusId, mediaId, mediaIdStr,
						mediaUrl, mediaUrlHttps, url, displayUrl, expandedUrl, type);
				twitterMedias.add(twitterMedia);

			}
			
			twitterEntities.setTwitterMedia(twitterMedias);

		} catch (JSONException ex) {
		}

		return twitterEntities;
	}

	private static Date getTwitterDate(String date) {

		final String TWITTERFORMAT = "EEE MMM dd HH:mm:ss ZZZZZ yyyy";
		SimpleDateFormat format = new SimpleDateFormat(TWITTERFORMAT,
				Locale.ENGLISH);
		format.setLenient(true);
		Date result;
		try {
			result = format.parse(date);
			return result;
		} catch (ParseException e) {
			return null;
		}

	}

	public static String getTwitterDateString(Date date) throws ParseException {
		final String TWITTERAPIFORMAT = "yyyy-MM-dd";
		SimpleDateFormat format = new SimpleDateFormat(TWITTERAPIFORMAT);
		return format.format(date);
	}

	public TwitterStatus getTwitterStatus() {
		return this.twitterStatus;
	}

	private String getStringOrNull(JSONObject object, String key) {
		try {
			return object.get(key).toString();
		} catch (JSONException e) {
			return "NULL";
		}
	}

}
