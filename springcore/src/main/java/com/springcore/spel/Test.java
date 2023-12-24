package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		
		Demo obj = con.getBean("demo",Demo.class);
		System.out.println(obj);
	}

}
