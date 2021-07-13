package src.org.deeksha.SureshBPrgrms.ThirdSet;

import java.util.HashSet;
import java.util.Set;

public class GetParticularEElement 
{
	public static void main(String[] args) 
	{
		Set<String> s = new HashSet<>();
    	
    	s.add("6");
		s.add("9");
		s.add("4");
		s.add("1");
		s.add("0");
		System.out.println(s);
		
		String[] str = s.toArray(new String[s.size()]); 
		
		System.out.println(str[3]);
		
		
	}
}
