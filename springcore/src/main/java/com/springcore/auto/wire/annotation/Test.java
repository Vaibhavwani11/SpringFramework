package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autowireConfig2.xml");
		
		//No need to typecast if we pass 2nd arg as className.class
		Company obj = context.getBean("c1",Company.class);
		System.out.println(obj);
		
		Employee obj0 = context.getBean("emp1",Employee.class);
		System.out.println(obj0);
	}

}
