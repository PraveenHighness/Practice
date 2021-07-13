package com.ls;

public class College {
	private String name;
	private int stngth;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStngth() {
		return stngth;
	}
	public void setStngth(int stngth) {
		this.stngth = stngth;
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", stngth=" + stngth + ", getName()=" + getName() + ", getStngth()="
				+ getStngth() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
	

}
