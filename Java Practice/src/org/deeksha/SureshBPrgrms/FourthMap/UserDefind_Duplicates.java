package src.org.deeksha.SureshBPrgrms.FourthMap;
import java.security.KeyStore.Entry;
import java.util.*;

import src.org.deeksha.Collections.Student;

public class UserDefind_Duplicates 
{
	public static void main(String[] args) 
	{
		Map<Student,String>  m = new TreeMap<Student,String>();
		
		Student s1 = new Student("PJS", 4);
		Student s2 = new Student("Highness", 6);
		
		m.put(s1, "student1");
		m.put(s2, "student2");
		
		Set s = m.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
