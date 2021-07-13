package src.org.deeksha.Collections.List.ArrayList;
import java.io.Serializable;
import java.util.*;

public class Arraylist_linkedlist 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		
		System.out.println(al instanceof Serializable); 
		System.out.println(ll instanceof Cloneable);
		System.out.println(al instanceof RandomAccess);
		System.out.println(ll instanceof RandomAccess);
		
		// All classes implemented serializable & cloneable 
		// but
		// ArrayList & Vector only implements RandomAccess
		
		
		
		// ArrayList is the worst choice for sorting and deleting because if you insert one value in middle of index in that case total index number is moving to forword upto end of index box if it is too long like lakh,crore it will take too much time for several shift operations ...as well as for deleting also.......thats why this Arraylist is worst to sorting,adding & deleting 
		    
	}
}
