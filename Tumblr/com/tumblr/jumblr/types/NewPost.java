package com.tumblr.jumblr.types;

import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import javax.persistence.*;

import org.apache.commons.lang3.StringUtils;
@Entity
@Table(name = "tumblrPosts")//, uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
public class NewPost implements Serializable{
	@Id
    @GeneratedValue
    @Column(name="id", nullable=false, unique=true, length=11)
	private long id;
	
	@Column(name="postid", columnDefinition="LONG")
    private Long postid;
	@Column(name="author", columnDefinition="TEXT")
    private String author;
	@Column(name="reblog_key", columnDefinition="TEXT")
    private String reblog_key;
	@Column(name="blog_name", columnDefinition="TEXT")
    private String blog_name;
	@Column(name="post_url", columnDefinition="TEXT")
    private String post_url;
	@Column(name="short_url", columnDefinition="TEXT")
	private String short_url;
	@Column(name="type", columnDefinition="TEXT")
    private String type;
	@Column(name="timestamp", columnDefinition="LONG")
    private Long timestamp;
	@Column(name="liked_timestamp", columnDefinition="LONG")
    private Long liked_timestamp;
	@Column(name="state", columnDefinition="TEXT")
	private String state;
	@Column(name="format", columnDefinition="TEXT")
	private String format;
	@Column(name="date", columnDefinition="TEXT")
    private String date;
	@Column(name="bookmarklet", columnDefinition="BOOLEAN")
    private Boolean bookmarklet;
    @Column(name="mobile", columnDefinition="BOOLEAN")
    private Boolean mobile;
	@Column(name="source_url", columnDefinition="TEXT")
    private String source_url;
	@Column(name="source_title", columnDefinition="TEXT")
    private String source_title;
    private Boolean liked;
    @Column(name="slug", columnDefinition="TEXT")
    private String slug;
    @Column(name="reblogged_from_id", columnDefinition="LONG")
    private Long reblogged_from_id;
    @Column(name="reblogged_from_name", columnDefinition="TEXT")
    private String reblogged_from_name;
    @Column(name="note_count", columnDefinition="LONG")
    private Long note_count;
    @Column(name="tag", columnDefinition="TEXT")
    private String tag;
    @Column(name="text", columnDefinition="TEXT")
    private String text;
    
    public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public NewPost(){};
    public NewPost(Post post) {
		this.postid = post.getId();
		this.author = post.getAuthorId();
		this.reblog_key = post.getReblogKey();
		this.blog_name = post.getBlogName();
		this.post_url = post.getPostUrl();
		this.short_url = post.getShortUrl();
		this.type = post.getType();
		this.timestamp = post.getTimestamp();
		this.liked_timestamp = post.getLikedTimestamp();
		this.state = post.getState();
		this.format = post.getState();
		this.date = post.getDateGMT();
		this.bookmarklet = post.isBookmarklet();
		this.mobile = post.isMobile();
		this.source_url = post.getSourceUrl();
		this.source_title = post.getSourceTitle();
		this.liked = post.isLiked();
		this.slug = post.getSlug();
		this.reblogged_from_id = post.getRebloggedFromId();
		this.reblogged_from_name = post.getRebloggedFromName();
		this.note_count = post.getNoteCount();
//		this.notes = notes;
		this.tag = post.getTagString();
//		this.text = null;
	}

	/**
     * Get the id of the author of the post
     * @return possibly null author id
     */
    public String getAuthorId() {
        return author;
    }

    /**
     * Get whether or not this post is liked
     * @return boolean
     */
    public Boolean isLiked() {
        return liked;
    }

    /**
     * Get the source title for this post
     * @return source title
     */
    public String getSourceTitle() {
        return source_title;
    }

    /**
     * Get the source URL for this post
     * @return source URL
     */
    public String getSourceUrl() {
        return source_url;
    }

    /**
     * Get whether or not this post was from mobile
     * @return boolean
     */
    public Boolean isMobile() {
        return mobile;
    }

    /**
     * Get whether or not this post was from the bookmarklet
     * @return boolean
     */
    public Boolean isBookmarklet() {
        return bookmarklet;
    }

    /**
     * Get the format for this post
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * Get the current state for this post
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Get the post URL for this post
     * @return the URL
     */
    public String getPostUrl() {
        return post_url;
    }

    /**
     * Get the short URL for this post
     * @return the URL
     */
    public String getShortUrl() {
        return short_url;
    }



    /**
     * Get the note count for this post
     * @return the note count
     */
    public Long getNoteCount() {
        return note_count;
    }

    /**
     * Get date of this post as String
     * @return date GMT string
     */
    public String getDateGMT() {
        return date;
    }

    /**
     * Get the timestamp of this post
     * @return timestamp since epoch
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Get timestamp of when this post was liked
     * @return the timestamp of when this post was liked
     */
    public Long getLikedTimestamp() { return liked_timestamp; }

    /**
     * Get the type of this post
     * @return type as String
     */
    public String getType() {
        return type;
    }

    /**
     * Get this post's ID
     * @return the ID
     */
    public Long getId() {
        return postid;
    }

    /**
     * Get the blog name
     * @return the blog name for the post
     */
    public String getBlogName() {
        return blog_name;
    }

    /**
     * Get the reblog key
     * @return the reblog key
     */
    public String getReblogKey() {
        return this.reblog_key;
    }

    /**
     * Get the slug
     * @return possibly null reblog key
     */
    public String getSlug() {
        return this.slug;
    }

    /**
     * Get the ID of the post that this post reblogged
     * @return the ID
     */
    public Long getRebloggedFromId() {
        return reblogged_from_id;
    }

    /**
     * Get name of the blog that this post reblogged
     * @return the blog name for the post that this post reblogged
     */
    public String getRebloggedFromName() {
        return reblogged_from_name;
    }



    /**
     * Set the blog name for this post
     * @param blogName the blog name to set
     */
    public void setBlogName(String blogName) {
        blog_name = blogName;
    }

    /**
     * Set the id for this post
     * @param id The id of the post
     */
    public void setId(long id) {
        this.postid = id;
    }

    /**
     * Set the format
     * @param format the format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * Set the slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * Set the data as a string
     * @param dateString the date to set
     */
    public void setDate(String dateString) {
        this.date = dateString;
    }

    /**
     * Set the date as a date
     * @param date the date to set
     */
    public void setDate(Date date) {
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        setDate(df.format(date));
    }

    /**
     * Set the state for this post
     * @param state the state
     */
    public void setState(String state) {
        this.state = state;
    }


   /**
     * Post toString
     * @return a nice representation of this post
     */
    @Override
    public String toString() {
        return "[" + this.getClass().getName() + " (" + blog_name + ":" + postid + ")]";
    }



}
