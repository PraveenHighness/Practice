package src.org.deeksha.SureshBPrgrms.ThirdSet;
import java.util.*;

public class ThreadSafe_Methods 
{
	public static void main(String[] args) 
	{
		Set s = new HashSet();
		s.add(4);
		s.add(6);
		
		Collections.synchronizedSet(s); //1 
		Collections.unmodifiableSet(s); //2
										// 3 fields as private
										//4 ConcurrentMap
										//volatile 
	}
}
