/*
 * To change this license header, choose License LinkedInHeaders in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hm.cs.smc.channels.facebook.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.hibernate.annotations.Type;

import com.restfb.types.Post;

import edu.hm.cs.smc.Utf8Checker;

/**
 *
 * @author yaric
 */
@Entity
@Table(name="fb_post")
public class FBPost implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;

	private String fbid;

	private String attribution;

//	@Type(type = "text")
	private String caption;

	private Long commentsCount;

	@Temporal(javax.persistence.TemporalType.DATE)
	private Date createdTime;

//	@Type(type = "text")
	private String description;

	private Long likesCount;

//	@Type(type = "text")
	private String link;

//	@Type(type = "text")
	@Column(length=1000)
	private String message;

//	@Type(type = "text")
	private String name;

//	@Type(type = "text")
	private String objectID;

//	@Type(type = "text")
	private String picture;

	private Long shareCount;

	private String type;

	private long pageID;
	
//	@Type(type = "text")
	private String pageFBID;
	
	@Type(type = "date")
	private Date datum = new Date();

	@Temporal(javax.persistence.TemporalType.DATE)
	private Date updatedTime;

	public FBPost() {
		super();
	}
	
	public FBPost(Post post, FBPage page) {
		this.attribution = post.getAttribution();
		this.caption = post.getCaption();
		this.commentsCount = post.getCommentsCount();
		this.createdTime = post.getCreatedTime();
		this.description = Utf8Checker.macheUtf8Konform(post.getDescription());
		this.fbid = post.getId();
		this.likesCount = post.getLikes() != null ? post.getLikes().getTotalCount() : null;
		this.link = post.getLink();
		this.message = Utf8Checker.macheUtf8Konform(post.getMessage());
		this.name = Utf8Checker.macheUtf8Konform(post.getName());
		this.objectID = post.getObjectId();
		this.picture = post.getPicture();
		this.shareCount = post.getSharesCount();
		this.type = post.getType();
		this.updatedTime = post.getUpdatedTime();
		this.pageID = page.getID();
		this.pageFBID = page.getFbid();
	}

	public String getPageFBID() {
		return pageFBID;
	}

	public void setPageFBID(String pageFBID) {
		this.pageFBID = pageFBID;
	}

	public String getAttribution() {
		return attribution;
	}

	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public Long getCommentsCount() {
		return commentsCount;
	}

	public void setCommentsCount(Long commentsCount) {
		this.commentsCount = commentsCount;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public String getFbid() {
		return fbid;
	}

	public void setFbid(String fbid) {
		this.fbid = fbid;
	}

	public Long getLikesCount() {
		return likesCount;
	}

	public void setLikesCount(Long likesCount) {
		this.likesCount = likesCount;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObjectID() {
		return objectID;
	}

	public void setObjectID(String objectID) {
		this.objectID = objectID;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Long getShareCount() {
		return shareCount;
	}

	public void setShareCount(Long shareCount) {
		this.shareCount = shareCount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public long getPageID() {
		return pageID;
	}

	public void setPageID(long pageID) {
		this.pageID = pageID;
	}

}
