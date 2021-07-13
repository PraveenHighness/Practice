package src.org.deeksha.SureshBPrgrms;

import java.util.*;

public class UniqueChar_Hashmap	
{
	public static void main(String[] args) 
	{
		String s = "PraveenpP";
		char[] ch = s.toCharArray();
	
		Map<Character,Integer> m = new LinkedHashMap<>();
		for(char c :ch)
		{
			if(m.containsKey(ch))
			{
				m.put(c, m.get(c));
			}
			else
			{
				m.put(c, 1);
			}
		}
		for(Map.Entry<Character,Integer> mm : m.entrySet())
		{
			if(mm.getValue()==1)
			{
				System.out.println(mm.getKey()+"="+mm.getValue());
			}
		}
		
/*		for(int i =0; i<s.length(); i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				if(m.containsKey(s.charAt(i)))
				{
					
					m.put(s.charAt(i), m.get(s.charAt(i))+1);
				}
				else 
				{
					m.put(s.charAt(i), 1);
				}
			}
			else 
			{
				System.out.println("Invalid" );
				return;
			}
		}
		int flag = 0;
		ArrayList<Character> arr = new ArrayList<Character>();
		for(Map.Entry e : m.entrySet())
		{
			if( (int) e.getValue()==1)
			{
				arr.add((char)e.getKey());
				flag=flag+1;
			}
		}
		
		if(flag>0)
		{
			System.out.println("Uniq char :");
			for(int j=0; j<arr.size(); j++)
			{
				System.out.println(arr.get(j));
			}
		}
		else if(flag==0)
		{
			System.out.println("In this is there is No Unique char");
		}*/
	}
}
