  package src.org.deeksha.SureshBPrgrms;

import java.util.*;

public class HashSet_ArrayList
{
	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Jai");
		hs.add("Kl");
		hs.add("Hs");
		
		ArrayList<String> al = new ArrayList<String>(hs);  // HashSet - ArrayList with HAshset ref 
		
		System.out.println(al);
		
		System.out.println(" ");
		
		
		HashSet<String> hs1 = new HashSet<>(al);     // ArrayList - HashSet -- 
		
		for(String data : hs1)
		{
			System.out.println(data);
		}
		
		System.out.println(" ");
		System.out.println(hs.contains("Jai"));  // in HashSet With Contain method is use to particular element is available or not
		 
		
	}
}
