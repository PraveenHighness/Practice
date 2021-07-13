package src.org.deeksha.SureshBPrgrms;

import java.util.*;

public class DupChar_HashMAp 
{
	public static void main(String[] args)
	{
		String s = "PraveenPSS";
		char[] ch = s.toCharArray();
		
		Map<Character,String> map = new HashMap<>();
	
		for(char c :ch)
		{
			if(map.containsKey(c))
			{
				String count = map.get(c);
			}
			char[] count = null;
			System.out.println(count);
			
		}
	}
}
