package src.org.deeksha.Collections.Set.LinkedHashhSet;
import java.util.*;

public class LkndHS 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> l = new LinkedHashSet();
		
		l.add("Highness");
		l.add("Princess");
		l.add("PJS");
		
		Iterator<String> i = l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		//In this also all collection methods are allowed
	}
}
