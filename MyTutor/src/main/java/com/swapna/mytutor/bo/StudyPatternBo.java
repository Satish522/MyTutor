package com.swapna.mytutor.bo;

public class StudyPatternBo {
	
	protected int patternId;
	protected String patternName;
	
	public int getPatternId() {
		return patternId;
	}
	public void setPatternId(int patternId) {
		this.patternId = patternId;
	}

	
	public String getPatternName() {
		return patternName;
	}
	public void setPatternName(String patternName) {
		this.patternName = patternName;
	}
	@Override
	public String toString() {
		return "StudyPatternBo [patternId=" + patternId + ", patternName=" + patternName + "]";
	}

	


	

}
