package com.swapna.mytutor.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.swapna.mytutor.bo.TeacherBo;

@Repository
public class TeacherDao {
	@Autowired
	JdbcTemplate  jdbcTempate ;
	final String SQL_INSERT="insert into teacher( teacher_id,full_name,mail_id) values(?,?,?)";

	public void setJdbcTempate(JdbcTemplate jdbcTempate) {
		this.jdbcTempate = jdbcTempate;
	}

 public int register( TeacherBo  teacherBo) {
	 int flag;
	 
	return flag=jdbcTempate.update(SQL_INSERT, new Object[] {teacherBo.getTeacherId(),teacherBo.getFullname(),teacherBo.getMailid()});
	 
 }

}