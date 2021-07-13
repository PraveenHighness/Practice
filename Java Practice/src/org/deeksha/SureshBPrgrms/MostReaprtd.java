package src.org.deeksha.SureshBPrgrms;

import java.util.*;
import java.util.Map.Entry;

public class MostReaprtd 
{
	public static void main(String[] args) 
	{
		String s = "TikTik";
		char[] ch = s.toCharArray();
		
		
		Map<Character,Integer> m = new LinkedHashMap<>();
		
		
		for(char c:ch)
		{
			if(m.containsKey(c))
			{
				m.put(c,m.get(c)+1);
			}
			else
			{
				m.put(c, 1);
			}
		}
			Character key =' ';
			Integer value =0;
			
			for( Map.Entry<Character,Integer> mm : m.entrySet())
			{
				if(mm.getValue()>value)
				{
					key=mm.getKey();
					value=mm.getValue();
				}
			}
			System.out.println(key+ " = "+value);
		
	}
}
