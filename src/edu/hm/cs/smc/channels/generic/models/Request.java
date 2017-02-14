package edu.hm.cs.smc.channels.generic.models;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
	
	private String hash;

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

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}
	
	public void calculateHash() {
		String output;
		
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			byte[] hash = toString().getBytes(Charset.forName("UTF-8"));
			messageDigest.update(hash);
			
			byte[] hashcode = messageDigest.digest();
            BigInteger bi = new BigInteger(1, hashcode);
            output = bi.toString(16);
            
			setHash(output);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Request [requestType=" + requestType + ", network=" + network + ", url=" + url + ", parameters="
				+ parameters + ", response=" + response + ", hash=" + hash + "]";
	}
}
