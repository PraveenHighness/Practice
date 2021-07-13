package src.org.deeksha.FIleHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_Writer
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter f = new FileWriter("HighnessP.txt");
		PrintWriter pw = new PrintWriter(f);
		
		pw.write(76);
		pw.write("adduu");
		pw.write("\n");
		
		char ch [] = {'m','a','w'};
		pw.write(ch);
		pw.write("\n");
		pw.flush();
		
	}
}
