package com.swapna.mytutor.dao.impl;

import java.sql.ResultSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.swapna.mytutor.bo.LoginBo;
import com.swapna.mytutor.bo.ResetPasswordBo;

@Repository
public class LoginDao {
	
	private static final Logger logger = LoggerFactory.getLogger( LoginDao.class);


	@Autowired
	JdbcTemplate  jdbcTempate ;
	
		protected String SQL_SELECT="select password from user_credential where user_id=? ";
		protected String SQL_SELECTEMAL="select mail_id from user_credential where mail_id=? ";
		protected String SQL_UPDATEOTP="update user_credential set otp=? where mail_id=? ";
		protected String SQL_SELECTOTP="select otp from user_credential where mail_id=? ";
		protected String SQL_UPDATE_PASSWORD="update user_credential set password=?,otp=null where mail_id=?";
		
		

		
	public void setJdbcTempate(JdbcTemplate jdbcTempate) {
		this.jdbcTempate = jdbcTempate;
	}
	
	public String getUsersPassword(LoginBo loginBo){
		System.out.println(loginBo);
		return jdbcTempate.queryForObject(SQL_SELECT, new Object[]{loginBo.getUserId()}, String.class);
	}
	
	public String getUsersEmail(String mailId){
		
		System.out.println(mailId);
		return jdbcTempate.queryForObject(SQL_SELECTEMAL,new Object[]{mailId}, String.class);
	}
	
	public int setUsersOtp(String mailId,int otp){
		return jdbcTempate.update(SQL_UPDATEOTP, new Object[]{otp,mailId});
	}
	
	public int getUsersOtp(String mailId){
		return jdbcTempate.queryForInt(SQL_SELECTOTP, new Object[]{mailId});
	}
	
	public int setUserPassword(ResetPasswordBo resetPasswordBo ,String mailId){
		return jdbcTempate.update(SQL_UPDATE_PASSWORD, new Object[]{resetPasswordBo.getNewPassword(),mailId});
		
	}

}
