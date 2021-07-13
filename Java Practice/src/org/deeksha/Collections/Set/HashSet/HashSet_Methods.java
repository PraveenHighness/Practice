package src.org.deeksha.Collections.Set.HashSet;
import java.util.*;

public class HashSet_Methods
{
	public static void main(String[] args) 
	{
		HashSet<String>  hs = new HashSet<String>();
		
		hs.add("Highness");
		hs.add("PJS");
		hs.add("Queen");
		hs.add("Princess");
		hs.add("HighQueen");
		hs.add("GodDess");
		hs.add("Baby");
		hs.add("Cuty");
		hs.add("Smily");
		hs.add("0406");
		
		System.out.println(hs.add("Baby")); // duplicartes are not allowed
		// and add() always return booleans - so in this case False
		System.out.println(hs);
		
	}
}
