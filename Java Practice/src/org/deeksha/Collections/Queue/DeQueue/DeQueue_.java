package src.org.deeksha.Collections.Queue.DeQueue;
import java.util.*;

public class DeQueue_ 
{
	public static void main(String[] args) 
	{
		Deque<String> dq = new LinkedList<String>(); // Deque is interface  os we can't creAate obj. so we can create with impleented  one
		
		dq .add("Highness"); // add element in natural way
		dq.offer("PJS");  // add element this is prior to first withot addfirst()
		 
		dq.add("Princess (Tail)"); // add last 
		dq.addFirst("MY SOUL (Head)"); // add first
		dq.addLast("Queen"); 
		
		dq.push("Soulmate");
		
		dq.removeFirst(); // remove 1'st
		dq.removeLast(); // remove last
		
		dq.offerFirst("HighnessPJS");  // element add at  first forcly
		dq.offerLast("PJSLHighness");  // element add at last manually
		
		System.out.println(dq);
	}
}
