package edu.hm.cs.smc.channels.linkedin.models;

import java.net.URL;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInPerson extends BaseEntity {
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInApiStandardProfileRequest apiStandardProfileRequst;
	private String firstName;
	private String headline;
	private int id;
	private String lastName;
	private URL pictureUrl;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInSiteStandardProfileRequest siteStandardProfileRequest;
	
	public LinkedInApiStandardProfileRequest getApiStandardProfileRequst() {
		return apiStandardProfileRequst;
	}
	public void setApiStandardProfileRequst(LinkedInApiStandardProfileRequest apiStandardProfileRequst) {
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
	public LinkedInSiteStandardProfileRequest getSiteStandardProfileRequest() {
		return siteStandardProfileRequest;
	}
	public void setSiteStandardProfileRequest(LinkedInSiteStandardProfileRequest siteStandardProfileRequest) {
		this.siteStandardProfileRequest = siteStandardProfileRequest;
	}
	@Override
	public String toString() {
		return "LinkedInPerson [apiStandardProfileRequst=" + apiStandardProfileRequst + ", firstName=" + firstName
				+ ", headline=" + headline + ", id=" + id + ", lastName=" + lastName + ", pictureUrl=" + pictureUrl
				+ ", siteStandardProfileRequest=" + siteStandardProfileRequest + "]";
	}
}
