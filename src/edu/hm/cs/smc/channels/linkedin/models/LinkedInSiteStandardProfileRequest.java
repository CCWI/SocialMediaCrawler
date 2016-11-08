package edu.hm.cs.smc.channels.linkedin.models;

import java.net.URL;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInSiteStandardProfileRequest extends BaseEntity {
	private URL url;

	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}
}
