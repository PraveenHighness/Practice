package src.org.deeksha.ExceptionHandling;


public class Try_Multiple_Catch
{
	public static void main(String[] args) 
  {
		
	try 
	{
		System.out.println(36/0);
	}
	catch(ArithmeticException e)
	{
		System.out.println(36/6 + " " + "Highness");
	}
	catch(ArrayIndexOutOfBoundsException e1)
	{
		System.out.println("i");
	}
	catch(Exception e2)
	{
		System.out.println("n");
	}
   }
}
