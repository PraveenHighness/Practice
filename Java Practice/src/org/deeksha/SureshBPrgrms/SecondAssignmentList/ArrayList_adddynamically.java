package src.org.deeksha.SureshBPrgrms.SecondAssignmentList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_adddynamically 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Input size");
		int size = scanner.nextInt();
		
		ArrayList<Integer> al = new ArrayList(size);
		System.out.println("Enter Element :");
		
		for(int i =0;i<size; i++ )
		{
			int element = scanner.nextInt();
			al.add(element);
		}
		al.add(98);
		System.out.println("ArrayList elements");
		
		for(int i =0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
	}
}
