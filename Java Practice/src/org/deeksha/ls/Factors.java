package com.ls;

public class Factors {
public static void main(String[] args) {
	int i =1;
	int num =6;
	
	while(i<=6)
	{
		if(num % i == 0)
		{
			System.out.println(i);
		}
		i++;
	}
}
}
