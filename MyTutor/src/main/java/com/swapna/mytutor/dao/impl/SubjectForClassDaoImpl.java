package com.swapna.mytutor.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.swapna.mytutor.bo.SubjectForClassBo;
import com.swapna.mytutor.dao.SubjectForClassDAO;

public class SubjectForClassDaoImpl implements SubjectForClassDAO{
	
	
	protected JdbcTemplate jdbcTemplate ;
	
	private final String SQL_SAVE="insert into subject_for_class(subject_id,class_id,pattern_id,subjet_name,entry_date,is_delete) values(?,?,?,?,now(),false)";
	private final String SQL_UPDATE="update subject_for_class set subjet_name=? where subject_id=?";
	private final String SQL_FIND_BY_ID="select * from subject_for_class where subject_id=?";
	private final String SQL_FIND_ALL="select * from subject_for_class";
	private final String SQL_DELETE_BY_ID="delete from subject_for_class where subject_id=? ";
	private final String SQL_DELETE_ALL="delete from subject_for_class";
	
	public SubjectForClassDaoImpl(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}

	@Override
	public int save(SubjectForClassBo subjectForClassBo) {

		int status= jdbcTemplate.update(SQL_SAVE, new Object[] {subjectForClassBo.getSubjectId(),subjectForClassBo.getClassId(),subjectForClassBo.getPatternId(),subjectForClassBo.getSubjectName()});
		if(status != 0)
		{
            System.out.println("One Record inserted for ID " + subjectForClassBo.getSubjectId());
        }
		else
		{
            System.out.println("Not a single Record inserted  " );
        }
		return status;
		
	}

	@Override
	public int update(SubjectForClassBo subjectForClassBo) {
		
		int status= jdbcTemplate.update(SQL_UPDATE, new Object[] {subjectForClassBo.getSubjectName(),subjectForClassBo.getSubjectId()});
		if(status != 0)
		{
            System.out.println("One Record updated for ID " + subjectForClassBo.getSubjectId());
        }
		else
		{
            System.out.println("Not a single Record updated  " );
        }
		return status;
	}

	@Override
	public int deleteById(int id) {

		int status= jdbcTemplate.update(SQL_DELETE_BY_ID, new Object[] {id});
		
		if(status != 0)
		{
            System.out.println("One Record deleted for ID " + id);
        }
		else
		{
            System.out.println("Not a single Record deleted  " );
        }
		return status;
	}

	@Override
	public int delete() {

		int status= jdbcTemplate.update(SQL_DELETE_ALL);
		if(status != 0)
		{
            System.out.println("All Record deleted for ID " );
        }
		else
		{
            System.out.println("Not a single Record deleted  " );
        }
		return status;
	}

	@Override
	public List<SubjectForClassBo> findAll() {

		return jdbcTemplate.query(SQL_FIND_ALL, new SubjectForClassRowMapper());
	}
	
	class SubjectForClassRowMapper implements RowMapper
	{

		@Override
		public Object mapRow(ResultSet rs, int index) throws SQLException {
			SubjectForClassBo subjectForClassBo=new SubjectForClassBo();
			subjectForClassBo.setSubjectId(rs.getInt(1));
			subjectForClassBo.setClassId(rs.getInt(2));
			subjectForClassBo.setPatternId(rs.getInt(3));
			subjectForClassBo.setSubjectName(rs.getString(4));
			return subjectForClassBo;
			
		}
		
	}

	@Override
	public SubjectForClassBo findById(int id) {

		return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new Object[] {id},new FindByIdRowMapper());
	}
	
	class FindByIdRowMapper implements RowMapper
	{

		@Override
		public Object mapRow(ResultSet rs, int index) throws SQLException {
			
			SubjectForClassBo subjectForClassBo=new SubjectForClassBo();
			subjectForClassBo.setSubjectId(rs.getInt(1));
			subjectForClassBo.setClassId(rs.getInt(2));
			subjectForClassBo.setPatternId(rs.getInt(3));
			subjectForClassBo.setSubjectName(rs.getString(4));
			return subjectForClassBo;
		}
		
	}

}
