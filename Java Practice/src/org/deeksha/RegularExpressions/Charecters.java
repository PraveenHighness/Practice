package src.org.deeksha.RegularExpressions;
import java.util.regex.*;
public class Charecters 
{
	public static void main(String[] args) 
	{
		System.out.println(Pattern.matches("[Greek]", "Porchk"));//false bcz---any one charectr "Greek",Porchk - not maching all
		
		System.out.println(Pattern.matches("[Greek]", "G"));// true bcz -- checks one char 'G', is in "Greek"
		
		System.out.println(Pattern.matches("[^abc]", "L")); // // true bcz == it checks "Exceptional characters" , L is not in that abc thats why its true
		 
		System.out.println(Pattern.matches("[a-zA-Z]", "H")); // true -- chck char a-z &A-Z only char cheking not words
		
		System.out.println(Pattern.matches("[a-j[y-z]]", "x")); //false bcz -- it checks only b/w a-j & y-z ..a.x is not in range 

		System.out.println(Pattern.matches("[a-z && [highness]]", "h")); // true - it checks a-z and also highness
		
		System.out.println(Pattern.matches("[a-z] && [^kw]","b")); //______________

		System.out.println(Pattern.matches("[a-z && [^t-z]]", "h")); // true -- checks a-z and except t-z
		



	}
}
