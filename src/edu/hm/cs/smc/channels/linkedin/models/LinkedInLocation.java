package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInLocation extends BaseEntity {
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_fk")
	private LinkedInAddress address;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="contactinfo_fk")
	private LinkedInContactInfo contactInfo;
	public LinkedInAddress getAddress() {
		return address;
	}
	public void setAddress(LinkedInAddress address) {
		this.address = address;
	}
	public LinkedInContactInfo getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(LinkedInContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
}
