package edu.hm.cs.smc.channels.linkedin.models.company;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class CompanyStatistics {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	@OneToOne(cascade=CascadeType.ALL)
	private FollowerStatistics followerStatistics;
	@OneToOne(cascade=CascadeType.ALL)
	private StatusUpdateStatistics statusUpdateStatistics;
	
	public String getDbid() {
		return dbid;
	}
	public void setDbid(String dbid) {
		this.dbid = dbid;
	}
	public FollowerStatistics getFollowerStatistics() {
		return followerStatistics;
	}
	public void setFollowerStatistics(FollowerStatistics followerStatistics) {
		this.followerStatistics = followerStatistics;
	}
	public StatusUpdateStatistics getStatusUpdateStatistics() {
		return statusUpdateStatistics;
	}
	public void setStatusUpdateStatistics(StatusUpdateStatistics statusUpdateStatistics) {
		this.statusUpdateStatistics = statusUpdateStatistics;
	}
	@Override
	public String toString() {
		return "CompanyStatistics [dbid=" + dbid + ", followerStatistics=" + followerStatistics
				+ ", statusUpdateStatistics=" + statusUpdateStatistics + "]";
	}
}
