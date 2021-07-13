package src.org.deeksha.FIleHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buffered_Reader 
{
	public static void main(String[] args) throws IOException 
	{
		FileReader p = new FileReader("HighnessQ.txt");
		BufferedReader br = new BufferedReader(p);
		
		String s = br.readLine(); 
		
		while( s != null)
		{
			System.out.println(s);
			s=br.readLine();
		}
	}
}
