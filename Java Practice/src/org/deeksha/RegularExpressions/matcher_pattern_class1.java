package src.org.deeksha.RegularExpressions;
import java.util.regex.*;

public class matcher_pattern_class1 
{
	public static void main(String[] args) 
	{	
		Pattern p = Pattern.compile(".H");
		Matcher m = p.matcher("kH");
		boolean b = m.matches();
		//First way
		
		System.out.println(b);
		
		boolean b2 = Pattern.compile("..L").matcher("pjL").matches();
		//Second Way Of chesking
		
		System.out.println(b2);
		
		boolean b3 = Pattern.matches(".......S","HighnesS");
		//Third way & RealTime Using Way
		
		System.out.println(b3);
		
		System.out.println(b+ " "+ b2 +" "+ b3);
		//output for all ways
	}
}
