package src.org.deeksha.SureshBPrgrms.ThirdSet;
import java.util.*;

public class Compare2HashSets 
{
	public static void main(String[] args) 
	{
		Set<Integer> s = new HashSet<>();
		s.add(6);
		s.add(9);
		s.add(4);
		s.add(1);
		s.add(0);
		
		Set<Integer> s1 = new HashSet<>();
		s1.add(6);
		s1.add(9);
		s1.add(4);
		s1.add(1);
		s1.add(0);
		
		System.out.println(s1.equals(s));  // return boolean
	}
}
