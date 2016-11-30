package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class YouTubeCountry {
	@Id
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "YouTubeCountry [name=" + name + "]";
	}
}
