package src.org.deeksha.SureshBPrgrms.ThirdSet;
import java.util.*;

public class NoOf_elements_hashSet 
{
	public static void main(String[] args) 
	{
		Set<Integer> l = new HashSet<Integer>();
		l.add(6);
		l.add(9);
		l.add(98);
		l.add(4);
		l.add(1);
		l.add(94);
		
		System.out.println(l.size());
		System.out.println(" ");
		for( Integer i : l)
		{
			System.out.println(i);
		}
	}
}
