package com.swapna.mytutor.common;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.swapna.mytutor.bo.UserRoleBO;
import com.swapna.mytutor.dao.impl.UserRoleDaoImpl;
import com.swapna.mytutor.dao.impl.UserRoleDaoQueryBased;

public class UserRoleApplication {
	public static void main(String args[])
	{
	
	ApplicationContext context = new ClassPathXmlApplicationContext("persistencylayer.xml");
	UserRoleDaoQueryBased daoImpl = context.getBean("userRole", UserRoleDaoQueryBased.class);
	Scanner sc=new Scanner(System.in);
	
	
	//InsertRecords..
	System.out.println("Enter RoleId..:");
	int roleId=Integer.parseInt(sc.nextLine());
	System.out.println("Enter Role Name  :");
	String roleName=sc.nextLine();
	System.out.println("Enter Privilege :");
	String privilege=sc.nextLine();
	
	UserRoleBO userRole=new UserRoleBO();
	userRole.setRoleId(roleId);
	userRole.setRoleName(roleName);
	userRole.setPrivilege(privilege);
	
	Integer count = daoImpl.save(userRole);
	
	
	
	/*//update..
	System.out.println("Enter RoleId..:");
	int roleId=Integer.parseInt(sc.nextLine());
	System.out.println("Enter Role Name  :");
	String roleName=sc.nextLine();
	
	UserRoleBO userRole=new UserRoleBO();
	userRole.setRoleId(roleId);
	userRole.setRoleName(roleName);
	
	Integer count = daoImpl.update(userRole);*/
	
	
	
	
	/*//Delete By Id...
	System.out.println("Enter RoleId..:");
	int roleId=Integer.parseInt(sc.nextLine());
	
	UserRoleBO userRole=new UserRoleBO();
	userRole.setRoleId(roleId);
	
	Integer count = daoImpl.deleteById(roleId);*/
	
	
	
	/*//DeleteAll
	Integer count = daoImpl.delete();

*/
	
	
	/*//FindAll.....
	List<UserRoleBO> count = daoImpl.findAll();
	for(UserRoleBO bo:count)
	{
		System.out.println(bo);
	}
	
*/	
	
	
	/*//FindById..
	System.out.println("Enter RoleId..:");
	int roleId=Integer.parseInt(sc.nextLine());

	
	UserRoleBO userRole=new UserRoleBO();
	userRole.setRoleId(roleId);

	UserRoleBO count = daoImpl.findById(roleId);
	System.out.println(count);
	*/
	
	
}
}

