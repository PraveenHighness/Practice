package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.util.*;

public class MapInteface 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m = new HashMap<>();
		
		m.put(4," PJS");
		m.put(6," Highness");
		
		System.out.println(" HashMap key,values");
		for(Map.Entry m1 : m.entrySet())
		{
			System.out.println(m1.getKey()+""+m1.getValue());
		}
		
		
	}
}
	