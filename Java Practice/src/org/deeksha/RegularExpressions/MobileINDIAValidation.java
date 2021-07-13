package src.org.deeksha.RegularExpressions;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import src.org.deeksha.FIleHandling.Print_Writer;

public class MobileINDIAValidation 
{
	public static void main(String[] args) throws IOException
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Valid Mobile Number");
		
		Pattern p = Pattern.compile("(|0|91)?[6-9][0-9]{9}");
		
		String PNo =s.next();
	
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
