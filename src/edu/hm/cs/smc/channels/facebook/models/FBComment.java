/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hm.cs.smc.channels.facebook.models;

import com.restfb.types.Comment;

import edu.hm.cs.smc.Utf8Checker;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.hibernate.annotations.Type;

/**
 *
 * @author yaric
 */
@Entity
@Table(name="fb_comment")
public class FBComment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1990586136540424112L;

	@Id
	@GeneratedValue
	private long id;

	private String fbid;

	@Temporal(javax.persistence.TemporalType.DATE)
	private Date createdTime;

	private Long likesCount;

//	@Type(type = "text")
	private String message;

	private String type;

	private long postID;
	
//	@Type(type = "text")
	private String postFBID;
	


	@Type(type = "date")
	private Date datum = new Date();

	public FBComment() {
		super();
	}
	
	public FBComment(Comment comment, FBPost post) {
		this.fbid = comment.getId();
		this.createdTime = comment.getCreatedTime();
		this.message = Utf8Checker.macheUtf8Konform(comment.getMessage());
		this.likesCount = comment.getLikeCount();
		this.type = comment.getType();
		this.postID = post.getId();
		this.postFBID = post.getFbid();
	}

	public String getPostFBID() {
		return postFBID;
	}

	public void setPostFBID(String postFBID) {
		this.postFBID = postFBID;
	}

	public String getId() {
		return fbid;
	}

	public void setId(String id) {
		this.fbid = id;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Long getLikesCount() {
		return likesCount;
	}

	public void setLikesCount(Long likesCount) {
		this.likesCount = likesCount;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public long getPostID() {
		return postID;
	}

	public void setPostID(long postID) {
		this.postID = postID;
	}

}
