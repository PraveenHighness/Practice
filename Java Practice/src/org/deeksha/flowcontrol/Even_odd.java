package org.deeksha.flowcontrol;

import java.util.Scanner;

public class Even_odd {
	public static void main(String[] args) {
		int x;
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Number");
	x=scanner.nextInt();
	
		if( x%2==0)
		{
			System.out.println("Even");
			
		}
		else {
			System.out.println("Odd");
		}
		
	}

}
