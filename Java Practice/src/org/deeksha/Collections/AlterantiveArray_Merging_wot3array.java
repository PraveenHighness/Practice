package src.org.deeksha.Collections;
import java.util.*;

public class AlterantiveArray_Merging_wot3array 
{
	public static void main(String[] args) 
	{
		int a[] = {0,0,0,0,0};
		int b[] = {1,1,1,1,1};
		int c[]= {0};
		int k = 1;
		int m = 5;
		
		for(int i=0; i< b.length; i++)
		{
			for (int j=m;j>=k;j--)
			{
				a[j+i] = a[j];
			}
			a[k] = b[i];
			
			k = k+2;
			m = m++;
			
			for(int z = 0; z<12; z++)
			{
				System.out.println("/d\n"+ " " +a[i]);
			}
			
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
			System.out.println();
		}
		
	}
}
