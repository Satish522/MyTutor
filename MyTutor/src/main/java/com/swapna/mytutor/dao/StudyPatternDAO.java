package com.swapna.mytutor.dao;

import java.util.List;

import com.swapna.mytutor.bo.StudyPatternBo;



 public interface StudyPatternDAO {
	
	public int save(StudyPatternBo studyPatternBo);
	
	public int update(StudyPatternBo studyPatternBo);
	
	public int deleteById(int id);
	
	public int delete();
	
	public List<StudyPatternBo> findAll();
	
	public StudyPatternBo findById(int id);

}
