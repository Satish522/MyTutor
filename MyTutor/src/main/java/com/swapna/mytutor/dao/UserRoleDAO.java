package com.swapna.mytutor.dao;

import java.util.List;

import com.swapna.mytutor.bo.UserRoleBO;

public interface UserRoleDAO {
	
	public int save(UserRoleBO userRole);
	
	public int update(UserRoleBO userRole);
	
	public int deleteById(int id);
	
	public int delete();
	
	public List<UserRoleBO> findAll();
	
	public UserRoleBO findById();
}
