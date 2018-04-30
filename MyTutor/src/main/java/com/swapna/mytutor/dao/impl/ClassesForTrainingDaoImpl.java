package com.swapna.mytutor.dao.impl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.swapna.mytutor.bo.ClassesForTrainingBo;
import com.swapna.mytutor.bo.StudyPatternBo;
import com.swapna.mytutor.dao.ClassesForTrainingDAO;
import com.swapna.mytutor.dao.impl.StudyPatternDaoImpl.FindByIdRowMapper;

public class ClassesForTrainingDaoImpl implements ClassesForTrainingDAO{
	
	protected JdbcTemplate jdbcTemplate;
	
	private final String SQL_SAVE="insert into class_for_training(class_id,pattern_id,classes_name,entry_date,is_delete) values(?,?,?,now(),false)";
	private final String SQL_FIND_BY_ID="select * from class_for_training where class_id=?";
	private final String SQL_FIND_ALL="select * from class_for_training";
	private final String SQL_DELETE_BY_ID="delete from class_for_training where class_id=? ";
	private final String SQL_DELETE_ALL="delete from class_for_training";
	private final String SQL_UPDATE="update class_for_training set classes_name=? where class_id=?";
	private final String SQL_FIND_All="select * from class_for_training";


	
	public ClassesForTrainingDaoImpl(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	

	
	@Override
	public int save(ClassesForTrainingBo classesForTrainingBo) {
		
		int status=jdbcTemplate.update(SQL_SAVE, new Object[] {classesForTrainingBo.getClassId(),classesForTrainingBo.getPatternId(),classesForTrainingBo.getClassesName()});
		
		if(status != 0)
		{
            System.out.println("One Record inserted for ID " + classesForTrainingBo.getClassId());
        }
		else
		{
            System.out.println("Not a single Record inserted  " );
        }
		return status;

	}

	
	
	
	@Override
	public int update(ClassesForTrainingBo classesForTrainingBo) {
		
		
		int status= jdbcTemplate.update(SQL_UPDATE, new Object[] {classesForTrainingBo.getClassesName(),classesForTrainingBo.getClassId()});
		if(status != 0)
		{
            System.out.println("One Record Updated for ID " + classesForTrainingBo.getClassId());
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
            System.out.println("ClassForTraining data deleted for ID " + id);
        }
		else
		{
            System.out.println("No ClassForTraining data found with ID " + id);
        }
		return status;	}
	

	@Override
	public int delete() {

		int status= jdbcTemplate.update(SQL_DELETE_ALL);
		if(status != 0)
		{
            System.out.println("All records deleted from ClassForTraining " );
        }
		else
		{
            System.out.println("Not a Single Record is deleted ");
        }
		return status;
	}
	
	

	@Override
	public List<ClassesForTrainingBo> findAll() {
		return jdbcTemplate.query(SQL_FIND_ALL, new FindAllRowMapper());

	}
	
	
	class FindAllRowMapper implements RowMapper
	{

		@Override
		public Object mapRow(ResultSet rs, int index) throws SQLException {
			ClassesForTrainingBo classesForTrainingBo=new ClassesForTrainingBo();
			classesForTrainingBo.setClassId(rs.getInt(1));
			classesForTrainingBo.setPatternId(rs.getInt(2));
			classesForTrainingBo.setClassesName(rs.getString(3));
			return classesForTrainingBo;
		}
		
	}

		
	@Override
	public ClassesForTrainingBo findById(int id) {
		return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new Object[] {id}, new FindByIDRowMapper()); 
	}
	
	class FindByIDRowMapper implements RowMapper
	{

		@Override
		public Object mapRow(ResultSet rs, int index) throws SQLException {
			
			ClassesForTrainingBo classesForTrainingBo=new ClassesForTrainingBo();
			 classesForTrainingBo.setClassId(rs.getInt(1));
			 classesForTrainingBo.setPatternId(rs.getInt(2));
			 classesForTrainingBo.setClassesName(rs.getString(3));

			 return classesForTrainingBo;
		}
		
	}
		
		
	}


