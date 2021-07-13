package src.org.deeksha.OOPS.Arrays;

import java.util.Arrays;

public class Crosschecking {
	public static void main(String[] args) {
		int a[] = {10,0,20,0,30,0,40,0,0};
		Arrays.sort(a);
		int b[]= new int[a.length];
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("..........");
		
		for(int j=0;j<a.length;j++)
		{
			if(a[j]!=0)
			{
				a[count++]=a[j];
			}
		
		}
		while(count<a.length)
		{
			a[count++]=0;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	

}
