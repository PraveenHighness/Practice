package src.org.deeksha.SureshBPrgrms.ThirdSet;

import java.util.*;

public class Common_NonCommon 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> h = new HashSet<>();
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(6);
		
		HashSet<Integer> h1 = new HashSet<>();
		
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(5);
		
		h.retainAll(h1);
		System.out.println(h1);
		
	}
}
