package src.org.deeksha.FIleHandling;

import java.io.File;
import java.io.IOException;

public class FolderCreation 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("Laddduuuu");
		 System.out.println(f.exists());
		f.mkdir();
		 System.out.println(f.exists());
	}
}
