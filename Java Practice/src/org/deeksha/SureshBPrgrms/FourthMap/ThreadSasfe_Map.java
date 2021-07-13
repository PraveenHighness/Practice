package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.security.KeyStore.Entry;
import java.util.*;

public class ThreadSasfe_Map 
{
	public static void main(String[] args) 
	{
		Map m = new HashMap();
		
		m.put(6 , " Highness");
		m.put(4 , " PJS");
		
		System.out.println(m);
		
		Map m1 = Collections.synchronizedMap(m);
		Set<Entry> s = m1.entrySet();
		synchronized(m1)
		{
			Iterator i = s.iterator();
			while(i.hasNext())
			{
				Map.Entry mapentry = (java.util.Map.Entry) i.next();
				System.out.println(mapentry.getKey());
				System.out.println(mapentry.getValue());
			}
			m1.put(0, "NO");
		}
		
	}
}
