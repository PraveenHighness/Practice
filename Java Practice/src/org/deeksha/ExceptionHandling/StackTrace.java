package src.org.deeksha.ExceptionHandling;

public class StackTrace 
{
public static void main(String[] args) 
{
	doStuff();
}
public static void doStuff()
{
	doMoreStuff();
	
}
public static void doMoreStuff()
{
	System.out.println("Highness");
}
}
