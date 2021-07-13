package src.org.deeksha.ExceptionHandling;

public class StackTrace_Exception 
{
	public static void main(String args[])
	{
		doStuff();
	}
	public static void doStuff()
	{
		doMoreStuff();
	}
	public static void doMoreStuff()
	{
		try
		{
			System.out.println(36/0);
		}
		catch (ArithmeticException doMoreStuff )
		{
			System.out.println(36/6);
		}
		}
	
}
