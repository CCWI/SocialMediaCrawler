package edu.hm.cs.smc.channels.generic.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;
@Entity
public class Request extends BaseEntity {
	
	@Enumerated(EnumType.STRING)
	private RequestType requestType;
	
	@Enumerated(EnumType.STRING)
	private RequestNetwork network;
	
	private String url;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="request_fk")
	private List<RequestParameter> parameters;
	
	@OneToOne(cascade=CascadeType.ALL)
	private BaseEntity response;

	public RequestType getRequestType() {
		return requestType;
	}

	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}

	public RequestNetwork getNetwork() {
		return network;
	}

	public void setNetwork(RequestNetwork network) {
		this.network = network;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<RequestParameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<RequestParameter> parameters) {
		this.parameters = parameters;
	}

	public BaseEntity getResponse() {
		return response;
	}

	public void setResponse(BaseEntity response) {
		this.response = response;
	}
}
