package com.ls;

public class Olmpcs {
	private String country;
	private int ccount;
	private int types;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getCcount() {
		return ccount;
	}
	public void setCcount(int ccount) {
		this.ccount = ccount;
	}
	public int getTypes() {
		return types;
	}
	public void setTypes(int types) {
		this.types = types;
	}
	@Override
	public String toString() {
		return "Olmpcs [country=" + country + ", ccount=" + ccount + ", types=" + types + "]";
	}
	
	
	

}
