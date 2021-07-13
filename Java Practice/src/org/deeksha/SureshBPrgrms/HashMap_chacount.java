package src.org.deeksha.SureshBPrgrms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap_chacount
{
	public static void main(String[] args) 
	{
		String s = "Praveen";
		char[] ch = s.toCharArray();
		
		Map<Character,Integer> hm = new HashMap<>(); // insertion order not preserved
		
	   //HashMap<Character,Integer> hm = new LinkedHashMap<>(); // Insertion Order Preserved
		
		/*for(int i=0; i<s.length(); i++)
		{
			ch =s.charAt(i);
			if(hm.containsKey(ch))
			{
				dup = hm.get(ch);
				dup++;
				hm.replace(ch, dup);
			}
			else 
			{
				hm.put(ch, 1);
			}
		}
		for(Character key : hm.keySet())
		{
			System.out.println(key+ "="+ hm.get(key));
		}
		*/
		
		for(char c :ch)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else 
			{
				hm.put(c, 1);
			}
		}
		for(Map.Entry m :hm.entrySet())
		{
			System.out.println(m.getKey()+" = "+ m.getValue());
		}
				
	}
}
