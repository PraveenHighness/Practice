package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;
import java.util.*;

public class Remiove_PArticularIndexElement 
{
	public static void main(String[] args) 
	{
		List<Integer> l = new ArrayList<>();
			l.add(6);
			l.add(9);
			l.add(4);
			l.add(1);
			l.add(0);
			
			l.remove(4);
			
			for( Integer i : l)
			{
			System.out.println(i  );
			}
	}
}
