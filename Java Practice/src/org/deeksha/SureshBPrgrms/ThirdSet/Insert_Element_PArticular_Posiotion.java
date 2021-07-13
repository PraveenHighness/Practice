package src.org.deeksha.SureshBPrgrms.ThirdSet;
import java.util.*;

public class Insert_Element_PArticular_Posiotion 
{
	public static void main(String[] args) 
	{
		List<Integer> l = new ArrayList<Integer>();
		l.add(6);
		l.add(9);
		l.add(98);
		l.add(4);
		l.add(1);
		l.add(94);
		
		l.add(2, 1998);
		l.add(5, 1994);
		
		
	
		
		System.out.println(l.indexOf(98));
		
		System.out.println(l);
		
		Set<Integer> l1 = new HashSet<Integer>();
		l1.add(6);
		l1.add(9);
		l1.add(98);
		l1.add(4);
		l1.add(1);
		l1.add(94);
		
		// PArticula index postion add is not possible in Set(I)
		
		
	}
}
