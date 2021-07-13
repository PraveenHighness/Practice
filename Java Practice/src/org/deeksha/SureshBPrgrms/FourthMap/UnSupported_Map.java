package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.util.*;

public class UnSupported_Map
{
	public static void main(String[] args) 
	{
		Map  m = new HashMap();
		
		m.put(4, " PJS");
		m.put(6, " Highness");
		
		Map mm = Collections.unmodifiableMap(m);
		
		mm.put(0, "o");
		System.out.println(mm);
	}
}
