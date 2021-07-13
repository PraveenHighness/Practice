package src.org.deeksha.Collections.Queue.ProrityQueue;
import java.util.*;

public class ProrityQueue_5Costructo_Types 
{
	public static void main(String[] args, Comparator comparator) 
	{
		PriorityQueue q = new PriorityQueue (15); // 2'nd constructor
		q.offer(1);
		q.offer(9);
		q.offer(2);
		q.offer(4);
		
		System.out.println(q);
		
		PriorityQueue q1 = new PriorityQueue(15,comparator);
		
		q1.offer("A");
		q1.offer("N");
		q1.offer("C");
		q1.offer("D");
		
		System.out.println(q1);
		
		
		// PriorityQueue q2 = new PriorityQueue(SortedSet<q2>); // 3'rd constructor        //Sorted Conversion
		
		//PriorityQueue q1 = new PriorityQueue(comparator); // 4;th
		//PriorityQueue q1 = new PriorityQueue(Collection<c>); 				// interConversion of any to any
		
	}
}
