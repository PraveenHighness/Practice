package com.ls;

public class Amstrongg {
	public static void main(String[] args) {
		
	int i =153;
	int j =0;
	int cube = i;
	int k;

	while(i>0)
	{
		k=i%10;
		j=j+k*k*k;
		
		i=i/10;
		
	}
	if(cube==j)
	{
		System.out.print("Amstrong");
		
	}
	else
	{
		System.out.println("Not Amstrong");
	}
  }

}