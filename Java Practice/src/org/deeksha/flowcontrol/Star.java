package org.deeksha.flowcontrol;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		int i;
		int j;
		int x;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Numbers");
		j=scan.nextInt();
		x=scan.nextInt();
		
		for(i=0;i<=j;i++) {
			for(int z=0;z<=x;z++) {
			System.out.print("*");
			}
			System.out.println();
		}
			
	}

}
