package com.ls;

public class Technologies {
	private int TechNo;
	private String List;
	private int CrsFee;
	public int getTechNo() {
		return TechNo;
	}
	public void setTechNo(int techNo) {
		TechNo = techNo;
	}
	public String getList() {
		return List;
	}
	public void setList(String list) {
		List = list;
	}
	public int getCrsFee() {
		return CrsFee;
	}
	@Override
	public String toString() {
		return "Technologies [TechNo=" + TechNo + ", List=" + List + ", CrsFee=" + CrsFee + "]";
	}
	public void setCrsFee(int crsFee) {
		CrsFee = crsFee;
	}

}
