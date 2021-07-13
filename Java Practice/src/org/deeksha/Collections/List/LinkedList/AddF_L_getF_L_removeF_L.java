package src.org.deeksha.Collections.List.LinkedList;
import java.util.*;

public class AddF_L_getF_L_removeF_L 
{
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		
		 ll.add("Highness"); // add
		 ll.add(24); // add int
		 ll.add(null); // add value
		 ll.add("Highness");// same data
		 ll.set(0, "Queen");// add in particular index or replace 
		 ll.add(0, "Princess"); //add in particular index or replace 
		 ll.add("m"); //
		 ll.removeLast();//remove last upte to this keyword above
		 ll.addFirst("HighQueen"); // add elemnet in the First
		 ll.addLast("PJS"); // add element in the first 
		 ll.getFirst(); // get first  element data
		 ll.getLast(); // get last element data 
		 ll.get(0); // get particular index data
		 
		 System.out.println(ll);
		
		 
		 
		 
		 
	}
}
