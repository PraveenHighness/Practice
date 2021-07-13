package src.org.deeksha.Collections.List.Vector;             //3 cursors are in collection 1 - Enumeration ,2 - iteration, 3- ListIterator
import java.util.*;

public class Vector_Methods
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
						// add & remove
		v.addElement("Highnes"); //add
		v.addElement("PJS");
		// index addding is not possible in vector 
		v.addElement("m");
		v.removeElement("m");
		v.addElement("m");
		v.removeElementAt(2); // this is index removal from vector
		
		
						// remove all elements
		Vector v1 = new Vector();
		
		v1.addElement("k"); //add
		v1.addElement("o");
		// index addding is not possible in vector 
		v1.addElement("m");
		v1.removeElement("m");
		v1.removeAll(v1);
		
		
		
						//retrive 
		v.firstElement(); // to get firstelement
		v.lastElement(); // to get last element
		
		v.capacity(); // capacity ov v obj.
	     
		
		
		
		
	
		System.out.println(v+" "+ v1);
		
		System.out.println(v.elementAt(0)); // for retriving data
		
	}
}
