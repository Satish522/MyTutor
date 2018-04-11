package com.swapna.mytutor.bo;

public class ClassesForTrainingBo {
	protected int classId;
	protected int patternId;
	protected String classesName;
	
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
	public String getClassesName() {
		return classesName;
	}
	public void setClassesName(String classesName) {
		this.classesName = classesName;
	}
	
	@Override
	public String toString() {
		return "ClassesForTrainingBo [classId=" + classId + ", patternId=" + patternId + ", classesName=" + classesName
				+ "]";
	}
	
	

}
