package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInCompanyStatistics extends BaseEntity {
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInFollowerStatistics followerStatistics;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInStatusUpdateStatistics statusUpdateStatistics;
	
	public LinkedInFollowerStatistics getFollowerStatistics() {
		return followerStatistics;
	}
	public void setFollowerStatistics(LinkedInFollowerStatistics followerStatistics) {
		this.followerStatistics = followerStatistics;
	}
	public LinkedInStatusUpdateStatistics getStatusUpdateStatistics() {
		return statusUpdateStatistics;
	}
	public void setStatusUpdateStatistics(LinkedInStatusUpdateStatistics statusUpdateStatistics) {
		this.statusUpdateStatistics = statusUpdateStatistics;
	}
	@Override
	public String toString() {
		return "LinkedInCompanyStatistics [dbid=" + dbid + ", followerStatistics=" + followerStatistics
				+ ", statusUpdateStatistics=" + statusUpdateStatistics + "]";
	}
}
