package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;

import java.util.ArrayList;
import java.util.List;

public class Coomon_elements_in_2ArrayLists 
{
	public static void main(String[] args) 
	{
	  List<Integer> l = new ArrayList<Integer>();
		l.add(6);
		l.add(9);
		l.add(98);
		l.add(4);
		l.add(1);
		l.add(94);
		System.out.println(l);
		
	  List<Integer> l2 = new ArrayList<Integer>();
		l2.add(6);
		l2.add(4);
		l2.add(0);
		
		System.out.println(l2);
		System.out.println(" ");
		
		//common elements 
		System.out.println("Common elements");
		l.retainAll(l2);
		System.out.println(l);
		
		
	}
}
