package src.org.deeksha.OOPS.Inherit;

public class Hirarchi 
{
	int i ;
	int j ;
	
	Hirarchi(int i,int j)
	{
		this.i=i;
		this.j=j;
		
	}
}
class Z extends Hirarchi
{
	int z ;
Z(int i,int j,int z)

{
	super(i,j);
	this.z=z;
}
}
class U extends Hirarchi
{
	U(int i, int j) {
		super(i, j);
		
	}
	
}
class V

{
public static void main(String[] args) {
	U u = new U(10,20);
	System.out.println(u.i+u.j);
	
	Z z = new Z(1,2,3);
	System.out.println(z.i*z.j*z.z);
	
}	
}