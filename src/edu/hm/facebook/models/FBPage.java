package edu.hm.facebook.models;

import com.restfb.types.Page;

import edu.hm.socialmediacrawler.Utf8Checker;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/**
 *
 * @author yaric
 */
@Entity
@Table(name="fb_page")
public class FBPage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long ID;

	private String fbid;

	private String about;

	private String bookingAgent;

	private String category;

	private Integer checkins;

//	@Type(type = "text")
	private String description;

	private String directedBy;

	private String founded;

//	@Type(type = "text")
	private String generalInfo;

	private String generalManager;

	private Boolean communityPage;

	private Boolean isPublished;

	private Long likes;

	private String link;

//	private Location location;

	private String mission;

	private String name;

	private String nameWithLocationDescriptor;

	private String phone;

	//private String picture;

	private String pressContact;

	private String products;

	private Long talkingAboutCount;

	private String type;

	private String usernamme;

//	@Type(type = "text")
	private String website;
	
	@Type(type = "date")
	private Date datum = new Date();

	public FBPage() {
		super();
	}
	
	public FBPage(Page page) {
		this.about = Utf8Checker.macheUtf8Konform(page.getAbout());
		this.bookingAgent = page.getBookingAgent();
		this.category = page.getCategory();
		this.checkins = page.getCheckins();
		this.description = Utf8Checker.macheUtf8Konform(page.getDescription());
		this.directedBy = page.getDirectedBy();
		this.founded = page.getFounded();
		this.generalInfo = Utf8Checker.macheUtf8Konform(page.getGeneralInfo());
		this.generalManager = page.getGeneralManager();
		this.fbid = page.getId();
		this.communityPage = page.getIsCommunityPage();
		this.isPublished = page.getIsPublished();
		this.likes = page.getLikes();
		this.link = page.getLink();
		this.mission = page.getMission();
		this.name = Utf8Checker.macheUtf8Konform(page.getName());
		this.nameWithLocationDescriptor = page.getNameWithLocationDescriptor();
		this.phone = page.getPhone();
		this.pressContact = page.getPressContact();
		this.products = page.getProducts();
		this.talkingAboutCount = page.getTalkingAboutCount();
		this.type = page.getType();
		this.usernamme = page.getUsername();
		this.website = page.getWebsite();
	}

	public long getID() {
		return ID;
	}

	public String getFbid() {
		return fbid;
	}

	public void setFbid(String fbid) {
		this.fbid = fbid;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getBookingAgent() {
		return bookingAgent;
	}

	public void setBookingAgent(String bookingAgent) {
		this.bookingAgent = bookingAgent;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getCheckins() {
		return checkins;
	}

	public void setCheckins(Integer checkins) {
		this.checkins = checkins;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDirectedBy() {
		return directedBy;
	}

	public void setDirectedBy(String directedBy) {
		this.directedBy = directedBy;
	}

	public String getFounded() {
		return founded;
	}

	public void setFounded(String founded) {
		this.founded = founded;
	}

	public String getGeneralInfo() {
		return generalInfo;
	}

	public void setGeneralInfo(String generalInfo) {
		this.generalInfo = generalInfo;
	}

	public String getGeneralManager() {
		return generalManager;
	}

	public void setGeneralManager(String generalManager) {
		this.generalManager = generalManager;
	}

	public Boolean getCommunityPage() {
		return communityPage;
	}

	public void setCommunityPage(Boolean communityPage) {
		this.communityPage = communityPage;
	}

	public Boolean getIsPublished() {
		return isPublished;
	}

	public void setIsPublished(Boolean isPublished) {
		this.isPublished = isPublished;
	}

	public Long getLikes() {
		return likes;
	}

	public void setLikes(Long likes) {
		this.likes = likes;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

//	public Location getLocation() {
//		return location;
//	}
//
//	public void setLocation(Location location) {
//		this.location = location;
//	}

	public String getMission() {
		return mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameWithLocationDescriptor() {
		return nameWithLocationDescriptor;
	}

	public void setNameWithLocationDescriptor(String nameWithLocationDescriptor) {
		this.nameWithLocationDescriptor = nameWithLocationDescriptor;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

//	public String getPicture() {
//		return picture;
//	}

//	public void setPicture(String picture) {
//		this.picture = picture;
//	}

	public String getPressContact() {
		return pressContact;
	}

	public void setPressContact(String pressContact) {
		this.pressContact = pressContact;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	public Long getTalkingAboutCount() {
		return talkingAboutCount;
	}

	public void setTalkingAboutCount(Long talkingAboutCount) {
		this.talkingAboutCount = talkingAboutCount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUsernamme() {
		return usernamme;
	}

	public void setUsernamme(String usernamme) {
		this.usernamme = usernamme;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}
