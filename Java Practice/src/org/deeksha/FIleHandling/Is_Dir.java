package src.org.deeksha.FIleHandling;

import java.io.File;
import java.io.IOException;

public class Is_Dir 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("Highness");
		 System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.isDirectory());
		 System.out.println(f.exists());
		 
		 File g = new File("Highness","Laddduu.txt");
		  System.out.println(g.exists());
		 g.createNewFile();
		System.out.println( g.isDirectory() );
		
		File j = new File("Highness","PJS");
			System.out.println(j.exists());
		 j.mkdir();
		 
		 
		
		File i = new File("PJSS.txt");
		 System.out.println(i.exists());
		i.createNewFile();
		System.out.println(i.isFile());
		
			int count =0;
		String[] s = f.list();
			for(String s1:s)
			{
				count++;
				System.out.println(" ");
				System.out.println(s1);
			}
			System.out.println(count);
			
	}
}
