package com.swapna.mytutor.dao.impl;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.swapna.mytutor.bo.RegisterBo;
import com.swapna.mytutor.controller.RegisterController;
import com.swapna.mytutor.dto.RegisterDto;

@Repository
public class RegisterDao {
	
	private static final Logger logger = LoggerFactory.getLogger( RegisterDao.class);
	
	@Autowired
	JdbcTemplate  jdbcTempate ;
	protected String SQL_INSERT="insert into user_credential(user_id,password,mail_id,entry_date) values(?,?,?,now())";

		
	public void setJdbcTempate(JdbcTemplate jdbcTempate) {
		this.jdbcTempate = jdbcTempate;
	}


	

	public int register(RegisterBo registerBo){
		System.out.println("Inside dao bo "+registerBo);
		int flag=jdbcTempate.update(SQL_INSERT, new Object[]{registerBo.getUserId(),registerBo.getPassword(),registerBo.getEmailId()});
		
		if(flag > 0) {
			logger.info("sucessfully registered..");
		}else {
			logger.error("Something wrong..");

		}
		return flag;
		
		
	}

		
		
	class RegisterRowMapper implements RowMapper{

		@Override
		public Object mapRow(ResultSet rs, int index) throws SQLException {
			RegisterBo registeBo =new RegisterBo ();
			registeBo .setFullName(rs.getString(1));
			registeBo .setEmailId(rs.getString(2));
			registeBo .setPassword(rs.getString(3));
			registeBo .setUserId(rs.getString(4));

			return registeBo ;
		}
		
	}
		

}
