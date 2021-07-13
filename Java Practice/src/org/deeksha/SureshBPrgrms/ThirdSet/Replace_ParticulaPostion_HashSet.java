package src.org.deeksha.SureshBPrgrms.ThirdSet;

import java.util.HashSet;
import java.util.Set;

public class Replace_ParticulaPostion_HashSet 
{
	public static void main(String[] args) 
	{
		Set<Integer> s = new HashSet<>();
		s.add(6);
		s.add(9);
		s.add(4);
		s.add(1);
		s.add(0);
		
		System.out.println(s.remove(0));
		s.add(94);
		
		System.out.println(s);
		
		if (!s.add(0))
		{
			s.remove(0);
			s.add(0);
			
		}
		System.out.println(s);
	}
}
