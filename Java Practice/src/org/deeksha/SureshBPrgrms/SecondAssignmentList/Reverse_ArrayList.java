package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_ArrayList 
{
	public static void main(String[] args) 
	{

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(6);
		al.add(9);
		al.add(4);
		al.add(1);
		
		System.out.println(al);
		System.out.println(" ");
		
		Collections.reverse(al);
		System.out.println("After Revese");
		
		System.out.println(al);
		System.out.println(" ");
		
		
		for(Integer i : al)
		{
			System.out.println(i);
		}
	}
}
