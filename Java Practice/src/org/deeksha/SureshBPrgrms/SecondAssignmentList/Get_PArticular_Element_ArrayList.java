package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;

import java.util.ArrayList;

public class Get_PArticular_Element_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("PJS");
		al.add("Highness");
		al.add("PS");
		
		System.out.println(al.indexOf("Highness"));
	}
}
