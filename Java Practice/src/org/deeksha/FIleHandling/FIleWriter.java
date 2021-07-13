package src.org.deeksha.FIleHandling;


import java.io.FileWriter;
import java.io.IOException;

public class FIleWriter 
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter fr = new FileWriter("Highness1.txt");
		
		 fr.write(76);
		 fr.write("adduu");
		 fr.write("\n");

		 char [] ch = {'P','J','S'};
		 fr.write(ch);
		 fr.write("\n");
		 fr.flush();
		 
		 char [] ch1 = {'o','w','w'};
		 fr.write(ch1);
		 fr.write("\n");
		 fr.flush();
		 
		 System.out.println("H");
		 
		 
		 
	}
}
