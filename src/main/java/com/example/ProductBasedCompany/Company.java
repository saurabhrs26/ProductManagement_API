package com.example.ProductBasedCompany;

import java.util.ArrayList;

public class Company {
	String companyName;
	ArrayList<Department> dept;
	boolean inProfit;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}
	


	public Company(String companyName, ArrayList<Department> dept, boolean inProfit) {
		super();
		this.companyName = companyName;
		this.dept = dept;
		this.inProfit = inProfit;
	}



	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public ArrayList<Department> getDept() {
		return dept;
	}

	public void setDept(ArrayList<Department> dept) {
		this.dept = dept;
	}

	public boolean isInProfit() {
		return inProfit;
	}

	public void setInProfit(boolean inProfit) {
		this.inProfit = inProfit;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", dept=" + dept + ", inProfit=" + inProfit + "]";
	}
	
	

}
