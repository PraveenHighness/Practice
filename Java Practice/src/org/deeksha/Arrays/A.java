package src.org.deeksha.Arrays;

import java.util.Arrays;

public class A {
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
			for(count=0;count<a.length;count++)
			{
			
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
		

	}


