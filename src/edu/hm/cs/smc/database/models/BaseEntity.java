package edu.hm.cs.smc.database.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BaseEntity {
	@Column(insertable=true, updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dbInserted;
	@Column(insertable=false, updatable=true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dbUpdated;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(length = 100)
	protected String dbid;
	
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

	public String getDbid() {
		return dbid;
	}

	public void setDbid(String dbid) {
		this.dbid = dbid;
	}
}
