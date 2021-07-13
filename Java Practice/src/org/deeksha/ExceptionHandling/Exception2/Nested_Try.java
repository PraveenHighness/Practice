package src.org.deeksha.ExceptionHandling.Exception2;

public class Nested_Try 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println(36/6);
			try
			{
				System.out.println(6/0);
				System.out.println("Loop 1");
			}
			catch(ArithmeticException e2)
			{
				System.out.println(6/1);
			}
			
		}
		catch (ArithmeticException e)
		{
			System.out.println(36/1);
		}
	}
}
