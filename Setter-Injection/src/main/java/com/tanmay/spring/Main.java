package com.tanmay.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDAO employee = (EmployeeDAO) app.getBean("edao");
		employee.displayConfiguration();
	}

}
