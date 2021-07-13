package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;

import java.awt.List;
import java.util.ArrayList;

public class Insert_PArticulaIndex_ArrayList
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("PJ");
		al.add("Highness");
		al.add("PJS");
		
		al.add(2, "Added");
		
		for( String l : al)
		{
			System.out.println(l);
		}
	}

}
