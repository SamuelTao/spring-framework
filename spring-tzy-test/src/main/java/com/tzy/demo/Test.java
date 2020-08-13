package com.tzy.demo;

//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tzy.demo.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
		UserDao userDao = acac.getBean(UserDao.class);
		userDao.printInfo();
	}
}
