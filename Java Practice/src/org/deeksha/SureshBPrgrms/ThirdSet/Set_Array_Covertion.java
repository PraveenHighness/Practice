package src.org.deeksha.SureshBPrgrms.ThirdSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_Array_Covertion 
{
	public static void main(String[] args) 
	{
		Set<Integer> s = new HashSet<>();
    	s.add(6);
		s.add(9);
		s.add(4);
		s.add(1);
		
		Integer[] i = new Integer[s.size()];
		s.toArray(i);
		
		System.out.println(Arrays.deepToString(i));
		
	}
}
