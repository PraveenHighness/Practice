package src.org.deeksha.RegularExpressions;
import java.util.regex.*;

public class Reg
{
	public static void main(String[] args)
	{
		Pattern p = Pattern.compile("[7-9][0-9]{9}");
		
		Matcher m;
		
		Matcher m1 = p.matcher("9");
		
		if( m1.find() && m1.group().contains(args[0]))
				{
					System.out.println("highness");
				}
		else 
		{
			System.out.println("PJS");
		}
		
	}
}
