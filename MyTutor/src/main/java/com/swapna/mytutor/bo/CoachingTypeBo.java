package com.swapna.mytutor.bo;

public class CoachingTypeBo {
	
	protected int coachingId;
	protected String coachingType;
	
	public int getCoachingId() {
		return coachingId;
	}
	public void setCoachingId(int coachingId) {
		this.coachingId = coachingId;
	}
	public String getCoachingType() {
		return coachingType;
	}
	public void setCoachingType(String coachingType) {
		this.coachingType = coachingType;
	}
	@Override
	public String toString() {
		return "CoachingTypeBo [coachingId=" + coachingId + ", coachingType=" + coachingType + "]";
	}
	
	

}
