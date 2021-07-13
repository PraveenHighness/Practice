package src.org.deeksha.SureshBPrgrms;

import java.util.*;

public class HashSet_FailFast     // HashSet is FailFast while itrt return by concuurent collection clses
{
	public static void main(String[] args) 
	{
		Set<String> s = new HashSet<>();
		
		s.add("One");
		s.add("Two");
		s.add("Three");
		s.add("Four");
		
		Iterator<String> itr = s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}                                               // after add,remove if you dont want t
		
		s.add("Five");
		s.remove("Two");
		
		
		
	}
}
