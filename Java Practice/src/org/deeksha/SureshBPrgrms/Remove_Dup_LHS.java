package src.org.deeksha.SureshBPrgrms;

import java.util.*;

public class Remove_Dup_LHS  // remove duplicates in Arratlist With LinkeshaSet
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arraylist = new ArrayList<Integer>(Arrays.asList(6,9,6,9,4,1,1,4,98,94,94,98));
		System.out.println(arraylist);
		
		LinkedHashSet<Integer> hashset = new LinkedHashSet<>(arraylist);
		
		ArrayList<Integer> arraylist1 = new ArrayList<>(hashset);
		
		System.out.println(arraylist1);
		
		
		
	}
}
