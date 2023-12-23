package com.springcore.auto.wire.annotation;

public class Company {
	
	private String name;
	private String type;

	@Override
	public String toString() {
		return "Company [name=" + name + ", type=" + type + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Setting Value");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
		System.out.println("Setting Value");
	}

	public Company() {
		// TODO Auto-generated constructor stub
	}

}
