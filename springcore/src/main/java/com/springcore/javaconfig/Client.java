package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
		
		Student s = con.getBean("student",Student.class);
		System.out.println(s);
	}

}
