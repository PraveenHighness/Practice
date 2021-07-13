package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;

import java.util.ArrayList;

public class EmptyOrNot_ArrayList 
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("PJS");
		al.add("Highness");
		al.add("PS");
	
		System.out.println(al.isEmpty());
		System.out.println(" ");
		
		if(al.isEmpty())
		{
		System.out.println(al.isEmpty());
		}
		else
		{
			System.out.println(al);
		}
		
		
	}
}
