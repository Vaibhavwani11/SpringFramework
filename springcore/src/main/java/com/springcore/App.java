package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
	  
    System.out.println("Hello World!");
   
    //Instead of creating object of Student class here,
    //we'll instantiate it using Spring

    //Tight coupling
    Student s = new Student(10,"abc","Mumbai");
    System.out.println(s);
    
    
    //This is DEPENDENCY INJECTION
    ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    Student student1 = context.getBean("Student1",Student.class);
  
    Student student2 = (Student)context.getBean("Student2");
    System.out.println(student2.hashCode() + " " + student1.hashCode());
    Student student3 = (Student)context.getBean("Student3");
    
    System.out.println(student1);
    System.out.println(student2);
    System.out.println(student3.getStudentId()+student1.getStudentId());
  }
}
















