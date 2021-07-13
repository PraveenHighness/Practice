package src.org.deeksha.SureshBPrgrms;

import java.util.*;

public class HashMapIterator 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> hashmap = new HashMap<Integer,String>();
	
		hashmap.put(1, "IT Professionals");
		hashmap.put(2, "Vj");
		hashmap.put(3, "Suresh");
		hashmap.put(4, "Tech-Studens");
		
		Set set = hashmap.entrySet();
		
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry mapentry =(Map.Entry)iterator.next();
			
			System.out.println(mapentry);
		}
		
//		SortedSet set1 = (SortedSet) hashmap.entrySet();
//	
//		Iterator iterator1 = entrySet.iterator();
//		
//		System.out.println("Hashmap iterator k+v = ");
//		
//		while(iterator1.hasNext())
//		{
//			Map.Entry mapentry =(Map.Entry)iterator1.next();
//			System.out.println("Key :"+ mapentry.getKey()+ "Value:"+mapentry.getValue());
	}
}
