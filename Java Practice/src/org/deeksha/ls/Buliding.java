package com.ls;

public class Buliding {

	private String Place;
	private int Flore;
	private int Regno;
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		Place = place;
	}
	public int getFlore() {
		return Flore;
	}
	@Override
	public String toString() {
		return "Buliding [Place=" + Place + ", Flore=" + Flore + ", Regno=" + Regno + "]";
	}
	public void setFlore(int flore) {
		Flore = flore;
	}
	public int getRegno() {
		return Regno;
	}
	public void setRegno(int regno) {
		Regno = regno;
	}
	
}
