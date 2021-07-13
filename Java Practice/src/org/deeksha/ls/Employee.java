package com.ls;

public class Employee {
	private String Company;
	private long Phno;
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public long getPhno() {
		return Phno;
	}
	public void setPhno(long phno) {
		Phno = phno;
	}
	@Override
	public String toString() {
		return "Employee [Company=" + Company + ", Phno=" + Phno + "]";
	}
	 
	 
	}


