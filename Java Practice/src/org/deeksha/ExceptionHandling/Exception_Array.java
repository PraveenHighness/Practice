package src.org.deeksha.ExceptionHandling;

public class Exception_Array 
{
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		for(int j=0; j<6; j++)
		{
			try
			{
				System.out.println(a[j]);
			}
			catch(ArrayIndexOutOfBoundsException Exception_Array)
			{
				System.out.println();
				System.out.println(j);
			}
			//In this particular ArrayIndexOutOfBoundsException there is only possiblitity to print index range 
			// there is know chance to print elements because 
			//here for loop iteration going to 6 six iterations so there is no possibilites to ptint elements.
		}
		
		
	}
}
