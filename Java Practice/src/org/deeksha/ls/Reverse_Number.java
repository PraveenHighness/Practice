package com.ls;

public class Reverse_Number {
	public static void main(String[] args) {
		int i = 12;
		int reverse = 0;
		int Compar = i;
		
		while(i>0)
		{
			int rev = i % 10;
			reverse = (reverse*10)+rev;
			
			 i = i/10;
			
		}
		System.out.println(reverse);
	}

}
