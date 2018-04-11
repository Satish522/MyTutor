package com.swapna.mytutor.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.swapna.mytutor.bo.CoachingTypeBo;
import com.swapna.mytutor.dao.CoachingTypeDAO;

public class CoachingTypeDaoImpl implements CoachingTypeDAO{

protected JdbcTemplate jdbcTemplate ;
	
	private final String SQL_SAVE="insert into coaching_type(coaching_id,coaching_type,entry_date) values(?,?,now())";
	private final String SQL_UPDATE="update coaching_type set coaching_type=? where coaching_id=?";
	private final String SQL_FIND_BY_ID="select * from coaching_type where coaching_id=?";
	private final String SQL_FIND_ALL="select * from coaching_type";
	private final String SQL_DELETE_BY_ID="delete from coaching_type where coaching_id=? ";
	private final String SQL_DELETE_ALL="delete from coaching_type";
	
	public CoachingTypeDaoImpl(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}	
	
	@Override
	public int save(CoachingTypeBo coachingTypeBo) {

		int status= jdbcTemplate.update(SQL_SAVE, new Object[] {coachingTypeBo.getCoachingId(),coachingTypeBo.getCoachingType()});
		if(status != 0)
		{
            System.out.println("One Record inserted for ID " + coachingTypeBo.getCoachingId());
        }
		else
		{
            System.out.println("Not a single Record inserted  " );
        }
		return status;

	}

	@Override
	public int update(CoachingTypeBo coachingTypeBo) {

		int status= jdbcTemplate.update(SQL_UPDATE, new Object[] {coachingTypeBo.getCoachingType(),coachingTypeBo.getCoachingId()});
		if(status != 0)
		{
            System.out.println("One Record Updated for ID " + coachingTypeBo.getCoachingId());
        }
		else
		{
            System.out.println("Not a single Record updated  " );
        }
		return status;
	}

	@Override
	public int deleteById(int id) {
		int status= jdbcTemplate.update(SQL_DELETE_BY_ID, id);
		if(status != 0)
		{
            System.out.println("One Record deleted for ID.. " + id);
        }
		else
		{
            System.out.println("Not a single Record deleted..  " );
        }
		return status;
	}

	@Override
	public int delete() {
		int status= jdbcTemplate.update(SQL_DELETE_ALL);
		if(status != 0)
		{
            System.out.println("All Record deleted .. " );
        }
		else
		{
            System.out.println("Not a single Record deleted..  " );
        }
		return status;
	}

	
	
	@Override
	public List<CoachingTypeBo> findAll() {

		return jdbcTemplate.query(SQL_FIND_ALL, new FindAllRowMapper());
	}

	class FindAllRowMapper implements RowMapper
	{

		@Override
		public Object mapRow(ResultSet rs, int index) throws SQLException {
			CoachingTypeBo coachingTypeBo=new CoachingTypeBo();
			coachingTypeBo.setCoachingId(rs.getInt(1));
			coachingTypeBo.setCoachingType(rs.getString(2));
			return coachingTypeBo;
		}
		
	}
	
	
	@Override
	public CoachingTypeBo findById(int id) {

		return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new Object[] {id}, new FindByIdRowMapper());
	}

	
	class FindByIdRowMapper implements RowMapper
	{

		@Override
		public Object mapRow(ResultSet rs, int index) throws SQLException {
			CoachingTypeBo coachingTypeBo=new CoachingTypeBo();
			coachingTypeBo.setCoachingId(rs.getInt(1));
			coachingTypeBo.setCoachingType(rs.getString(2));
			return coachingTypeBo;
		}
		
	}
}
