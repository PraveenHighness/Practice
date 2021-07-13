package src.org.deeksha.SureshBPrgrms;

import java.util.*;

public class Treeset_Hashset 
{
	public static void main(String[] args) 
	{
		Set<Integer> s = new LinkedHashSet<Integer>();  // insertion Order Preserved 
		
		s.add(06);
		s.add(9);
		s.add(04);
		s.add(01);
		
		Iterator itr = s.iterator();
	
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		/////////////////////////////////////////
		
		System.out.println(" ");
		
		
		TreeSet<Integer> ts = new TreeSet<>(s);  // oeder preserverd in Asscending Order 
		
		Iterator itr2 = ts.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		
		Set<Integer> slhs = new LinkedHashSet<>();  // LinkedHAshSet Add,iterate ,
		
		slhs.add(1);
		slhs.add(2);
		
		Iterator itr3 = slhs.iterator();
		
		while(itr3.hasNext())
		{
			System.out.println(itr3.next());
		}
		
	}
}
