package com.swapna.mytutor.bo;

public class StudentBo {
	String studentId;
	String studentName;
	String mailId;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	@Override
	public String toString() {
		return "StudentBo [studentId=" + studentId + ", studentName=" + studentName + ", mailId=" + mailId + "]";
	}
	
	

}
