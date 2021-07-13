package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.util.*;

public class Replace_HashMap 
{
	public static void main(String[] args)
	{
Map<Integer,String>  m = new LinkedHashMap<>();
		
		m.put(4, " PJS");
		m.put(6, " Highness");
		m.put(494, "o");
		
		m.replace(494, "HIGHNESS");
		System.out.println(m);
	}
}
