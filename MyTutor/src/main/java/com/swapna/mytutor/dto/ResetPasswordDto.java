package com.swapna.mytutor.dto;

public class ResetPasswordDto {
	String newPassword;
	String confirmPassword;
	int otp;
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
	@Override
	public String toString() {
		return "ResetPasswordDto [newPassword=" + newPassword
				+ ", confirmPassword=" + confirmPassword + ", otp=" + otp + "]";
	}

	
	

}
