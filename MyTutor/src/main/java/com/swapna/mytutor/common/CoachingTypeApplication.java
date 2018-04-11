package com.swapna.mytutor.common;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.swapna.mytutor.bo.CoachingTypeBo;
import com.swapna.mytutor.bo.StudyPatternBo;
import com.swapna.mytutor.dao.impl.CoachingTypeDaoImpl;
import com.swapna.mytutor.dao.impl.StudyPatternDaoImpl;

public class CoachingTypeApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("persistencylayer.xml");
		CoachingTypeDaoImpl daoImpl = context.getBean("coachingTypeDaoImpl", CoachingTypeDaoImpl.class);
		Scanner sc=new Scanner(System.in);
		
		
		/*//InsertRecords..
		System.out.println("Enter CoachingId..:");
		int coachingId=Integer.parseInt(sc.nextLine());
		System.out.println("Enter CoachingType  :");
		String coachingType=sc.nextLine();
		
		CoachingTypeBo coachingTypeBo=new CoachingTypeBo();
		coachingTypeBo.setCoachingId(coachingId);
		coachingTypeBo.setCoachingType(coachingType);

		Integer count = daoImpl.save(coachingTypeBo);*/
		
		
		
		/*//update..
		System.out.println("Enter CoachingId..:");
		int coachingId=Integer.parseInt(sc.nextLine());
		System.out.println("Enter CoachingType  :");
		String coachingType=sc.nextLine();
		
		CoachingTypeBo coachingTypeBo=new CoachingTypeBo();
		coachingTypeBo.setCoachingId(coachingId);
		coachingTypeBo.setCoachingType(coachingType);		
		Integer count = daoImpl.update(coachingTypeBo);*/
		
		
		/*//Delete By Id...
		System.out.println("Enter CoachingId..:");
		int coachingId=Integer.parseInt(sc.nextLine());
		
		CoachingTypeBo coachingTypeBo=new CoachingTypeBo();
		coachingTypeBo.setCoachingId(coachingId);
		
		Integer count = daoImpl.deleteById(coachingId);*/
		
		
		
		/*//DeleteAll
		Integer count = daoImpl.delete();
	
*/
		
		
		/*//FindAll.....
		List<CoachingTypeBo> count = daoImpl.findAll();
		for(CoachingTypeBo bo:count)
		{
			System.out.println(bo);
		}
		*/
		
		
		
		/*//FindById..
		System.out.println("Enter CoachingId..:");
		int coachingId=Integer.parseInt(sc.nextLine());
		
		CoachingTypeBo coachingTypeBo=new CoachingTypeBo();
		coachingTypeBo.setCoachingId(coachingId);
		CoachingTypeBo count = daoImpl.findById(coachingId);
		System.out.println(count);
		
		*/
	}

}
