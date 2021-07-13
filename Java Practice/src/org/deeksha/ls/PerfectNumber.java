package com.ls;

public class PerfectNumber {
	public static void main(String[] args) {
		int num =6;
		int inti=1;
		
		while(inti<num)
		{
			if(num % inti == 0)
			{
				inti = inti+num;
			}
			inti++;
			}
		if(inti==num)
		{
			System.out.println("Perfect");
		}
		else
			System.out.println("Not Perfect");
		}
	}
	
