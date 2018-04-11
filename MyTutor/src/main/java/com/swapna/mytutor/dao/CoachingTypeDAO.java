package com.swapna.mytutor.dao;

import java.util.List;

import com.swapna.mytutor.bo.CoachingTypeBo;



public interface CoachingTypeDAO {
	
public int save(CoachingTypeBo coachingTypeBo);
	
	public int update(CoachingTypeBo coachingTypeBo);
	
	public int deleteById(int id);
	
	public int delete();
	
	public List<CoachingTypeBo> findAll();
	
	public CoachingTypeBo findById(int id);

}
