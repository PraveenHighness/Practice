package src.org.deeksha.SureshBPrgrms;

import java.util.*;

public class HashsetIterate 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Hashset - insertion order is not preserved");
		Set<String> s = new HashSet<>();    // HashSet - insertion order not preserved
		
		s.add("Vj");
		s.add("Suresh");
		s.add("TechStudents");
		
		Iterator<String> itr = s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(" ");
		
		System.out.println("LinkedHashset - insertion order is preserved");
		
		Set<String> s1 = new LinkedHashSet<>();   // LinkedHasset - insertion order not preserved
		
		s1.add("Vj");
		s1.add("Suresh");
		s1.add("TechStudents");
		
		Iterator<String> itr1 = s1.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		
		
	}
}
