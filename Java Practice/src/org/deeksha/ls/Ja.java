package com.ls;

public class Ja {
	
	public static void main(String[] args) {
		int i = 1551;
		int reverse = 0;
		int Duplicate = i;
		
		while(i>0)
		{
			int r = i % 10;
			reverse = (reverse*10)+r;
			
			 i = i/10;
			
		}
		if (reverse == Duplicate)
		{
			System.out.print("polyndrome");
		}
		else
		{
			System.out.println("Not polyndrome");
		}
	
	}

}
