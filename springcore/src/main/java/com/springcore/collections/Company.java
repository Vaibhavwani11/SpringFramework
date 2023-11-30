package com.springcore.collections;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionsConfig.xml");
		Employee emp1 = (Employee)context.getBean("Employee1");
		
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getTickets());
		System.out.println(emp1.getAssignedBugs());
		System.out.println(emp1.getName()
				);
	}

}
