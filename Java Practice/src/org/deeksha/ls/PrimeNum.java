package com.ls;

public class PrimeNum {
	public static void main(String[] args) {
		
	
	int i=1;
	int n =11;
	int fact =0;
			
			while (i<=n)
			{
				if(n%i==0)
				{
				fact++;
				}
				i++;
			}
			if(fact==2)
			{
				System.out.println("Prime");
			}
			else
			System.out.println("Not a Prime No.");
			
}
}
