package src.org.deeksha.SureshBPrgrms;

import java.awt.List;
import java.util.ArrayList;
import java.util.Vector;

public class ArrayList_Vector 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
			al.add(6);
			al.add(9);
			al.add(4);
			al.add(1);
			
		Vector<Integer> l = new Vector<>(al);
		 for(Integer s:l)
		 {
			 System.out.println(s);
		 }
		
	}
}
