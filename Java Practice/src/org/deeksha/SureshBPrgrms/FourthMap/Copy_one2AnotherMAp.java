package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.util.*;

public class Copy_one2AnotherMAp 
{
	public static void main(String[] args) 
	{
		Map m = new HashMap();
		
		m.put(6 , " Highness");
		m.put(4 , " PJS");
		
		Map m1 = new HashMap(m);
		
		System.out.println(m1);
	}
}
