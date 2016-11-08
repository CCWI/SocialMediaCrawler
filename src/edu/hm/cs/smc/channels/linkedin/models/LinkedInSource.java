package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInSource extends BaseEntity {
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInApplication application;
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInServiceProvider serviceProvider;
	private String serviceProviderShareId;
	
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
