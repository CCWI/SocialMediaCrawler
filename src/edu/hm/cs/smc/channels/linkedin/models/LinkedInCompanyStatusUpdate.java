package edu.hm.cs.smc.channels.linkedin.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class LinkedInCompanyStatusUpdate extends BaseEntity {
	@OneToOne(cascade=CascadeType.ALL)
	private LinkedInShare share;
	
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
