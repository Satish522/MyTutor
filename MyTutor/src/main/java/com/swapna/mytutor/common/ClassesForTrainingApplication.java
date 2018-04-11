package com.swapna.mytutor.common;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class ClassesForTrainingApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("persistencylayer.xml");
		//ClassesForTrainingDaoImpl daoImpl = context.getBean("classesForTrainingDaoImpl", ClassesForTrainingDaoImpl.class);
		Scanner sc=new Scanner(System.in);
		
		
		/*//InsertRecords..
		System.out.println("Enter ClassId..:");
		int classId=Integer.parseInt(sc.nextLine());
		System.out.println("Enter PatternId..:");
		int patternId=Integer.parseInt(sc.nextLine());
		System.out.println("Enter classes Name  :");
		String classesName=sc.nextLine();
		
		ClassesForTrainingBo classesForTrainingBo=new ClassesForTrainingBo();
		classesForTrainingBo.setClassId(classId);
		classesForTrainingBo.setPatternId(patternId);
		classesForTrainingBo.setClassesName(classesName);

		Integer count = daoImpl.save(classesForTrainingBo);*/
		
		
		
		/*//update..
		System.out.println("Enter ClassId..:");
		int classId=Integer.parseInt(sc.nextLine());
		System.out.println("Enter classes Name  :");
		String classesName=sc.nextLine();
		
		ClassesForTrainingBo classesForTrainingBo=new ClassesForTrainingBo();
		classesForTrainingBo.setClassId(classId);
		classesForTrainingBo.setClassesName(classesName);
		Integer count = daoImpl.update(classesForTrainingBo);  */
		
		
		/*//Delete By Id...
		System.out.println("Enter ClassId..:");
		int classId=Integer.parseInt(sc.nextLine());
				
		ClassesForTrainingBo classesForTrainingBo=new ClassesForTrainingBo();
		classesForTrainingBo.setClassId(classId);
		Integer count = daoImpl.deleteById(classId);
		*/
		
		
		/*//DeleteAll
		Integer count = daoImpl.delete();
	
*/
		
		
		/*//FindAll.....
		List<ClassesForTrainingBo> count = daoImpl.findAll();
		for(ClassesForTrainingBo bo:count)
		{
			System.out.println(bo);
		}
*/		
		
		
		
		/*//FindById..
		System.out.println("Enter ClassId..:");
		int classId=Integer.parseInt(sc.nextLine());
				
		ClassesForTrainingBo classesForTrainingBo=new ClassesForTrainingBo();
		classesForTrainingBo.setClassId(classId);
		ClassesForTrainingBo count = daoImpl.findById(classId);
		System.out.println(count);*/
		
		
		
	}
	}


