package src.org.deeksha.OOPS.Inherit;

public class Hybrid 
{
	int i;
	int j;
	int k;
	
	Hybrid(int i,int j, int k)
	{
		this.i=i;
		this.j=j;
		this.k=k;
		
	}
}
class I extends Hybrid
{
	int l;
	
	I(int i, int j, int k,int l) {
		super(i, j, k);
		this.l=l;
	}
}
class M extends Hybrid
{
int f;
	M(int i, int j, int k, int f) {
		super(i, j, k);
		this.f=f;
}
}
class S extends M
{

	S(int i, int j, int k , int f)
	{
		super(i, j, k , f);
	}
	public static void main(String[] args) {
		S s = new S(10, 20, 30 ,40);
			System.out.println("S i Valiue :"+s.i);
			System.out.println("S j Valiue :"+s.j);
			System.out.println("S k Valiue :"+s.k);
			System.out.println("S f Valiue :"+s.f);
			
			System.out.println("Summation i&f Valiue :"+s.i+s.f);
			
		
		I i = new I(11, 22, 23,33);
		
		System.out.println("I i Valiue :"+i.i);
		System.out.println("I j Valiue :"+i.j);
		System.out.println("I k Valiue :"+i.k);
		System.out.println("I l Valiue :"+i.l);
		
		System.out.println("Multiplication of i&l :"+i.i*i.l);
		
		
		System.out.println("Division of j&i :"+s.j/i.i);
	}
	
}
