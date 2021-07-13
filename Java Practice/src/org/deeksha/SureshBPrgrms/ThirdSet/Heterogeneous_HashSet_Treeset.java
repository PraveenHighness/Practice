package src.org.deeksha.SureshBPrgrms.ThirdSet;
import java.util.*;

public class Heterogeneous_HashSet_Treeset 
{
	public static void main(String[] args) 
	{
		TreeSet l = new TreeSet();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("a");
		l.add("P");
		l.add("PS");
		
		//l.add(new Integer(6));   //In TreeSet  Heterogeneous NOt Allowed
		//l.add(null);
		
		System.out.println(l);
		System.out.println(" ");
		
		HashSet l1 = new HashSet();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("a");
		l1.add("P");
		l1.add("PS");
		
		l1.add(new Integer(6));    // In HashSet Heterogeneous Allowed
		System.out.println(l1);
		
		for( Object s : l1)
		{
			System.out.println(s);
		}
	}
}
