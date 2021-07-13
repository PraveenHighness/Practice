package src.org.deeksha.OOPS.Arrays;

public class Reverse {
	public static void main(String[] args)
	{
		int a[] = {10,20,30,40};
		int sum =0;
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
			
			sum = sum+a[i];
		}
		System.out.println(sum);
		System.out.println(sum/2);
	}
}


