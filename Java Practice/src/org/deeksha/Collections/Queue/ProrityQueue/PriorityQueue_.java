package src.org.deeksha.Collections.Queue.ProrityQueue;
import java.util.*;

public class PriorityQueue_
{
	public static void main(String[] args) 
	{
		PriorityQueue pq = new PriorityQueue();
		
		System.out.println(pq.peek()); // there is no data it return " Null "
		
		//System.out.println(pq.element()); // R.E (Rintime Error ) as no such element exception
		
		for (int i = 0; i<=10 ; i++)
		{
			pq.offer(i);
		}
		System.out.println(pq);
		System.out.println(pq.poll()); // remove head elemnt & if queue is empty it return null
		System.out.println(pq.peek()); // retirn top element
		System.out.println(pq.remove(2)); //remove actuaally top & here particula data & if queue is empty it return R.E(runtime error) as no such element in queue
		System.out.println(pq);
	}
}
