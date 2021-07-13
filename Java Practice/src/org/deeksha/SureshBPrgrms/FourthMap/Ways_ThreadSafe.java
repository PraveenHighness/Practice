package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Ways_ThreadSafe 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m = new HashMap<>();
		m.put(4, " PJS");
		m.put(6, " HighnesS");
		
		System.out.println(m);
		
		Map<Integer, String> mm = Collections.synchronizedMap(m);  // i'st way
		System.out.println("First way :"+ " "+mm);
		
		Map<Integer,String> m1 = new ConcurrentHashMap<Integer,String>(m); 
		
		System.out.println("Second Way : "+ " "+ m1);
		
	}
}
