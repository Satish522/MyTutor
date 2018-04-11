package com.swapna.mytutor.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.swapna.mytutor.bo.StudyPatternBo;
import com.swapna.mytutor.dao.StudyPatternDAO;
import com.swapna.mytutor.dao.impl.UserRoleDaoImpl.CallbackClass;
import com.swapna.mytutor.dao.impl.UserRoleDaoImpl.InsertQuery;

public class StudyPatternDaoImpl implements  StudyPatternDAO{
	

	protected JdbcTemplate jdbcTemplate ;
	
	private final String SQL_SAVE="insert into study_pattern(pattern_id,pattern_name,entry_date) values(?,?,now())";
	private final String SQL_UPDATE="update study_pattern set pattern_name=? where pattern_id=?";
	private final String SQL_FIND_BY_ID="select * from study_pattern where pattern_id=?";
	private final String SQL_FIND_ALL="select * from study_pattern";
	private final String SQL_DELETE_BY_ID="delete  from study_pattern where pattern_id=? ";
	private final String SQL_DELETE_ALL="delete from study_pattern";
	
	

	public StudyPatternDaoImpl(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}


	@Override
	public int save(StudyPatternBo studyPatternBo) {

		int status= jdbcTemplate.update(SQL_SAVE, new Object[] {studyPatternBo.getPatternId(),studyPatternBo.getPatternName()});
		
		if(status != 0)
		{
            System.out.println("One Record inserted for ID " + studyPatternBo.getPatternId());
        }
		else
		{
            System.out.println("Not a single Record inserted  " );
        }
		return status;
		

	}


	@Override
	public int update(StudyPatternBo studyPatternBo) {
		
		int status=jdbcTemplate.update(SQL_UPDATE, new Object[] {studyPatternBo.getPatternName(),studyPatternBo.getPatternId()});
		if(status != 0)
		{
            System.out.println("StudyPattern data updated for ID " + studyPatternBo.getPatternId());
        }
		else
		{
            System.out.println("No StudyPattern data found with ID " + studyPatternBo.getPatternId());
        }
		return status;
		
	}
	

	@Override
	public int deleteById(int id) {
		
		int status=jdbcTemplate.update(SQL_DELETE_BY_ID, id);
		
		
		if(status != 0)
		{
            System.out.println("StudyPattern data deleted for ID " + id);
        }
		else
		{
            System.out.println("No StudyPattern data found with ID " + id);
        }
		return status;
	}

	
	@Override
	public int delete() {

		int status= jdbcTemplate.update(SQL_DELETE_ALL);
		if(status != 0)
		{
            System.out.println("StudyPattern data deleted.. ");
        }
		else
		{
            System.out.println("Not even a single record deleted.. ");
        }
		return status;
	}

	
	@Override
	public List<StudyPatternBo> findAll() {

		return jdbcTemplate.query(SQL_FIND_ALL, new FindAllRowMapper());
	}

	class FindAllRowMapper implements RowMapper
	{

		@Override
		public Object mapRow(ResultSet rs, int index) throws SQLException {
			StudyPatternBo bo=new StudyPatternBo();
			bo.setPatternId(rs.getInt(1));
			bo.setPatternName(rs.getString(2));
			return bo;
		}
		
	}
	
	@Override
	public StudyPatternBo findById(int id) {
		
		return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new Object[] {id}, new FindByIdRowMapper());
	}
	
	class FindByIdRowMapper implements RowMapper
	{

		@Override
		public Object mapRow(ResultSet rs, int index) throws SQLException {
			StudyPatternBo bo=new StudyPatternBo();
			bo.setPatternId(rs.getInt(1));
			bo.setPatternName(rs.getString(2));
			return bo;
		}
		
	}



}
