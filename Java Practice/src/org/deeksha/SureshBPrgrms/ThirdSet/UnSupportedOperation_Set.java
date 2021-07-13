package src.org.deeksha.SureshBPrgrms.ThirdSet;
import java.util.*;

public class UnSupportedOperation_Set 
{
	public static void main(String[] args) 
	{
		Set ts = new HashSet();             //treeSet is not accepting Heterogeneous 
		//ts.add(6);
		//ts.add(4);
		ts.add("PJS");
		ts.add("PS");
		
		Collection<String> c = Collections.unmodifiableSet(ts);
		for(String s : c)
		{
			System.out.println(s);
			c.add("SP");
		}
	}
}
