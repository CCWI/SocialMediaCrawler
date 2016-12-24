package edu.hm.cs.smc.channels.youtube.models;

import javax.persistence.Entity;

import edu.hm.cs.smc.database.models.BaseEntity;

@Entity
public class YouTubeSubscriptionContentDetails extends BaseEntity {
	private int totalItemCount;
	private int newItemCount;
    private String activityType;
	
    public int getTotalItemCount() {
		return totalItemCount;
	}
	
	public void setTotalItemCount(int totalItemCount) {
		this.totalItemCount = totalItemCount;
	}
	
	public int getNewItemCount() {
		return newItemCount;
	}
	
	public void setNewItemCount(int newItemCount) {
		this.newItemCount = newItemCount;
	}
	
	public String getActivityType() {
		return activityType;
	}
	
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
    
}
