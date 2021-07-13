package src.org.deeksha.FIleHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.concurrent.ExecutionException;

public class Buffer_Writer 
{
	public static void main(String[] args) throws Exception
	{

		FileWriter fr = new FileWriter("HighnessQ.txt");
		BufferedWriter br1 = new BufferedWriter(fr);
		
		
		 br1.write(76);
		 br1.write("adduu");
		 br1.write("\n");

		 char [] ch = {'P','J','S'};
		 br1.write(ch);
		 br1.write("\n");
		 br1.flush();
		 
		 char [] ch1 = {'m','x','e'};
		 br1.write(ch1);
		 br1.write("\n");
		 br1.flush();
		 
	}
}
