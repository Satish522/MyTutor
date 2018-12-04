package com.swapna.mytutor.bo;

public class ResetPasswordBo {
	
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
		return "ResetPasswordBo [newPassword=" + newPassword
				+ ", confirmPassword=" + confirmPassword + ", otp=" + otp + "]";
	}

	
	

}
