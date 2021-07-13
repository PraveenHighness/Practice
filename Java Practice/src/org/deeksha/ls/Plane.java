package com.ls;

public class Plane {
	private String PSPTNo;
	private long Adharno;
	private  double timing;
	private String place;
	public String getPSPTNo() {
		return PSPTNo;
	}
	public void setPSPTNo(String pSPTNo) {
		PSPTNo = pSPTNo;
	}
	public long getAdharno() {
		return Adharno;
	}
	public void setAdharno(long adharno) {
		Adharno = adharno;
	}
	public double getTiming() {
		return timing;
	}
	public void setTiming(double timing) {
		this.timing = timing;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Plane [PSPTNo=" + PSPTNo + ", Adharno=" + Adharno + ", timing=" + timing + ", place=" + place + "]";
	}

}
