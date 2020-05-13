package com.tanmay.spring.constructor.injection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
	    ApplicationContext contextObj = new ClassPathXmlApplicationContext("applicationContext.xml");
	    Customer c = new Customer(1,"sf","df",445);
	    Membership member = new Membership(34,"sd",34,c);
		member = (Membership) contextObj.getBean("memObj");
		member.printMembershipDetails();
	}
}
