package com.example.ProductBasedCompany;

import java.util.ArrayList;

public class Department {
	String Deptname;
	String Lead;
	String Manager;
	ArrayList<Employee> employees;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String name, String lead, String manager, ArrayList<Employee> employees) {
		super();
		this.Deptname = name;
		Lead = lead;
		Manager = manager;
		this.employees = employees;
	}

	public String getDeptname() {
		return Deptname;
	}

	public void setDeptname(String deptname) {
		Deptname = deptname;
	}

	public String getLead() {
		return Lead;
	}

	public void setLead(String lead) {
		Lead = lead;
	}

	public String getManager() {
		return Manager;
	}

	public void setManager(String manager) {
		Manager = manager;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [Deptname=" + Deptname + ", Lead=" + Lead + ", Manager=" + Manager + ", employees="
				+ employees + "]";
	}
	
	
	
	

}
