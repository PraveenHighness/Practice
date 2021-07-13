package Exception2;

public class BasicWithFinally 
{
	public static void main(String[] args) 
	{
		
		try 
		{
			System.out.println(36/0);
		}
		catch (ArithmeticException Basic)
		{
			System.out.println(36/6);
		}
		
		finally 
		{
			System.out.println("Highness");
		}
		
		
	}

}
