package com.wyk.spring.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wyk.spring.manager.UserManager;

public class Main {

	public static void main(String[] args){
		
		/**Spring AOP的应用*/
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		UserManager manager = (UserManager)factory.getBean("userManager");
		manager.delUser(1); 
	
		//manager.addUser("hehe", "123456"); 
	}
}
