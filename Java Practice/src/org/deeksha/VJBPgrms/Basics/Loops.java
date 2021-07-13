package src.org.deeksha.VJBPgrms.Basics;

public class Loops
{
	public static void main(String[] args)
	{
		//for
		
		for(int i =1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		//infinate for
		for(int i=1; i>=1; i++)
		{
			System.out.println(i);  
		}
		
		////loop iterate with array
		
		int arr[] = {1,2,3,4,5};
		
		for(int i=0; i<arr.length; i++)
		{
		System.out.println(arr[i]);
		}
		
		//Advanced ForLoop
		for(int n :arr)
		{
			System.out.println(n);
		}
		
		
	}
}
