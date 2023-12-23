package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autowireConfig.xml");
		
		//No need to typecast if we pass 2nd arg as className.class
		Company obj = context.getBean("c1",Company.class);
		
		System.out.println(obj);
		Employee obj0 = context.getBean("e0",Employee.class);
		System.out.println(obj0);
		
		Employee obj1 = context.getBean("e1",Employee.class);
		System.out.println(obj1);
		
		Employee obj2 = (Employee) context.getBean("e2");
		System.out.println(obj2);
	}

}
