package src.org.deeksha.Collections.Set.SorteddSet;
import java.util.*;

public class SorteddSett 
{
	public static void main(String[] args) 
	{
		SortedSet s = new TreeSet();
		
		s.add("Highness");
		s.add("PJS");
		s.add("Queen");
		s.add("Princess");
		
		System.out.println(" ");
		
		for(Object o  : s)
		{
			System.out.println(o);
		}
		
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet("Princess"));
		System.out.println(s.tailSet("Highness"));
		
	}
}
