package com.ls;

public class Bike {
	private long RegNo;
	private String Company;
	private String CC;
	private int milage;
	private String Fuel;
	public long getRegNo() {
		return RegNo;
	}
	public void setRegNo(long regNo) {
		RegNo = regNo;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getCC() {
		return CC;
	}
	public void setCC(String cC) {
		CC = cC;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public String getFuel() {
		return Fuel;
	}
	public void setFuel(String fuel) {
		Fuel = fuel;
	}
	@Override
	public String toString() {
		return "Bike [RegNo=" + RegNo + ", Company=" + Company + ", CC=" + CC + ", milage=" + milage + ", Fuel=" + Fuel
				+ "]";
	}
	

}
