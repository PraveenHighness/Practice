package src.org.deeksha.Collections;
import java.util.*;
import src.org.deeksha.Strings.Split;

public class Spliterator
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add(22);
		al.add(10);
		al.add(9);
		al.add(1);
		al.add(99);
		al.add(81);
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}// 1
		System.out.println(" ");
		System.out.println(" ");
		Iterator itr1 = al.iterator();
		itr1.forEachRemaining( (p)-> {System.out.print(p+" ");}); //2 
		
		java.util.Spliterator sp = al.spliterator();
		System.out.println(" ");
		sp.forEachRemaining ( (q)-> {System.out.print(q+ " ");} ); // 3
		
	}
}
