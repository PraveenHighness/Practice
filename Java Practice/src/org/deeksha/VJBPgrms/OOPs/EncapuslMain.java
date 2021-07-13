package src.org.deeksha.VJBPgrms.OOPs;

public class EncapuslMain
{
	public static void main(String[] args) 
	{
		Encapsulation e = new Encapsulation();
		e.setI(69);
		e.setS("Highness");
		e.setId(645);
		
		System.out.println(e.getI());
		System.out.println(e.getS());
		System.out.println(e.getId());
		
	}
}
