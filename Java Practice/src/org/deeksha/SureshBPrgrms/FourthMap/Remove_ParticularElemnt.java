package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.util.*;

public class Remove_ParticularElemnt 
{
	public static void main(String[] args) 
	{
		Map<Integer,String>  m = new LinkedHashMap<>();
		
		m.put(4, " PJS");
		m.put(6, " Highness");
		m.put(0, "o");
		
		System.out.println(m.remove(0, "o"));
		System.out.println(m);
	}
}
