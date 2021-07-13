package org.deeksha.flowcontrol;

import java.util.Scanner;

public class Switch_even_or_Odd {
	public static void main(String[] args) {
		int n;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		n=scan.nextInt();
		
		
		
		switch(n%2) {
		
		case 0 : System.out.println("Even");
		break;
		
		case 1 : System.out.println("Odd");
		break;
		
		default : System.out.println("Undefined");
		
		
	}
		
}

}