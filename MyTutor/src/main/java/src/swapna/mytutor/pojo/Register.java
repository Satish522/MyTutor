package src.swapna.mytutor.pojo;

public class Register {
	String fullName;
	String emailId;
	String password;
	String confirmPassword;
	
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
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	@Override
	public String toString() {
		return "Register [fullName=" + fullName + ", emailId=" + emailId
				+ ", password=" + password + ", confirmPassword="
				+ confirmPassword + "]";
	}
	
	

}
