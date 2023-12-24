package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.*;

@Component("obj-Name")
@Scope("prototype")
public class Student {

	@Value("Vaibhav Wani")
	private String StudentName;
	
	@Value("Pune")
	private String city;
	
	public List<String> getSubjects() {
		return Subjects;
	}

	public void setSubjects(List<String> subjects) {
		Subjects = subjects;
	}

	@Value("#{temp}")
	private List<String> Subjects;
	
	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", city=" + city + "]";
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

}
