package src.org.deeksha.FIleHandling;

import java.io.File;
import java.io.IOException;

public class FIleCreation 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("Laddduu1.txt");
		 System.out.println(f.exists());
		f.createNewFile();
		 System.out.println(f.exists());
	}
}
	