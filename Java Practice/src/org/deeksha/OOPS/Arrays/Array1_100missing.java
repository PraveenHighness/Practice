package src.org.deeksha.OOPS.Arrays;

public class Array1_100missing {
	public static void main(String[] args) {
		int a[] = {1,23,43,40,33};
		
		for(int i=0;i<=100;i++)
		{
			int incr=0;
			for(int j=0;j<a.length;j++)
			{
				if(i==a[j])
				{
					incr=1;
					break;
				}
			}
			if(incr==0)
			{
				System.out.println(i);
			}
			if(incr==1)
			{
				System.out.println(" ");
			}
		}
	}

}
