package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=	new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		
		
		Student obj1= con.getBean("obj-Name",Student.class);
		System.out.println(obj1);
		System.out.println(obj1.hashCode()); //same by default
//		Hashcode of both objects will be the same, coz by default the scope is "SINGLETON"
//		We can define the scope, using 2 ways:
//		1. @Scope("prototype")
//		2. Scope="protoype" in xml file
		Student obj2= con.getBean("obj-Name",Student.class);
		System.out.println(obj2.hashCode()); //different, if the scope is prototype
		
		
		System.out.println(obj1.getSubjects());
		System.out.println(obj1.getSubjects().getClass().getName());
	}

}
