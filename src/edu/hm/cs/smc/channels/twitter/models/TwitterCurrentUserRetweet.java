package edu.hm.cs.smc.channels.twitter.models;
import javax.persistence.*;

import edu.hm.cs.smc.database.models.BaseEntity;
@Entity
public class TwitterCurrentUserRetweet extends BaseEntity {
	
	private long id;
	private String id_str;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getId_str() {
		return id_str;
	}

	public void setId_str(String id_str) {
		this.id_str = id_str;
	}

}
