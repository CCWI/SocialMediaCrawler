package edu.hm.cs.smc.channels.linkedin.models;

import java.net.URL;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInApiStandardProfileRequest extends BaseEntity {
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInHeaders headers;
	private URL url;
	
	public LinkedInHeaders getHeaders() {
		return headers;
	}
	public void setHeaders(LinkedInHeaders headers) {
		this.headers = headers;
	}
	public URL getUrl() {
		return url;
	}
	public void setUrl(URL url) {
		this.url = url;
	}
}
