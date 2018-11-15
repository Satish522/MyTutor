package com.swapna.mytutor.bo;

public class TeacherBo {
	String teacherId;
	String fullname;
	String mailid;
	
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	@Override
	public String toString() {
		return "TeacherBo [teacherId=" + teacherId + ", fullname=" + fullname + ", mailid=" + mailid + "]";
	}
	
	

}
