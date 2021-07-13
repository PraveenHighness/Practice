package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;

import java.util.*;

public class Duplicates_remove_ArrayList 
{
	public static void main(String[] args) 
	{

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(6);
		al.add(9);
		al.add(4);
		al.add(1);
		al.add(4);
		
	
		Set<Integer> s = new LinkedHashSet<>(al);
		
		System.out.println(s);
		System.out.println(" ");
		
		for(Integer dup:s)
		{
			System.out.println(dup);
		}
		
		
	}

	
}
