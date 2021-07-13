package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;

import java.util.ArrayList;

public class Remove_ParticularElement 
{
	public static void main(String[] args) 
	{
		ArrayList<String> l = new ArrayList<>();
		
		l.add("PJS");
		l.add("Highness");
		l.add("PS");
		l.add("VJTech");
		System.out.println(l);
		
		System.out.println(" ");
		l.remove("VJTech");
		
		System.out.println(l);
		
		for( String s : l);
		
		{
			System.out.println();
		}
		
		
	}
}
