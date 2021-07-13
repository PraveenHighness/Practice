package com.ls;

public class Sum_of_given_num {
	public static void main(String[] args) {
		
	int i = 9698;
	int sum =0;
	int s=i;
	
	int r;
	
	while(i>0)
	{
		r=(i%10);
		sum =sum+r; 
		i=i/10;
	}
	
System.out.println(sum);
}
}
