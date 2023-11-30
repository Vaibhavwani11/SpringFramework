package com.springcore;

//This is a BEAN
public class Student {

	private int studentId;
	private String Name;
	private String Address;
	
	public Student(int studentId, String name, String address) {
		super();
		this.studentId = studentId;
		Name = name;
		Address = address;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		System.out.println("Get Student ID");
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("Set Student ID");	
		this.studentId = studentId;
	}
	public String getName() {
		
		return Name;
	}
	public void setName(String name) {

		System.out.println("Set Student Name");
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {

		System.out.println("Set Student Address");
		Address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
	
}
