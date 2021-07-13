package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;
import java.util.*;

public class ArrayList_Array_Convert 
{
	public static void main(String[] args) 
	{
		List<Integer> l = new ArrayList<Integer>();
		l.add(6);
		l.add(9);
		l.add(98);
		l.add(4);
		l.add(1);
		l.add(94);
	
		System.out.println(l);
	
		Integer[] in = l.toArray(new Integer[0]);
		for(Integer i : in)
		{
			System.out.println(i);
		}
		
		//String 
		
		System.out.println(" ");
		
		List<String> l2 = new ArrayList<>();
		l2.add("PJS");
		l2.add("Highness");
		
		String[] s = l2.toArray(new String[0]);
		for ( String ii : s)
		{
			System.out.println(ii);
		}
		
		
	}
}
