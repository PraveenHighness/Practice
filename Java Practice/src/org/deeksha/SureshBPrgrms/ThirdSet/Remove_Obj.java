package src.org.deeksha.SureshBPrgrms.ThirdSet;

import java.util.HashSet;
import java.util.Set;

public class Remove_Obj 
{
	public static void main(String[] args) 
	{
		
	Set<Integer> s = new HashSet<>();
	s.add(6);
	s.add(4);
	s.add(0);
	
	System.out.println(s.remove(0));
	System.out.println(s);
	}
}
