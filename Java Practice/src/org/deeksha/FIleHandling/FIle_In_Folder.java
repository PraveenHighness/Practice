package src.org.deeksha.FIleHandling;

import java.io.File;
import java.io.IOException;

public class FIle_In_Folder 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("Highness");
		 System.out.println(f.exists());
		f.mkdir();
		 System.out.println(f.exists());
		 
		 File g = new File("Highness","Laddduu");
		  System.out.println(g.exists());
		 g.mkdir();
		 
		 File h = new File("Laddduu","PJS.txt");
		  System.out.println(h.exists());
		  h.createNewFile();
		  
		
	}
}
