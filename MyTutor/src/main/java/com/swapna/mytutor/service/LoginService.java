package com.swapna.mytutor.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swapna.mytutor.bo.LoginBo;
import com.swapna.mytutor.bo.ResetPasswordBo;
import com.swapna.mytutor.dao.impl.LoginDao;
import com.swapna.mytutor.dto.LoginDto;
import com.swapna.mytutor.dto.ResetPasswordDto;

@Service
public class LoginService {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginService.class);

	
	@Autowired
	LoginDao loginDao;
	
	public String autenticateUser(LoginDto loginDto){
		
		LoginBo loginBo=new LoginBo();
		 
		loginBo.setPassword(loginDto.getPassword());
		loginBo.setUserId(loginDto.getUserId());
		
		String password=loginDao.getUsersPassword(loginBo);
		
		if(password!= null && password.equals(loginBo.getPassword())) {
			
			logger.info("Password match");
			return "success";
			
		}else if(password != null && !password.equals(loginBo.getPassword())) {
			logger.info("Password does not match");
			return "fail";

		} else{
			return "nouser";
		}
		
	}
	
	
	public boolean authenticateEmail(String mailId){
		 
		
		String email=loginDao.getUsersEmail(mailId);
		 
		
		if(email!=null && email.equals(mailId)){
			logger.info("Email match");
			return true;
		} else{
			return false;
		}
			
	}
	
	public boolean  setOtp(String mailId,int otp){
		 
		int flag=loginDao.setUsersOtp(mailId,otp);
		if(flag > 0){
			
			return true;}
			
			else
				return false;
			
		}
	
	public int getOtp(String mailId,  ResetPasswordDto resetPasswordDto){
		
		 
		int retOtp=loginDao.getUsersOtp(mailId);
		
		int flag = 0;
		
		if((retOtp == resetPasswordDto.getOtp()) && resetPasswordDto.getNewPassword().equals(resetPasswordDto.getConfirmPassword())){
			
			 ResetPasswordBo  resetPasswordBo =new  ResetPasswordBo();
			 resetPasswordBo.setNewPassword(resetPasswordDto.getNewPassword());
			 resetPasswordBo.setConfirmPassword(resetPasswordDto.getConfirmPassword());
			 resetPasswordBo.setOtp(resetPasswordDto.getOtp());
			  flag=loginDao.setUserPassword( resetPasswordBo,mailId);
			 
			 logger.info("Password and Confirm Password are matched..");
			 return flag;
				 
			 }
			 else{
				 logger.error("New-Password and Confirm Password does not matched..");
				 return flag;
			 }	 
			
		}
		
}
