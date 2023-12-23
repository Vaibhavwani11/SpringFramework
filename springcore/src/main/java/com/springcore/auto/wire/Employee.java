package com.springcore.auto.wire;

public class Employee {

	private Company com; //I need to inject the value to this variable using Spring
	//So, I can do this using 1> CONVENTIONAL METHOD or 2> using AUTO-WIRING
	//Check config.xml file for more details.

	public Company getCom() {	
		return com;
	}

	public Employee(Company com) {
		super();
		this.com = com;
		System.out.println("Inside constructor");
	}

	public void setCom(Company com) {
		this.com = com;
	}

	@Override
	public String toString() {
		return "Employee [com=" + com + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
