package com.swapna.mytutor.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swapna.mytutor.bo.RegisterBo;
import com.swapna.mytutor.bo.StudentBo;
import com.swapna.mytutor.bo.TeacherBo;
import com.swapna.mytutor.controller.RegisterController;
import com.swapna.mytutor.dao.impl.RegisterDao;
import com.swapna.mytutor.dao.impl.StudentDao;
import com.swapna.mytutor.dao.impl.TeacherDao;
import com.swapna.mytutor.dto.RegisterDto;

@Service
public class RegisterService {

	private static final Logger logger = LoggerFactory.getLogger(RegisterService.class);

	@Autowired
	RegisterDao registerDao;

	@Autowired
	TeacherDao teacherDao;

	@Autowired
	StudentDao studentDao;

	public int register(RegisterDto registerDto) {
		System.out.println("Inside Service dto" + registerDto);
		RegisterBo registerBo = new RegisterBo();
		registerBo.setFullName(registerDto.getFullName());
		registerBo.setEmailId(registerDto.getEmailId());
		registerBo.setPassword(registerDto.getPassword());
		registerBo.setUserId(registerDto.getUserId());

		int flag = registerDao.register(registerBo);

		int ret;
		if (registerDto.getUserType().equals("T") && flag > 0) {
			
			logger.info("Entering Teacher's data..");
			TeacherBo teacherBo = new TeacherBo();
			teacherBo.setTeacherId(registerDto.getUserId());
			teacherBo.setFullname(registerDto.getFullName());
			teacherBo.setMailid(registerDto.getEmailId());

			ret = teacherDao.register(teacherBo);
		
			if(ret > 0) {
				logger.info("Teacher's data sucessfully registered..");
				}
			else {
				logger.error("Something wrong in data register..");
			}
			

		}else if (registerDto.getUserType().equals("S") && flag > 0) {
			
				logger.info("Entering Student's data..");
				StudentBo studentBo = new StudentBo();
				studentBo.setStudentId(registerDto.getUserId());
				studentBo.setStudentName(registerDto.getFullName());
				studentBo.setMailId(registerDto.getEmailId());

				ret = studentDao.register(studentBo);
				if(ret > 0) {
					logger.info(" Student's data sucessfully registered..");
					}
				else {
					logger.error("Something wrong in data register..");
				}
		}
		

		return flag;

	}

}
