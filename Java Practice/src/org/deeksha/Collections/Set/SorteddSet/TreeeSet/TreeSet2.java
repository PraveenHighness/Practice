package src.org.deeksha.Collections.Set.SorteddSet.TreeeSet;
import java.util.*;

public class TreeSet2 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Highness");
		ts.add("soul");
		ts.add("Princess");
		ts.add("PJS");
		ts.clone();
		
		System.out.println(ts);
		
		System.out.println(ts.headSet("PJS"));
		
		System.out.println(ts.tailSet("Highness"));
		
		System.out.println(ts.subSet("Highness", "PJS"));
		
		System.out.println(ts.first());
		
		System.out.println(ts.tailSet("PJS"));
	}
}
