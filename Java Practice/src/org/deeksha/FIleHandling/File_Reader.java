package src.org.deeksha.FIleHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader 
{
	public static void main(String[] args) throws IOException 
	{
		FileReader frd = new FileReader("Highness.txt");
		  int i = frd.read();
		  
		  while(i!=-1)
		  {
			  System.out.print( (char) i );
			  	i = frd.read();

		  }
		  
	}
}
