package com.swapna.mytutor.pojo;

public class ResetPassword {
	String newPassword;
	String confirmPassword;
	int otp;
	String mailId;
	
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}


	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	@Override
	public String toString() {
		return "ResetPassword [newPassword=" + newPassword
				+ ", confirmPassword=" + confirmPassword + ", otp=" + otp
				+ ", setMailId=" + mailId + "]";
	}


	


	

}
