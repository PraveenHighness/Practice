package src.org.deeksha.VJBPgrms.OOPs;

public class Aggregation_HasARelation 
{
	int streetNo;
	String city;
	String state;
	String country;
	
	Aggregation_HasARelation(int street,String c,String st,String cuntr)
	{
		this.streetNo = street;
		this.city = c;
		this.state = st;
		this.country = cuntr;
		
	}
}
class emply
{
	int id;
	String name;
	Aggregation_HasARelation emplyadd;
	 
	emply(int i,String n,Aggregation_HasARelation add)
	{
		this.id=i;
		this.name=n;
		this.emplyadd=add;
		
	}
	public static void main(String[] args) 
	{
		
	
	Aggregation_HasARelation ad = new Aggregation_HasARelation(1,"Tom","Pencila","US");
	emply e = new emply(2,"PS",ad);
	
	System.out.println(e.id);
	System.out.println(e.name);
	System.out.println(e.emplyadd.city);
	System.out.println(e.emplyadd.country);
	System.out.println(e.emplyadd.state);
	System.out.println(e.emplyadd.streetNo);
	
	
	}
}
