package src.org.deeksha.SureshBPrgrms.ThirdSet;
import java.util.*;

public class Remove_all 
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
		
		l.removeAll(l);
		
		System.out.println(l);
		
		
		Set<Integer> l1 = new TreeSet<Integer>();
		l1.add(6);
		l1.add(9);
		l1.add(98);
		l1.add(4);
		l1.add(1);
		l1.add(94);
		
		l1.removeAll(l1);
		
		System.out.println(l1);
		
		
	}
}
