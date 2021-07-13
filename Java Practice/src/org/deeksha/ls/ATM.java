package com.ls;

public class ATM {
	private String Name;
	private int PINno;
	private long Balance;
	private String Type;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPINno() {
		return PINno;
	}
	public void setPINno(int pINno) {
		PINno = pINno;
	}
	public long getBalance() {
		return Balance;
	}
	public void setBalance(long balance) {
		Balance = balance;
	}
	public String getType() {
		return Type;
	}
	@Override
	public String toString() {
		return "ATM [Name=" + Name + ", PINno=" + PINno + ", Balance=" + Balance + ", Type=" + Type + "]";
	}
	public void setType(String type) {
		Type = type;
	}

}
