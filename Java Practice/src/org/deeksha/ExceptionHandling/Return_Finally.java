package src.org.deeksha.ExceptionHandling;

public class Return_Finally 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Highness");
			return;
		}
		catch(ArithmeticException e)
		{
			 System.out.println("ak");
		}
		finally
		{
			System.out.println("PJS");
		}
	}
}
