package com.swapna.mytutor.dao;

import java.util.List;

import com.swapna.mytutor.bo.ClassesForTrainingBo;


public interface ClassesForTrainingDAO {
	
	public int save(ClassesForTrainingBo classesForTrainingBo);
	
	public int update(ClassesForTrainingBo classesForTrainingBo);
	
	public int deleteById(int id);
	
	public int delete();
	
	public List<ClassesForTrainingBo> findAll();
	
	public ClassesForTrainingBo findById(int id);


}
