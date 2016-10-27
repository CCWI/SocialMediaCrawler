package edu.hm.cs.smc.channels.twitter;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="twitterUser")
public class TwitterUser {
	
	private Date createdAt;
	private boolean defaultProfile;
	private boolean defaultProfileImage;
	private String description;
	private String unt;
	private String favouritesCount;
	private String followRequestSent;
	private String following;
	private String followersCount;
	private String friendsCount;
	private boolean geoEnabled;
	@Id
	private String id;
	private String idStr;
	private boolean isTranslator;
	private String lang;
	private String listedCount;
	private String location;
	private String name;
	private String notifications;
	private String profileBackgroundColor;
	private String profileBackgroundImageUrl;
	private String profileBackgroundImageUrlHttps;
	private boolean profileBackgroundTile;
	private String profileBannerUrl;
	private String profileImageUrl;
	private String profileImageUrlHttps;
	private String profileLinkColor;
	private String profileSidebarBorderColor;
	private String profileSidebarFillColor;
	private String profileTextColor;
	private boolean profileUseBackgroundImage;
	private boolean isProtected;
	private String screenName;
	private String statusesCount;
	private String timeZone;
	private String url;
	private String utcOffset;
	private boolean verified;
	
	public TwitterUser(Date createdAt, boolean defaultProfile,
			boolean defaultProfileImage, String description, String unt,
			String favouritesCount, String followRequestSent, String following,
			String followersCount, String friendsCount, boolean geoEnabled,
			String id, String idStr, boolean isTranslator, String lang,
			String listedCount, String location, String name,
			String notifications, String profileBackgroundColor,
			String profileBackgroundImageUrl,
			String profileBackgroundImageUrlHttps,
			boolean profileBackgroundTile, String profileBannerUrl,
			String profileImageUrl, String profileImageUrlHttps,
			String profileLinkColor, String profileSidebarBorderColor,
			String profileSidebarFillColor, String profileTextColor,
			boolean profileUseBackgroundImage, boolean isProtected,
			String screenName,
			String statusesCount, String timeZone, String url,
			String utcOffset, boolean verified) {
		this.createdAt = createdAt;
		this.defaultProfile = defaultProfile;
		this.defaultProfileImage = defaultProfileImage;
		this.description = description;
		this.unt = unt;
		this.favouritesCount = favouritesCount;
		this.followRequestSent = followRequestSent;
		this.following = following;
		this.followersCount = followersCount;
		this.friendsCount = friendsCount;
		this.geoEnabled = geoEnabled;
		this.id = id;
		this.idStr = idStr;
		this.isTranslator = isTranslator;
		this.lang = lang;
		this.listedCount = listedCount;
		this.location = location;
		this.name = name;
		this.notifications = notifications;
		this.profileBackgroundColor = profileBackgroundColor;
		this.profileBackgroundImageUrl = profileBackgroundImageUrl;
		this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
		this.profileBackgroundTile = profileBackgroundTile;
		this.profileBannerUrl = profileBannerUrl;
		this.profileImageUrl = profileImageUrl;
		this.profileImageUrlHttps = profileImageUrlHttps;
		this.profileLinkColor = profileLinkColor;
		this.profileSidebarBorderColor = profileSidebarBorderColor;
		this.profileSidebarFillColor = profileSidebarFillColor;
		this.profileTextColor = profileTextColor;
		this.profileUseBackgroundImage = profileUseBackgroundImage;
		this.isProtected = isProtected;
		this.screenName = screenName;
		this.statusesCount = statusesCount;
		this.timeZone = timeZone;
		this.url = url;
		this.utcOffset = utcOffset;
		this.verified = verified;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public boolean isDefaultProfile() {
		return defaultProfile;
	}
	public void setDefaultProfile(boolean defaultProfile) {
		this.defaultProfile = defaultProfile;
	}
	public boolean isDefaultProfileImage() {
		return defaultProfileImage;
	}
	public void setDefaultProfileImage(boolean defaultProfileImage) {
		this.defaultProfileImage = defaultProfileImage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUnt() {
		return unt;
	}
	public void setUnt(String unt) {
		this.unt = unt;
	}
	public String getFavouritesCount() {
		return favouritesCount;
	}
	public void setFavouritesCount(String favouritesCount) {
		this.favouritesCount = favouritesCount;
	}
	public String getFollowRequestSent() {
		return followRequestSent;
	}
	public void setFollowRequestSent(String followRequestSent) {
		this.followRequestSent = followRequestSent;
	}
	public String getFollowing() {
		return following;
	}
	public void setFollowing(String following) {
		this.following = following;
	}
	public String getFollowersCount() {
		return followersCount;
	}
	public void setFollowersCount(String followersCount) {
		this.followersCount = followersCount;
	}
	public String getFriendsCount() {
		return friendsCount;
	}
	public void setFriendsCount(String friendsCount) {
		this.friendsCount = friendsCount;
	}
	public boolean isGeoEnabled() {
		return geoEnabled;
	}
	public void setGeoEnabled(boolean geoEnabled) {
		this.geoEnabled = geoEnabled;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdStr() {
		return idStr;
	}
	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}
	public boolean isTranslator() {
		return isTranslator;
	}
	public void setTranslator(boolean isTranslator) {
		this.isTranslator = isTranslator;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getListedCount() {
		return listedCount;
	}
	public void setListedCount(String listedCount) {
		this.listedCount = listedCount;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String isNotifications() {
		return notifications;
	}
	public void setNotifications(String notifications) {
		this.notifications = notifications;
	}
	public String getProfileBackgroundColor() {
		return profileBackgroundColor;
	}
	public void setProfileBackgroundColor(String profileBackgroundColor) {
		this.profileBackgroundColor = profileBackgroundColor;
	}
	public String getProfileBackgroundImageUrl() {
		return profileBackgroundImageUrl;
	}
	public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
		this.profileBackgroundImageUrl = profileBackgroundImageUrl;
	}
	public String getProfileBackgroundImageUrlHttps() {
		return profileBackgroundImageUrlHttps;
	}
	public void setProfileBackgroundImageUrlHttps(
			String profileBackgroundImageUrlHttps) {
		this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
	}
	public boolean isProfileBackgroundTile() {
		return profileBackgroundTile;
	}
	public void setProfileBackgroundTile(boolean profileBackgroundTile) {
		this.profileBackgroundTile = profileBackgroundTile;
	}
	public String getProfileBannerUrl() {
		return profileBannerUrl;
	}
	public void setProfileBannerUrl(String profileBannerUrl) {
		this.profileBannerUrl = profileBannerUrl;
	}
	public String getProfileImageUrl() {
		return profileImageUrl;
	}
	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}
	public String getProfileImageUrlHttps() {
		return profileImageUrlHttps;
	}
	public void setProfileImageUrlHttps(String profileImageUrlHttps) {
		this.profileImageUrlHttps = profileImageUrlHttps;
	}
	public String getProfileLinkColor() {
		return profileLinkColor;
	}
	public void setProfileLinkColor(String profileLinkColor) {
		this.profileLinkColor = profileLinkColor;
	}
	public String getProfileSidebarBorderColor() {
		return profileSidebarBorderColor;
	}
	public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
		this.profileSidebarBorderColor = profileSidebarBorderColor;
	}
	public String getProfileSidebarFillColor() {
		return profileSidebarFillColor;
	}
	public void setProfileSidebarFillColor(String profileSidebarFillColor) {
		this.profileSidebarFillColor = profileSidebarFillColor;
	}
	public String getProfileTextColor() {
		return profileTextColor;
	}
	public void setProfileTextColor(String profileTextColor) {
		this.profileTextColor = profileTextColor;
	}
	public boolean isProfileUseBackgroundImage() {
		return profileUseBackgroundImage;
	}
	public void setProfileUseBackgroundImage(boolean profileUseBackgroundImage) {
		this.profileUseBackgroundImage = profileUseBackgroundImage;
	}
	public boolean isProtected() {
		return isProtected;
	}
	public void setProtected(boolean isProtected) {
		this.isProtected = isProtected;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public String getStatusesCount() {
		return this.statusesCount;
	}
	public void setStatusesCount(String statusesCount) {
		this.statusesCount = statusesCount;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUtcOffset() {
		return utcOffset;
	}
	public void setUtcOffset(String utcOffset) {
		this.utcOffset = utcOffset;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	
}
	
