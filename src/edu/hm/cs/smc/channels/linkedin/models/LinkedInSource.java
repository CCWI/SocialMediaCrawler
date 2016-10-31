package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInSource extends BaseEntity {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInApplication application;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInServiceProvider serviceProvider;
	private String serviceProviderShareId;
	
	public String getDbid() {
		return dbid;
	}
	public void setDbid(String dbid) {
		this.dbid = dbid;
	}
	public LinkedInApplication getApplication() {
		return application;
	}
	public void setApplication(LinkedInApplication application) {
		this.application = application;
	}
	public LinkedInServiceProvider getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(LinkedInServiceProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public String getServiceProviderShareId() {
		return serviceProviderShareId;
	}
	public void setServiceProviderShareId(String serviceProviderShareId) {
		this.serviceProviderShareId = serviceProviderShareId;
	}
}
