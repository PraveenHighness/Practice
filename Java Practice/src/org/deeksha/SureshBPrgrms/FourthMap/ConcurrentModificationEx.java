package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.security.KeyStore.Entry;
import java.util.*;

public class ConcurrentModificationEx 
{
	public static void main(String[] args) 
	{
		Map m = new LinkedHashMap();
		
		m.put(6 , " Highness");
		m.put(4 , " PJS");
		
		Set<Entry<Integer,String>> s = m.entrySet();
		Iterator<Entry<Integer,String>> i = s.iterator();
		while(i.hasNext())
		{
			Entry e = s.iterator();
			int key = e.getkey();
			if(key == 2)
			{
				i.remove();
				System.out.println("2nd safly removed using iterator");
			}
			else
			{
				System.out.println(e.getkey()+" "+e.getvalue());
			}
		}
	}
}
