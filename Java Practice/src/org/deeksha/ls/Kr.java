package com.ls;

public class Kr {
	public static void main(String[] args) {
		
	int i = 153;
	int cube = 0;
	int k =i;


	while (i>0)
	{
		int g = i%10;
		cube = cube+g*g*g;
		
		i =i/10;
	}
	if (cube==k)
	{
		System.out.print("Amstrong");
		
	}
	else
	{
		System.out.println("Not Amstrong");
	}
	
}
}
