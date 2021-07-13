package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;

import java.util.*;

public class List_LinkedList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
			al.add(6);
			al.add(4);
			
		LinkedList<Integer> ll = new LinkedList<>(al);
		
		//System.out.println(ll);
		
		for(Integer i : ll)
		{
			System.out.println(i);
		}
	}
}
