package src.org.deeksha.Collections.Queue.DeQueue.ArrayDeQueue;
import java.util.*;

public class ArrayDeque_ 
{
	public static void main(String[] args) 
	{
		ArrayDeque ad = new ArrayDeque();
		 
		ad .add("Highness"); // add element in natural way
		ad.offer("PJS");  // add element this is prior to first withot addfirst()
		 
		ad.add("Princess (Tail)"); // add last 
		ad.addFirst("MY SOUL (Head)"); // add first
		ad.addLast("Queen"); 
		
		ad.push("Soulmate");
		
		ad.removeFirst(); // remove 1'st
		ad.removeLast(); // remove last
		
		ad.offerFirst("HighnessPJS");  // element add at  first forcly
		ad.offerLast("PJSLHighness");  // element add at last manually
		
		ad.peekFirst();  // return first element
		ad.peekLast();   // return lastr lement
		
		System.out.println(ad);
	}
}

