package org.deeksha.flowcontrol;

import java.util.Scanner;

public class For1_10 {
	public static void main(String[] args) {
		int n;
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");  
		n=scan.nextInt();
		
		for(int i=0;i<=n;i++) {
			if(i!=10 && i!=20)
			System.out.println("");
		}
	}
}
