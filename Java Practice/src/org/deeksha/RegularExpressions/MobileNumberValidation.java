package src.org.deeksha.RegularExpressions;
import java.io.EOFException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation
{
	public static void main(String[] args)  throws EOFException 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter A Valid Mobile Number");
		String PNo =s.next();
		String chk = "\\d{10}";
		
		
		Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher m = p.matcher(PNo);
		
		if(m.matches())
		{
			System.out.println(PNo + " is a valid Mobile Number");
			
		}
		else
		{
			System.out.println(PNo = " is Not a Valid Mobile Number");
		}
		
	}
}
