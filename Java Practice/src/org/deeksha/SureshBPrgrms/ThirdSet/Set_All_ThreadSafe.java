package src.org.deeksha.SureshBPrgrms.ThirdSet;
import java.util.*;

public class Set_All_ThreadSafe 
{
	public static void main(String[] args) 
	{
		Set hs = new HashSet();
		hs.add(6);
		hs.add(4);
		hs.add("PJS");
		
		Collections.synchronizedSet(hs);   // Thread Safe using 'Collections.synchronizedSet();'  HashSet
		System.out.println(hs);
		System.out.println(" ");
		
		Set lhs = new LinkedHashSet();
		lhs.add(6);
		lhs.add(6);
		lhs.add("PJS");
		
		Collections.synchronizedSet(lhs);  // Thread Safe using 'Collections.synchronizedSet();'  LinkeedHashSet
		System.out.println(lhs);
		System.out.println(" ");
		
		Set ts = new TreeSet();  //treeSet is not accepting Heterogeneous 
		//ts.add(6);
		//ts.add(4);
		ts.add("PJS");
		ts.add("PS");
		
		Collections.synchronizedSet(ts);    // Thread Safe using 'Collections.synchronizedSet();'  TreeSet
		System.out.println(ts);
		
		
		
	}
}
