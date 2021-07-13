package src.org.deeksha.OOPS.Polimorphism;

public class Method_OverLoading {
	 int i;
	 char c;
	 boolean b;
	 
	 

	void m1(int i)
	{
		this.i =i;
		System.out.println("Arguments :"+i);
	}
	
	void m1(char c,boolean b)
	{
		this.c =c;
		this.b =b;
		System.out.println(b);
	}
	public static void main(String[] args) {
		Method_OverLoading m = new Method_OverLoading();
		m.m1('L', true);
		
		
		Method_OverLoading mm = new Method_OverLoading();
		mm.m1(6);
		System.out.println(mm.c);
		
		System.out.println("Ladduuuu careful ");
	}
}
