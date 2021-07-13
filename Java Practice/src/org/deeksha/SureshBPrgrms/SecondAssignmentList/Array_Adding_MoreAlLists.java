package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;

import java.util.*;

public class Array_Adding_MoreAlLists 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		
		@SuppressWarnings("rawtypes")
		List<Integer> l = new ArrayList();
		
		l.add(6);
		l.add(9);
		
		List<Integer> l1 = new ArrayList<>();
		l1.addAll(l);
		l1.add(4);
		l1.add(1);
		
		@SuppressWarnings("rawtypes")
		List l2 = new ArrayList<>();
		l2.addAll(l1);
		l2.add("PJS");
		
		List l3 = new ArrayList<>(l2);
			
			for(Object i : l3)
			{
				System.out.println(i);
			}
	}
}
