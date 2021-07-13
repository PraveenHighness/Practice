package src.org.deeksha.Collections.Set.HashSet;
import java.util.*;

public class Hashset1 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet();
		
		hs.add("Highness");
		hs.add("PJS");
		hs.add("HighQueen");
		hs.add("Soul");
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		//all collection methods are allowed
	}
}
