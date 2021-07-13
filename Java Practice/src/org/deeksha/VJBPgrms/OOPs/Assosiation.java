package src.org.deeksha.VJBPgrms.OOPs;

class Car
{
	String carname;
	int carid;
	Car(String name,int id)
	{
		this.carname = name;
		this.carid = id;
	}
}
class Driver extends Car
{
	String Drvrname;
	Driver(String name,String cname,int cid)
	{
		super(cname,cid);
		this.Drvrname = name;
	}
}


public class Assosiation 
{
	public static void main(String[] args) 
	{
		Driver d =new Driver("PS", "Bently", 1469);
		System.out.println(  d.Drvrname+d.carid);
	}
}
