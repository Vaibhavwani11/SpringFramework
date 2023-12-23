package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	//Using @Autowired annotation on variable, @Autowired can be used on VARIABLE / SETTER METHOD / CONSTRUCTOR
	@Autowired
	@Qualifier("com")
	private Company com; 

	public Company getCom() {	
		return com;
	}

//	@Autowired
//	@Qualifier("c1") this cannot be used on a constructor
	public Employee(Company com) {
		super();
		this.com = com;
		System.out.println("Inside constructor");
	}

//	@Autowired
//	@Qualifier("com")
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
