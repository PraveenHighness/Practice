package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.util.*;

public class Listiterator_Map 
{
	public static void main(String[] args) 
	{
		Map<Integer,String>  m = new LinkedHashMap<>();
		
		m.put(4, " PJS");
		m.put(6, " Highness");
		
		Set<Map.Entry<Integer, String>> s = m.entrySet();
		for( Map.Entry<Integer, String> s1 : s)
		{
			System.out.println(s1);
		}
		System.out.println("After Set to Lis");
		List l = new LinkedList(s);
		ListIterator l1 = l.listIterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}	
	}
}
