package com.swapna.mytutor.bo;

public class RegisterBo {
	
	String fullName;
	String emailId;
	String password;
	String userId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "RegisterDto [fullName=" + fullName + ", emailId=" + emailId
				+ ", password=" + password + ", userId=" + userId + "]";
	}
	
}
