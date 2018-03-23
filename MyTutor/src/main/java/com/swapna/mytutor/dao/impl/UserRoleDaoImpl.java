package com.swapna.mytutor.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.spi.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.swapna.mytutor.bo.UserRoleBO;
import com.swapna.mytutor.dao.UserRoleDAO;


public class UserRoleDaoImpl implements UserRoleDAO{
	
	//JdbcTemplate
	

	protected JdbcTemplate jdbcTemplate;

	
	public UserRoleDaoImpl(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	

	 
	
	@Override
	public int save(UserRoleBO userRole) {
		PreparedStatementCreator psc=new InsertQuery(userRole);
		PreparedStatementCallback<Integer> pscb=new CallbackClass();
		return jdbcTemplate.execute(psc, pscb);
	}

	@Override
	public int update(UserRoleBO userRole) {
		PreparedStatementCreator psc=new UpdateQuery(userRole);
		PreparedStatementCallback<Integer> pscb=new UpdateRecords();
		return jdbcTemplate.execute(psc, pscb);
	}

	@Override
	public int deleteById(int id) {
		PreparedStatementCreator psc=new DeleteQuery(id);
		PreparedStatementCallback<Integer> pscb=new DeleteCustomer();
		return jdbcTemplate.execute(psc, pscb);
	}

	@Override
	public int delete() {
		PreparedStatementCreator psc=new DeleteAllQuery();
		PreparedStatementCallback<Integer> pscb=new DeleteAllRecords();
		return jdbcTemplate.execute(psc, pscb);
	}

	@Override
	public List<UserRoleBO> findAll() {
		
		PreparedStatementCreator psc=new ReadAllQuery();
		PreparedStatementCallback<List<UserRoleBO>> pscb=new FindAllRecords();
		return jdbcTemplate.execute(psc, pscb);
	}

	@Override
	public UserRoleBO findById(int roleId) {

		PreparedStatementCreator psc=new ReadTableQuery(roleId);
		PreparedStatementCallback<UserRoleBO> pscb=new readCustomerTable();
		return jdbcTemplate.execute(psc, pscb);
	}


	//insert records..

	public final class InsertQuery implements PreparedStatementCreator {
			
		 UserRoleBO userRole;
			public InsertQuery(UserRoleBO userRole) {
				this.userRole=userRole;
			}
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				
				PreparedStatement pstmt = null;

				pstmt =con.prepareStatement("insert into user_role(user_role_id,role_name,privileges) values(?,?,?)");
				pstmt.setInt(1, userRole.getRoleId());
				pstmt.setString(2, userRole.getRoleName());
				pstmt.setString(3, userRole.getPrivilege());
				
				return pstmt;
			}
			


	}

	public  class CallbackClass implements PreparedStatementCallback<Integer> {
		@Override
	public Integer doInPreparedStatement(PreparedStatement pstmt)throws SQLException, DataAccessException {
			
			int rowAffected = pstmt.executeUpdate();
			if(rowAffected > 0) {
				System.out.println(rowAffected+ " no of row/rows affected");
			}else {
				System.out.println("Ooopssss.... Not a single row affected..... ");
			}
			return rowAffected;


	}
}



//update records..		

class UpdateQuery implements PreparedStatementCreator {
			 
			
	 UserRoleBO userRole;
	 private UpdateQuery(UserRoleBO userRole) {
				 this.userRole=userRole;
				 
			 }
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				
				PreparedStatement pstmt = null;
				pstmt=con.prepareStatement("update user_role set role_name=? where user_role_id=?");
				pstmt.setInt(2, userRole.getRoleId());
				pstmt.setString(1, userRole.getRoleName());
				
				return pstmt;
			}
}
}
class UpdateRecords implements PreparedStatementCallback<Integer> {
	@Override
	public Integer doInPreparedStatement(PreparedStatement pstmt)throws SQLException, DataAccessException {
		
		int rowAffected = pstmt.executeUpdate();
		if(rowAffected > 0) {
			System.out.println(rowAffected+ " no of row/rows affected");
		}else {
			System.out.println("Ooopssss.... Not a single row affected..... ");
		}
		return rowAffected;
	}
}



//delete records..

class DeleteQuery implements PreparedStatementCreator {
	 
	
	 int RoleId;
	 public DeleteQuery(int roleId) {
		 this.RoleId=roleId;
		 
	 }
	
	@Override
	public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		
		PreparedStatement pstmt = null;
		UserRoleBO userRole=new  UserRoleBO();
		pstmt=con.prepareStatement("delete from user_role where user_role_id=? ");
		pstmt.setInt(1, RoleId);
		System.out.println("one row deleted..");
		return pstmt;
	}
}
class DeleteCustomer implements PreparedStatementCallback<Integer> {
		@Override
		public Integer doInPreparedStatement(PreparedStatement pstmt)throws SQLException, DataAccessException {
			
			int rowAffected = pstmt.executeUpdate();
			if(rowAffected > 0) {
				System.out.println(rowAffected+ " no of row/rows deleted");
			}else {
				System.out.println("Ooopssss.... Not a single row deleted..... ");
			}
			return rowAffected;
		}
	}


//delete All Records..

class DeleteAllQuery implements PreparedStatementCreator {
	 
	 public DeleteAllQuery() {
		
	 }
	
	@Override
	public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		
		PreparedStatement pstmt = null;
		UserRoleBO userRole=new  UserRoleBO();
		pstmt=con.prepareStatement("delete from user_role");

		return pstmt;
	}
}

class DeleteAllRecords implements PreparedStatementCallback<Integer> {
		@Override
		public Integer doInPreparedStatement(PreparedStatement pstmt)throws SQLException, DataAccessException {
			
			int rowAffected = pstmt.executeUpdate();
			if(rowAffected > 0) {
				
				System.out.println(rowAffected+ " no of row/rows deleted");
			}else {
				System.out.println("Ooopssss.... Not a single row deleted..... ");
			}
			return rowAffected;
		}
	}


//read records by id..

class ReadTableQuery implements PreparedStatementCreator {

	int roleId;

	public ReadTableQuery(int roleId) {
		this.roleId=roleId;
		
	}


	@Override
	public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		
		PreparedStatement pstmt = null;

		pstmt =con.prepareStatement("select user_role_id,role_name,privileges from user_role where user_role_id=?");
		pstmt.setInt(1,roleId);

		return pstmt;
	}
}

class readCustomerTable implements PreparedStatementCallback <UserRoleBO > {
	@Override
	public UserRoleBO  doInPreparedStatement(PreparedStatement pstmt)throws SQLException, DataAccessException {
		
		ResultSet rs = pstmt.executeQuery();
		UserRoleBO userRole=new UserRoleBO();

	
		while(rs.next())
		{
		userRole.setRoleId(rs.getInt(1));
		userRole.setRoleName(rs.getString(2));
		userRole.setPrivilege(rs.getString(3));

		
		}
		
		return userRole;
	}
}




//reading all records.....

class ReadAllQuery implements PreparedStatementCreator {
	 
	public ReadAllQuery() {


	}
	@Override
	public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		
		PreparedStatement pstmt = null;

		pstmt =con.prepareStatement("select * from user_role");
		return pstmt;
	}
}

class FindAllRecords implements PreparedStatementCallback <List<UserRoleBO >> {
	@Override
	public List<UserRoleBO > doInPreparedStatement(PreparedStatement pstmt)throws SQLException, DataAccessException {
		
		ResultSet rs = pstmt.executeQuery();
		List<UserRoleBO > bo=new ArrayList();
	
		while(rs.next())
		{
		
		UserRoleBO  userRole=new UserRoleBO ();
		userRole.setRoleId(rs.getInt(1));
		userRole.setRoleName(rs.getString(2));
		userRole.setPrivilege(rs.getString(3));
		bo.add(userRole);
		}
		
		return bo;
	}
}

