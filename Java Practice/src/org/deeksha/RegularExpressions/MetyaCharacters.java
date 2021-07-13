package src.org.deeksha.RegularExpressions;
import java.util.regex.*;

public class MetyaCharacters 
{
	public static void main(String[] args) 
	{
		System.out.println(Pattern.matches("\\d", "0")); //only digits
		System.out.println(Pattern.matches("\\d", "m"));
		
		System.out.println(Pattern.matches("\\D", "H"));  // non digits
		System.out.println(Pattern.matches("\\D", "9"));
		System.out.println(Pattern.matches("\\D", "ss")); // sinle char only
		System.out.println(Pattern.matches("\\D*", "Highness")); // accept all word include char 
		System.out.println(Pattern.matches("\\D*", "PJS$Highness")); //accept all word include char and special char also
		
		System.out.println(Pattern.matches("\\s", " ")); //onlt for white spaces not any other
		
		System.out.println(Pattern.matches("\\S*", "Laddu"));  //space not allowed
		System.out.println(Pattern.matches("\\S*", "Highness Pjs")); // space not allowed
		System.out.println(Pattern.matches("\\S*", "HighnessPjS")); //space not allowed b/w Higness&PjS
		
		System.out.println(Pattern.matches("\\w*", "HighnessPjs64")); // both alpha&numerics allowed but special char not allowed
		System.out.println(Pattern.matches("\\w*", "&eew?")); //speci char not allowed
		
		System.out.println(Pattern.matches("\\W*", "?+=&")); // only special char allowed 
		System.out.println(Pattern.matches("\\D*", "m0?*9")); // false specials char only allowd 
		
		System.out.println(Pattern.matches("\\b*", ""));  //______________________
		
		System.out.println(Pattern.matches("\\B*", ""));  //______________________
	}
}
