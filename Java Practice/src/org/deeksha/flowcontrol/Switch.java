package org.deeksha.flowcontrol;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		int number;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Number");
		number=scan.nextInt();
		
		
		switch (number) {
		
		case 1 : System.out.println("Hi");
		break;
		
		case 5 : System.out.println("Hello");
		break;
		
		case 10 :System.out.println("Hello java");
		break;
		
		case 20 : System.out.println("Hi");
		break;
		
		default  :System.out.println("Empty");
		}
		}
		
		
	}


