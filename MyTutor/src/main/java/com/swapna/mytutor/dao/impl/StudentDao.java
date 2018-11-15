package com.swapna.mytutor.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.swapna.mytutor.bo.StudentBo;
import com.swapna.mytutor.bo.TeacherBo;

@Repository
public class StudentDao {
	
	@Autowired
	JdbcTemplate  jdbcTempate ;
	final String SQL_INSERT="insert into student(student_id ,student_name,mail_id) values(?,?,?)";

	public void setJdbcTempate(JdbcTemplate jdbcTempate) {
		this.jdbcTempate = jdbcTempate;
	}

	public int register( StudentBo  studentBo) {
		int flag;
		return flag=jdbcTempate.update(SQL_INSERT, new Object[] {studentBo.getStudentId(),studentBo.getStudentName(),studentBo.getMailId()});


 }
	

}
