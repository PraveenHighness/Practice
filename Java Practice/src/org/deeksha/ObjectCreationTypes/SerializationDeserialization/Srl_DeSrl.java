package src.org.deeksha.ObjectCreationTypes.SerializationDeserialization;
import java.io.*;

public class Srl_DeSrl implements Serializable
{
	 
	public int s;
	public String p ;
	
	public Srl_DeSrl(int i, String string) 
	{
		
	}

	public void Start(int s,String p)
	{
		this.p=p;
		this.s=s;
	}
}
 	class Deserial
 	{
 		public static void main(String[] args)
 		{
 			Srl_DeSrl obj = new Srl_DeSrl(6,"Highness");
 			String filename = "Srl_DeSrl.ser";
 			try
 			{
 				FileOutputStream file = new FileOutputStream(filename);
 				ObjectOutputStream out = new ObjectOutputStream(file);
 				out.defaultWriteObject();
 				out.close();
 				file.close();
 				
 				System.out.println("Srl_DeSrl serialized");
 			}
 			catch(Exception e)
 			{
 				e.printStackTrace();
 			}
 			try
 			{
 				FileInputStream file = new FileInputStream(filename);
 				ObjectInputStream is = new ObjectInputStream(file);
 				obj = (Srl_DeSrl)is.readObject();
 				is.close();
 				file.close();
 				
 				System.out.println("Obj Deserialized");
 				System.out.println(" ");
 				System.out.println("Number =" + obj.s);
 				System.out.println("String =" + obj.p);
 				
 			}
 			catch(Exception e)
 			{
 				System.out.println("IO Exception Caught ");
 			}
 				
 		}
 	}
 	


