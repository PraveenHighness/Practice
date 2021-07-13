package com.ls;

public class ATM2 {
public static void main(String[] args) {
	ATM atm = new ATM();
	atm.setBalance(100000);
	atm.setName("SBI");
	atm.setPINno(75);
	atm.setType("Saving");
	
	System.out.println(atm);
}
}
