package src.org.deeksha.SureshBPrgrms;

import java.util.ArrayList;
import java.util.Vector;

public class Vector_ArrayList 
{
		public static void main(String[] args) 
		{
			Vector<Integer> v = new Vector<>();
				v.add(6);
				v.add(9);
				v.add(4);
				v.add(1);
				
			ArrayList<Integer> al = new ArrayList<>(v);
			 for(Integer s:al)
			 {
				 System.out.println(s);
			 }
	}
}
