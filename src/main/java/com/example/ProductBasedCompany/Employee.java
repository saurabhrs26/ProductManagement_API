package com.example.ProductBasedCompany;

public class Employee {

	
	int empID;
	String name;
	String role;
	float salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empID, String name, String role, float salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + empID + ", Name=" + name + ", Role=" + role + ", Salary=" + salary + "]";
	}
	
	

	

}
