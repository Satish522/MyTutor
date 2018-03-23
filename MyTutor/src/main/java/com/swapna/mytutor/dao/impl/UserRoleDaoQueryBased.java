package com.swapna.mytutor.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.swapna.mytutor.bo.UserRoleBO;
import com.swapna.mytutor.dao.UserRoleDAO;

public class UserRoleDaoQueryBased implements UserRoleDAO{

	protected JdbcTemplate jdbcTemplate;
	private final String SQL_SAVE="insert into user_role(user_role_id,role_name,privileges) values(?,?,?)";
	private final String SQL_UPDATE="update user_role set role_name=? where user_role_id=?";
	private final String SQL_FIND_BY_ID="select user_role_id,role_name,privileges from user_role where user_role_id=?";
	private final String SQL_FIND_ALL="select * from user_role";
	private final String SQL_DELETE_BY_ID="delete from user_role where user_role_id=? ";
	private final String SQL_DELETE_ALL="delete from user_role";
	
	public UserRoleDaoQueryBased(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}


	@Override
	public int save(UserRoleBO userRole) {
	
		int id=userRole.getRoleId();
		String name=userRole.getRoleName();
		String privileg=userRole.getPrivilege();
		
		return jdbcTemplate.update(SQL_SAVE, new Object[] {id,name,privileg});
	}


	@Override
	public int update(UserRoleBO userRole) {

		return jdbcTemplate.update(SQL_UPDATE, new Object[] {userRole.getRoleName(),userRole.getRoleId()});
		//return 3;//jdbcTemplate.queryForObject(SQL_UPDATE, new UpdateRowMapper());
	}

	/*class UpdateRowMapper implements RowMapper
	{

		@Override
		public Object mapRow(ResultSet rs, int index) throws SQLException {

			return new UserRoleBO(rs.getInt(1),rs.getString(2));
		}

*/

		
	
		
	
	@Override
	public int deleteById(int id) {
		return jdbcTemplate.update(SQL_DELETE_BY_ID, new Object[] {id});
	}


	@Override
	public int delete() {

		return jdbcTemplate.update(SQL_DELETE_ALL);
	}


	@Override
	public List<UserRoleBO> findAll() {
	
		return jdbcTemplate.query(SQL_FIND_ALL, new UserRoleDaoRowMapper());
	}

	 class UserRoleDaoRowMapper implements RowMapper<UserRoleBO>
	 {

		@Override
		public UserRoleBO mapRow(ResultSet rs, int index) throws SQLException {
			UserRoleBO bo=new UserRoleBO();
			//List<UserRoleBO> lbo=new ArrayList();
			bo.setRoleId(rs.getInt(1));
			bo.setRoleName(rs.getString(2));
			bo.setPrivilege(rs.getString(3));
			//lbo.add(bo);
			return bo;
			
		}
		 
	 }
	@Override
	public UserRoleBO findById(int id) {

		return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, UserRoleBO.class, new Object[] {id});
	}

}
