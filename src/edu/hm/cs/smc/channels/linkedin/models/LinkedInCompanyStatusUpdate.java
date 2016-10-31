package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInCompanyStatusUpdate extends BaseEntity {
	@Id 
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String dbid;
	
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInShare share;
	
	public String getDbid() {
		return dbid;
	}

	public void setDbid(String dbid) {
		this.dbid = dbid;
	}

	public LinkedInShare getShare() {
		return share;
	}

	public void setShare(LinkedInShare share) {
		this.share = share;
	}

	@Override
	public String toString() {
		return "LinkedInCompanyStatusUpdate [share=" + share + "]";
	}
}
