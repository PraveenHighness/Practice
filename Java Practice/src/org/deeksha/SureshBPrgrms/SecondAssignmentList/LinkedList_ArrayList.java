package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;
import java.util.*;

public class LinkedList_ArrayList 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> ll = new LinkedList<>();
			ll.add(6);
			ll.add(4);
			
		ArrayList<Integer> al = new ArrayList<>(ll);
			for( Integer o : al)
			{
				System.out.println(o);
			}
		
		
	}
}
