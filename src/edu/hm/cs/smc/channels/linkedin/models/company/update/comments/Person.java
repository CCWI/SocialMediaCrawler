package edu.hm.cs.smc.channels.linkedin.models.company.update.comments;

import java.net.URL;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Person {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	@OneToOne(cascade=CascadeType.ALL)
	private ApiStandardProfileRequest apiStandardProfileRequst;
	private String firstName;
	private String headline;
	private int id;
	private String lastName;
	private URL pictureUrl;
	@OneToOne(cascade=CascadeType.ALL)
	private SiteStandardProfileRequest siteStandardProfileRequest;
	
	public String getDbid() {
		return dbid;
	}
	public void setDbid(String dbid) {
		this.dbid = dbid;
	}
	public ApiStandardProfileRequest getApiStandardProfileRequst() {
		return apiStandardProfileRequst;
	}
	public void setApiStandardProfileRequst(ApiStandardProfileRequest apiStandardProfileRequst) {
		this.apiStandardProfileRequst = apiStandardProfileRequst;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public URL getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(URL pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public SiteStandardProfileRequest getSiteStandardProfileRequest() {
		return siteStandardProfileRequest;
	}
	public void setSiteStandardProfileRequest(SiteStandardProfileRequest siteStandardProfileRequest) {
		this.siteStandardProfileRequest = siteStandardProfileRequest;
	}
}
