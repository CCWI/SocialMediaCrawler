package edu.hm.cs.smc.database.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@MappedSuperclass
public abstract class BaseEntity {
	@Column(insertable=true, updatable=false)
	private Date dbInserted;
	@Column(insertable=false, updatable=true)
	private Date dbUpdated;
	
	public Date getDbInserted() {
		return dbInserted;
	}

	public void setDbInserted(Date dbInserted) {
		this.dbInserted = dbInserted;
	}

	public Date getDbUpdated() {
		return dbUpdated;
	}

	public void setDbUpdated(Date dbUpdated) {
		this.dbUpdated = dbUpdated;
	}

	@PrePersist
	public void onCreate() {
		this.setDbInserted(new Date());
	}
	
	@PreUpdate
	public void onPersist() {
		this.setDbUpdated(new Date());
	}
}