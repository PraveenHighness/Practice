package src.org.deeksha.Collections.Queue;
import java.util.*;

public class Queue 
{
	public static void main(String[] args) 
	{
		PriorityQueue q = new PriorityQueue();  ///Queue q = new Queue(); is not work bcz Queue in mian interface, for main interrface we can't creater an Object 
		
		q.offer("Highness");  // to add an element 
		q.offer("PJS");
		q.offer("gap");
		q.remove("gap");  // it retun R.E (ther is no element in Queue)if there is no elements in the Queue
		q.poll();  // it return null if elment is not in Queue 
		q.peek(); // it return top of element in Queue  & it retunrn null if there is no element in Queue
		q.element(); //  it return top of the element in Queue & it return R.E(saying there is no such type elemntsd in Queue)

		PriorityQueue q1 = new PriorityQueue();
		
		q1.offer(1); //ADD
		q1.remove(); // remove element
		
		
		System.out.println(q1.poll()); // there is no element with this it returns null
		System.out.println(q1.peek()); //return top of element && Rertruns ' null ' there is no element & elemnt place_then remove it returns R.E 
		
		System.out.println(q1.remove());// R.E if there is no elemnt
		System.out.println(q1.element()); //R.E if there is no elements ,if it there give th top of element
		
		System.out.println(q);
		System.out.println(" ");
		System.out.println(q1);
		
	}
}
