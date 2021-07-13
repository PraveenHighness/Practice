package src.org.deeksha.FIleHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Methods 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("LL.txt");
		 System.out.println(f.exists());
		f.createNewFile();
		 System.out.println(f.exists());
		
		 FileWriter fw = new FileWriter("LL.txt"); 
		
		fw.write(76); // write(inch)
		
		char [] ch1 = {'a'};
		fw.write(ch1);
		
		char [] ch = {'a','b','c'};
		fw.write(ch);
		fw.write("\n"); // write (char [] ah)----character
		fw.flush();
		
		String s = ("Highness");
		fw.write(s);  //Write String 
		fw.flush();  // send all data to given file throuh flush
		
		fw.append('a');
		
		fw.append(s);
		
		fw.append(s, 6, 7);
	}
}
