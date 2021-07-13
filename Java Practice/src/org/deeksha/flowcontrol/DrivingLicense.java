package org.deeksha.flowcontrol;

import java.util.Scanner;

public class DrivingLicense {
	public static void main (String[] args) {
	int age;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Age");
	age = scan.nextInt();
	
	String s;
	System.out.println("Age");
	s=scan.next();
		
	
	
	if (age >= 20 && age <= 60) {
		
		System.out.println("Eligible");
	}
	else if (age > 60) {
		System.out.println("High Priority");
	}
	else {
		System.out.println("Rjctd");
	}
	
	}
}
