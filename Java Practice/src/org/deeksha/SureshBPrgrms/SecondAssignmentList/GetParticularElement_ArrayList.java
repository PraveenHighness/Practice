package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;

import java.util.ArrayList;
import java.util.List;

public class GetParticularElement_ArrayList 
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
		
		System.out.println(l.get(2));
	}
}
