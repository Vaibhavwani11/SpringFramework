package com.springcore.collections;

import java.util.*;

public class Employee {

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int empId;
	private String Name;
	private List<String> assignedBugs;
	private HashMap<String, Integer> tickets;
	
	public HashMap<String, Integer> getTickets() {
		return tickets;
	}


	public void setTickets(HashMap<String, Integer> tickets) {
		this.tickets = tickets;
	}


	public Employee(int empId, String name, List<String> assignedBugs, HashMap<String, Integer> JIRA) {
	
		this.empId = empId;
		Name = name;
		this.assignedBugs = assignedBugs;
		this.tickets = JIRA;
	}
	

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<String> getAssignedBugs() {
		return assignedBugs;
	}
	public void setAssignedBugs(List<String> assignedBugs) {
		this.assignedBugs = assignedBugs;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Name=" + Name + ", assignedBugs=" + assignedBugs + ", tickets=" + tickets
				+ "]";
	}

	
}
