package src.org.deeksha.Collections;
import java.lang.reflect.Array;
import java.util.*;

public class ObjArryForm_Array_and_Array2_Obj 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		 
		 al.add(10);
		 al.add(20);
		 al.add(30);
		 al.add(40);
		 al.add(50);
		 al.add(60);

		 System.out.println(al);// Array Form 
		 Integer a[] = new Integer[al.size()];
		 al.toArray(a); // it conver anything to array form
		 
		  for(int i=0; i<a.length;i++)
		  {
			  System.out.print(a[i]+" ");
			  
		  }
		  System.out.println(" ");
		
		  Integer []a2 = {100,200,300,400,500};  //NOrmal Array changing
		  
		  for(int j=0; j<a2.length;j++)
		  {
		    System.out.print(a2[j]+" ");
		  }
		  System.out.println(" ");
		  
		 List<Integer> li = Arrays.asList(a2); // to array formation with "aslist"
		 
		 System.out.println(li);  
		}
}
