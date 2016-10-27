package edu.hm.cs.smc.channels.linkedin.models.company.update.comments;

import java.net.URL;

public class ApiStandardProfileRequest {
	private Headers headers;
	private URL url;
	public Headers getHeaders() {
		return headers;
	}
	public void setHeaders(Headers headers) {
		this.headers = headers;
	}
	public URL getUrl() {
		return url;
	}
	public void setUrl(URL url) {
		this.url = url;
	}
}
