package com.swapna.mytutor.bo;

public class SubjectForClassBo {
	
	protected int subjectId;
	protected int classId;
	protected int patternId;
	protected String subjectName;
	
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public int getPatternId() {
		return patternId;
	}
	public void setPatternId(int patternId) {
		this.patternId = patternId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	@Override
	public String toString() {
		return "SubjectForClassBo [subjectId=" + subjectId + ", classId=" + classId + ", patternId=" + patternId
				+ ", subjectName=" + subjectName + "]";
	}
	
	

}
