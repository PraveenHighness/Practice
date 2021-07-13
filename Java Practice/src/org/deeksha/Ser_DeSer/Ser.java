package src.org.deeksha.Ser_DeSer;

import java.io.*;

public class Ser 
{
	Ser()
	{
		System.out.println("p");
	}
}
	class CardSer extends Ser implements Serializable
		{
			CardSer()
			{
				System.out.println("c");
			}
		
	public static void main(String[] args)
	{
		CardSer cc = new CardSer();
		try
		{
			FileOutputStream fos = new FileOutputStream("Play.txt");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(cc);
			os.close();
			
			FileInputStream fis = new FileInputStream("Play.txt");
			ObjectInputStream is = new ObjectInputStream(fis);
			CardSer cc1 = (CardSer)is.readObject();
			is.close();
		}
		catch(Exception e) 
		{
			
		}
		}
	}