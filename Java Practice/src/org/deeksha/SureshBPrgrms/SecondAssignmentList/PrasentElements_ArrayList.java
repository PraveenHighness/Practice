package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;

import java.util.ArrayList;

public class PrasentElements_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("PJS");
		al.add("Highness");
		al.add("PS");
		al.add("One");
		
		System.out.println("ArrayList Total Elements is :"+"-"+ al.size());
		
		for(String s : al)
		{
			System.out.println(s);
		}
	}
}
