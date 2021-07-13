package org.deeksha.flowcontrol;

import java.util.Scanner;

public class Recure {
	
	public static void main(String[] args ) {
		
		Scanner marks = new Scanner(System.in);
		System.out.println("Enter your marks");
		
		double sscpercentage = marks.nextDouble();
		double interpercentage =marks.nextDouble();
		double degreepercentage	=marks.nextDouble();
		
		
	
		
		if ((sscpercentage >= 75) && (interpercentage >= 80) && (degreepercentage >= 70))
		{
		
			System.out.println("You are eligible for interview");
		}
		
		else {
		System.out.println("Not eligible for interview");
		}
		
	}

}
