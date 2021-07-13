package src.org.deeksha.SureshBPrgrms.ThirdSet;
import java.util.*;

public class CopyOne2another_HAshSet 
{
	public static void main(String[] args) 
	{
		Set<Integer> s = new HashSet<>();
		s.add(6);
		s.add(9);
		s.add(4);
		s.add(1);
		
		Set<Integer> i = new HashSet<>(s);
		i.add(0);
		
		System.out.println(i);
		
		
	}
}
