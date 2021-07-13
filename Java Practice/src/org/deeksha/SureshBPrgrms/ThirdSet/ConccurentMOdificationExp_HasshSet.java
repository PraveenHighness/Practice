package src.org.deeksha.SureshBPrgrms.ThirdSet;
import java.util.*;

public class ConccurentMOdificationExp_HasshSet 
{
	public static void main(String[] args) 
	{
		HashSet l1 = new HashSet();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("a");
		l1.add("P");
		l1.add("PS");
		System.out.println(l1);  
		
		for( Object s : l1)
		{
			System.out.println(s);
		}
	}
}
