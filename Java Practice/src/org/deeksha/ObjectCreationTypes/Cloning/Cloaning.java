package src.org.deeksha.ObjectCreationTypes.Cloning;

import java.util.jar.Attributes.Name;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import src.org.deeksha.ObjectCreationTypes.Clone.Clone;

public class Cloaning 
{
	static String name;				// Shallow
	private static String address;
	
	public Cloaning()
	{
		this.name = Cloaning.name="Pj";
		this.address = Cloaning.address="Bang";
	}
	public static void main(String[] args) 
	{
		Cloaning cl = new Cloaning();
		
		
		System.out.println(cl.name);
		System.out.println(cl.address);
	}
}
