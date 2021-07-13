package com.ls;

public class Polyndrome {
	public static void main(String[] args) {
		int i = 151;
		int temp = 1;
		int x = 0;
		int s;
		while (i > 0) {
			s = i % 10;

			x = (x * 10) + s;
			i = i / 10;
		}
		if (temp == x)
			System.out.print("Polindrome");

		else
			System.out.println("Not Polindrome");

	}
}
