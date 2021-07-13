package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.util.*;

public class ReadOnly_Map 
{
	public static void main(String[] args) 
	{
		Map<Integer,String>  m = new LinkedHashMap<>();
		
		m.put(4, " PJS");
		m.put(6, " Highness");
		
		Map<Integer,String> mm = Collections.unmodifiableMap(m);    // readOnly
		System.out.println(mm);
		//mm.put(0, "o");
		
	}
}
