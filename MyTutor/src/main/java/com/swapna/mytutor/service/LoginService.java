package com.swapna.mytutor.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swapna.mytutor.bo.LoginBo;
import com.swapna.mytutor.dao.impl.LoginDao;
import com.swapna.mytutor.dto.LoginDto;

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
		
		
		//return "nouser";
		
	}
}
