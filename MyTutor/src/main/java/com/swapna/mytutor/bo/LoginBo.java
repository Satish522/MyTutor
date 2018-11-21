package com.swapna.mytutor.bo;

public class LoginBo {
	private String email;
	private String password;
	private String userId;

	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginBo [email=" + email + ", password=" + password
				+ ", userId=" + userId + "]";
	}
	
	
}
