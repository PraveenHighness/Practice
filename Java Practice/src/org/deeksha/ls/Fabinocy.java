package com.ls;

public class Fabinocy {
	public static void main(String[] args) {
		
	int num=100;
	int a=0;
	int b=0;
	int c=1;
	
	int i=0;
	
	while(i<=num)	
	{
		a=b;
		b=c;
		c=a+b;
		
		System.out.println(a);
		
		i++;
}
	}
}
