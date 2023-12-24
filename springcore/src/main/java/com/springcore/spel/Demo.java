package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{22+11}")
	private int x;
	@Value("#{100-1}")
	private int y;
	
	//Calling a static method using spEL
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private int z;
	
	//Calling a static variable using spEL
	@Value("#{ T(java.lang.Math).PI }")
	private double pi;
	
	//Passing a object in spEL
	@Value("#{ new java.lang.String('Vaibhav P. Wani') }")
	private String name;
	
	//write an expression which will resolve to a boolean value, to PASS A BOOLEAN VALUE using spEL
	@Value("#{8>3} ") 
	private boolean isActive;
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		System.out.println("Setting Value");
		this.pi = pi;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
}
