package org.deeksha.flowcontrol;

import java.util.Scanner;

public class Nested_loop {
	public static void main(String[] args) {
		int x;
		Scanner scan = new Scanner(System.in);
		System.out.println("number");
		x=scan.nextInt();		
		
		for (int i=0;i<=x;i++) {
			for(int z=i;z<x;z++) 
		System.out.println("hi"+" "+"Hello");
		}
	}
}