package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.util.*;

public class Append_At_End 
{
	private static Map<String,Integer> ps = new HashMap<String,Integer>();
	
	private static Comparator<String> c = new Comparator<String>()
			{
				public int compare(String s1,String s2)
				{
					Integer i1 = ps.get(s1);
					Integer i2 = ps.get(s2);
					
					if (i1 == 0) return 1;
					if (i2 == 0) return -1;
					
					return i1.compareTo(i2);
				}
			};
			
			public static void main(String[] args) throws java.lang.Exception
			{
				ps.put(" -ve", -1);
				ps.put(" Neutral", 0);
				ps.put(" plus", 1);
				ps.put(" Long Value", Integer.MAX_VALUE);
				ps.put(" Nothing", 0);
				
				Map<String,Integer> map = new TreeMap<String,Integer>(c);
				map.putAll(ps);
				
				for(Map.Entry<String, Integer> e : map.entrySet())
				{
					System.out.printf(e.getKey(),e.getValue());
				}
				
				
			}
}
