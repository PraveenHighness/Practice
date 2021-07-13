package com.ls;

public class Banking {

	private String name;
	private long AcNo;
	private String Ifsc;
	private String Branch;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAcNo() {
		return AcNo;
	}
	public void setAcNo(long acNo) {
		AcNo = acNo;
	}
	public String getIfsc() {
		return Ifsc;
	}
	public void setIfsc(String ifsc) {
		Ifsc = ifsc;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	@Override
	public String toString() {
		return "Banking [name=" + name + ", AcNo=" + AcNo + ", Ifsc=" + Ifsc + ", Branch=" + Branch + "]";
	}
	
}
