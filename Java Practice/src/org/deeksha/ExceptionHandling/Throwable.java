package src.org.deeksha.ExceptionHandling;

public class Throwable extends RuntimeException
{
	public static void main(String[] args) 
	{
		throw new Throwable(); //Runtime Error
	}
}
//" throws " use in IO Exceptions() --checkFIleHandling
//  Throws only for checked exceptions   
// replacement of thowws we can use __ Try-Catch 