package com.swapna.mytutor.dao;

import java.util.List;

import com.swapna.mytutor.bo.SubjectForClassBo;



public interface SubjectForClassDAO {
	
public int save(SubjectForClassBo subjectForClassBo);
	
	public int update(SubjectForClassBo subjectForClassBo);
	
	public int deleteById(int id);
	
	public int delete();
	
	public List<SubjectForClassBo> findAll();
	
	public SubjectForClassBo findById(int id);


}
