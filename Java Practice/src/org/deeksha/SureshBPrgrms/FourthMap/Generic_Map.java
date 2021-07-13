package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.util.*;

import javax.swing.RowFilter.Entry;

public class Generic_Map 
{
	public static void main(String[] args) 
	{
		Map<Integer,String>  m = new LinkedHashMap<>();
		
		m.put(4, " PJS");
		m.put(6, " Highness");
		
		System.out.println(m);
		System.out.println(" ");
		
		Set<java.util.Map.Entry<Integer, String>> s = m.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
