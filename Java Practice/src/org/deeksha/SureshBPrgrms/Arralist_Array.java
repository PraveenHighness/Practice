package src.org.deeksha.SureshBPrgrms;

import java.util.ArrayList;


public class Arralist_Array 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arraylist = new ArrayList<>();
		
		arraylist.add("Vj");
		arraylist.add("Suresh");
		arraylist.add("Anji");
		
		Object[] arrayobj = arraylist.toArray();
		
		for(Object object : arrayobj )    // Printing obj 
		{
			
			System.out.println(object);
		}
	}
}
