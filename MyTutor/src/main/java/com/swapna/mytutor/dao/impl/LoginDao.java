package com.swapna.mytutor.dao.impl;

import java.sql.ResultSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.swapna.mytutor.bo.LoginBo;

@Repository
public class LoginDao {
	
	private static final Logger logger = LoggerFactory.getLogger( LoginDao.class);


	@Autowired
	JdbcTemplate  jdbcTempate ;
	
	protected String SQL_SELECT="select password from user_credential where user_id=? ";

		
	public void setJdbcTempate(JdbcTemplate jdbcTempate) {
		this.jdbcTempate = jdbcTempate;
	}
	
	public String getUsersPassword(LoginBo loginBo){
		System.out.println(loginBo);
		return jdbcTempate.queryForObject(SQL_SELECT, new Object[]{loginBo.getUserId()}, String.class);
	}

}
