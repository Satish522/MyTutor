package com.swapna.mytutor.common;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.swapna.mytutor.bo.StudyPatternBo;
import com.swapna.mytutor.bo.UserRoleBO;
import com.swapna.mytutor.dao.impl.StudyPatternDaoImpl;
import com.swapna.mytutor.dao.impl.UserRoleDaoImpl;

public class StudyPatternApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("persistencylayer.xml");
		StudyPatternDaoImpl daoImpl = context.getBean("studyPattern", StudyPatternDaoImpl.class);
		Scanner sc=new Scanner(System.in);
		
		
		/*//InsertRecords..
		System.out.println("Enter PatternId..:");
		int patternId=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Pattern Name  :");
		String patternName=sc.nextLine();
		
		StudyPatternBo  studyPattern=new StudyPatternBo();
		studyPattern.setPatternId(patternId);
		studyPattern.setPatternName(patternName);

		Integer count = daoImpl.save(studyPattern);
*/		
		
		
		/*//update..
		System.out.println("Enter PatternId..:");
		int patternId=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Pattern Name  :");
		String patternName=sc.nextLine();
		
		StudyPatternBo  studyPattern=new StudyPatternBo();
		studyPattern.setPatternId(patternId);
		studyPattern.setPatternName(patternName);
		
		Integer count = daoImpl.update(studyPattern);
		*/
		
		/*//Delete By Id...
		System.out.println("Enter PatternId..:");
		int patternId=Integer.parseInt(sc.nextLine());
		
		StudyPatternBo  studyPattern=new StudyPatternBo();
		studyPattern.setPatternId(patternId);
		
		Integer count = daoImpl.deleteById(patternId);
		
*/		
		
		/*//DeleteAll
		Integer count = daoImpl.delete();
	*/

		
		
		/*//FindAll.....
		List<StudyPatternBo> count = daoImpl.findAll();
		for(StudyPatternBo bo:count)
		{
			System.out.println(bo);
		}
*/		
		
		
		
		/*//FindById..
		System.out.println("Enter PatternId..:");
		int patternId=Integer.parseInt(sc.nextLine());
		
		StudyPatternBo  studyPattern=new StudyPatternBo();
		studyPattern.setPatternId(patternId);
		StudyPatternBo count = daoImpl.findById(patternId);
		System.out.println(count);
		
*/		
		
	}
	}


