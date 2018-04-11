package com.swapna.mytutor.common;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.swapna.mytutor.bo.SubjectForClassBo;
import com.swapna.mytutor.dao.impl.SubjectForClassDaoImpl;

public class SubjectForClassApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("persistencylayer.xml");
		SubjectForClassDaoImpl daoImpl = context.getBean("subjectForClassDaoImpl", SubjectForClassDaoImpl.class);
		Scanner sc=new Scanner(System.in);
		
		
		/*//InsertRecords..
		System.out.println("Enter SubjectId..:");
		int subjectId=Integer.parseInt(sc.nextLine());
		System.out.println("Enter ClassId..:");
		int classId=Integer.parseInt(sc.nextLine());
		System.out.println("Enter PatternId..:");
		int patternId=Integer.parseInt(sc.nextLine());
		System.out.println("Enter subject Name  :");
		String subjectName=sc.nextLine();
		
		SubjectForClassBo subjectForClassBo=new SubjectForClassBo();
		subjectForClassBo.setSubjectId(subjectId);
		subjectForClassBo.setClassId(classId);
		subjectForClassBo.setPatternId(patternId);
		subjectForClassBo.setSubjectName(subjectName);

		Integer count = daoImpl.save(subjectForClassBo);
*/		
		
		
		/*//update..
		System.out.println("Enter SubjectId..:");
		int subjectId=Integer.parseInt(sc.nextLine());
		System.out.println("Enter subject Name  :");
		String subjectName=sc.nextLine();
		
		SubjectForClassBo subjectForClassBo=new SubjectForClassBo();
		subjectForClassBo.setSubjectId(subjectId);
		subjectForClassBo.setSubjectName(subjectName);
		Integer count = daoImpl.update(subjectForClassBo);*/  
		
		
		/*//Delete By Id...
		System.out.println("Enter SubjectId..:");
		int subjectId=Integer.parseInt(sc.nextLine());
				
		SubjectForClassBo subjectForClassBo=new SubjectForClassBo();
		subjectForClassBo.setSubjectId(subjectId);
		Integer count = daoImpl.deleteById(subjectId);
		*/
		
		
		/*//DeleteAll
		Integer count = daoImpl.delete();
*/	

		
		
		/*//FindAll.....
		List<SubjectForClassBo> count = daoImpl.findAll();
		for(SubjectForClassBo bo:count)
		{
			System.out.println(bo);
		}
*/		
		
		
		
		/*//FindById..
		System.out.println("Enter SubjectId..:");
		int subjectId=Integer.parseInt(sc.nextLine());
		
		SubjectForClassBo subjectForClassBo=new SubjectForClassBo();
		subjectForClassBo.setSubjectId(subjectId);
		SubjectForClassBo count = daoImpl.findById(subjectId);
		System.out.println(count);*/
		
		
		
	}
	}


