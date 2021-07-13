package com.ls;

public class EvenSum {
public static void main(String[] args) {
	int i = 1;
	int evensum=0;
	
	while(i<=100)
	{

		if(i % 2 == 0); 
			{
				evensum=evensum+i;
			}
			i++;
		}
	System.out.println(evensum);
	  }
	}
