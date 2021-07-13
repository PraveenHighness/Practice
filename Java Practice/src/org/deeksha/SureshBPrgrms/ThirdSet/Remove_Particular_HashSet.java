package src.org.deeksha.SureshBPrgrms.ThirdSet;
import java.util.*;

public class Remove_Particular_HashSet 
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
		System.out.println(s);
	}
}
