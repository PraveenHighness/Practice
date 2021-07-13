package org.deeksha.flowcontrol;

import java.util.Scanner;

public class For_Dcrmnt {
	public static void main(String[] args) {
		int i;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		i=scan.nextInt();
		
		
		
		for(int j=0;j<=i;j++) {
			if (j<=4) {
			System.out.println("hi");
			}
			else
			System.out.println("hello");

		}
		
	}

}
