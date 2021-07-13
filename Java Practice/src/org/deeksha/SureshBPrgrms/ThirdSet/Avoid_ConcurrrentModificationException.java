package src.org.deeksha.SureshBPrgrms.ThirdSet;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
 
public class Avoid_ConcurrrentModificationException 
{
	public static void main(String[] args) 
	{
		Set ts = new TreeSet();             //treeSet is not accepting Heterogeneous 
		//ts.add(6);
		//ts.add(4);
		ts.add("PJS");
		ts.add("PS");
		
		Set s2 = new CopyOnWriteArraySet(ts); // to avoid ConcurrrentModificationException

		//Set s2 = Collections.SynchronizedSet(ts);
		
		Iterator i = s2.iterator();
		while(i.hasNext())
		{
			System.out.println(ts);
			s2.add("PS");
			break;
		}
	}
}
