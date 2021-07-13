package src.org.deeksha.SureshBPrgrms.ThirdSet;
import java.util.*;

public class ConcurrentModificationException_Set_All {
	public static void main(String[] args)
	{
		Set hs = new HashSet();
		hs.add(6);
		hs.add(4);
		hs.add("PJS");
		
		Collections.synchronizedSet(hs);   
		hs.add(0);
		hs.add("PS");
		
		System.out.println(hs);
		System.out.println(" ");
		
		Set lhs = new LinkedHashSet();
		lhs.add(6);
		lhs.add(4);
		lhs.add("PJS");
		
		Collections.synchronizedSet(lhs); 
		lhs.add(4);
		System.out.println(lhs);
		System.out.println(" ");
		
		Set ts = new TreeSet();  //treeSet is not accepting Heterogeneous 
		//ts.add(6);
		//ts.add(4);
		ts.add("PJS");
		ts.add("PS");
		
		Collections.synchronizedSet(ts);
		ts.add(94);                      // ConcurrrentModificationException
		System.out.println(ts);     
	}
}
