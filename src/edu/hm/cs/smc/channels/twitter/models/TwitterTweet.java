package edu.hm.cs.smc.channels.twitter.models;
import java.util.List;
import javax.persistence.*;

import edu.hm.cs.smc.Utf8Checker;
import edu.hm.cs.smc.database.models.BaseEntity;
/**
 * Tweets are the basic atomic building block of all things Twitter. Tweets, also known more generically as "status updates". Tweets can be embedded, replied to, favorited, unfavorited and deleted.
 */
@Entity
public class TwitterTweet extends BaseEntity {
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="tweetContributors_fk")
	private List<TwitterContributor> contributors;
	@OneToOne(cascade=CascadeType.ALL)	
	private TwitterCoordinates coordinates;
	private String created_at;
	@OneToOne(cascade=CascadeType.ALL)
	private TwitterCurrentUserRetweet current_user_retweet;
	@OneToOne(cascade=CascadeType.ALL)	
	private TwitterEntities entities;
	private int favorite_count;
	private boolean favorited;
	private String filter_level;
//	private Object geo = null;
	private long id;
	private String id_str;
	private String in_reply_to_screen_name;
	private long in_reply_to_status_id;
	private String in_reply_to_status_id_str;
	private long in_reply_to_user_id;
	private String in_reply_to_user_id_str;
	private String lang;
	@OneToOne(cascade=CascadeType.ALL)
	private TwitterPlace place;
	private boolean possibly_sensitive;
	private boolean is_quote_status;
	private long quoted_status_id;
	private String quoted_status_id_str;
//	private Tweet quoted_status = null;
//	private Object scopes = null;
	private int retweet_count;
	private boolean retweeted;
//	private Tweet retweeted_status = null;
	private String source;
	private String text;
	private boolean truncated;
	@OneToOne(cascade=CascadeType.ALL)
	private TwitterUser user;
	private long timestamp_ms;
	private boolean withheld_copyright;
	private String[] withheld_in_countries;
	private String withheld_scope;
	
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public List<TwitterContributor> getContributors() {
		return contributors;
	}
	public void setContributors(List<TwitterContributor> contributors) {
		this.contributors = contributors;
	}
	public TwitterCoordinates getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(TwitterCoordinates coordinates) {
		this.coordinates = coordinates;
	}
	public String getCreatedAt() {
		return created_at;
	}
	public void setCreatedAt(String createdAt) {
		this.created_at = createdAt;
	}
	public TwitterCurrentUserRetweet getCurrent_user_retweet() {
		return current_user_retweet;
	}
	public void setCurrent_user_retweet(TwitterCurrentUserRetweet current_user_retweet) {
		this.current_user_retweet = current_user_retweet;
	}
	public TwitterEntities getEntities() {
		return entities;
	}
	public void setEntities(TwitterEntities entities) {
		this.entities = entities;
	}
	public int getFavorite_count() {
		return favorite_count;
	}
	public void setFavorite_count(int favorite_count) {
		this.favorite_count = favorite_count;
	}
	public boolean isFavorited() {
		return favorited;
	}
	public void setFavorited(boolean favorited) {
		this.favorited = favorited;
	}
	public String getFilter_level() {
		return filter_level;
	}
	public void setFilter_level(String filter_level) {
		this.filter_level = filter_level;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getId_str() {
		return id_str;
	}
	public void setId_str(String id_str) {
		this.id_str = id_str;
	}
	public String getIn_reply_to_screen_name() {
		return in_reply_to_screen_name;
	}
	public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
		this.in_reply_to_screen_name = in_reply_to_screen_name;
	}
	public long getIn_reply_to_status_id() {
		return in_reply_to_status_id;
	}
	public void setIn_reply_to_status_id(long in_reply_to_status_id) {
		this.in_reply_to_status_id = in_reply_to_status_id;
	}
	public String getIn_reply_to_status_id_str() {
		return in_reply_to_status_id_str;
	}
	public void setIn_reply_to_status_id_str(String in_reply_to_status_id_str) {
		this.in_reply_to_status_id_str = in_reply_to_status_id_str;
	}
	public long getIn_reply_to_user_id() {
		return in_reply_to_user_id;
	}
	public void setIn_reply_to_user_id(long in_reply_to_user_id) {
		this.in_reply_to_user_id = in_reply_to_user_id;
	}
	public String getIn_reply_to_user_id_str() {
		return in_reply_to_user_id_str;
	}
	public void setIn_reply_to_user_id_str(String in_reply_to_user_id_str) {
		this.in_reply_to_user_id_str = in_reply_to_user_id_str;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public TwitterPlace getPlace() {
		return place;
	}
	public void setPlace(TwitterPlace place) {
		this.place = place;
	}
	public boolean isPossibly_sensitive() {
		return possibly_sensitive;
	}
	public void setPossibly_sensitive(boolean possibly_sensitive) {
		this.possibly_sensitive = possibly_sensitive;
	}
	public boolean isIs_quote_status() {
		return is_quote_status;
	}
	public void setIs_quote_status(boolean is_quote_status) {
		this.is_quote_status = is_quote_status;
	}
	public long getQuoted_status_id() {
		return quoted_status_id;
	}
	public void setQuoted_status_id(long quoted_status_id) {
		this.quoted_status_id = quoted_status_id;
	}
	public String getQuoted_status_id_str() {
		return quoted_status_id_str;
	}
	public void setQuoted_status_id_str(String quoted_status_id_str) {
		this.quoted_status_id_str = quoted_status_id_str;
	}
	public int getRetweet_count() {
		return retweet_count;
	}
	public void setRetweet_count(int retweet_count) {
		this.retweet_count = retweet_count;
	}
	public boolean isRetweeted() {
		return retweeted;
	}
	public void setRetweeted(boolean retweeted) {
		this.retweeted = retweeted;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = Utf8Checker.macheUtf8Konform(text);
	}
	public boolean isTruncated() {
		return truncated;
	}
	public void setTruncated(boolean truncated) {
		this.truncated = truncated;
	}
	public TwitterUser getUser() {
		return user;
	}
	public void setUser(TwitterUser user) {
		this.user = user;
	}
	public long getTimestamp_ms() {
		return timestamp_ms;
	}
	public void setTimestamp_ms(long timestamp_ms) {
		this.timestamp_ms = timestamp_ms;
	}
	public boolean isWithheld_copyright() {
		return withheld_copyright;
	}
	public void setWithheld_copyright(boolean withheld_copyright) {
		this.withheld_copyright = withheld_copyright;
	}
	public String[] getWithheld_in_countries() {
		return withheld_in_countries;
	}
	public void setWithheld_in_countries(String[] withheld_in_countries) {
		this.withheld_in_countries = withheld_in_countries;
	}
	public String getWithheld_scope() {
		return withheld_scope;
	}
	public void setWithheld_scope(String withheld_scope) {
		this.withheld_scope = withheld_scope;
	}
}
