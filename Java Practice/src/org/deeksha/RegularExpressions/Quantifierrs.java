package src.org.deeksha.RegularExpressions;
import java.util.regex.*;

public class Quantifierrs 
{
	public static void main(String[] args) 
	{
		System.out.println(Pattern.matches("L?", "L"));  // true -- ? means occurens once only 
		
		System.out.println(Pattern.matches("L+", "LLLL")); // true -- + means occurence many times 
		
		System.out.println(Pattern.matches("S*", "")); // true -- * means occurence zero or more times but white space is not allowed (Error)
		
		System.out.println(Pattern.matches("A{2}", "AAA")); // fasle -- A{2} means A possible occcurence only 2 time. moerthan thatt count error
		
		System.out.println(Pattern.matches("H{2,}", "HHHHHH")); // true -- H{2,} occurence of H is atleast 2 times and more than that count
		
		System.out.println(Pattern.matches("H{3,5}", "HHHHH")); // here H occurence is b/w 3-5 times more thanthat error occcurs
		
		
	}
}