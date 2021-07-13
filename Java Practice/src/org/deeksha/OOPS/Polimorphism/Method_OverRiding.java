package src.org.deeksha.OOPS.Polimorphism;

class Method_OverRiding {
	void m1()
	{
		System.out.println("Hi");
	}
	static class S extends Method_OverRiding
	{
	void m1()
	{
			System.out.println("Laddduduu Palu Thagaledho--------konni ayina thagesi vellu Ladddduu");	
	}
			public static void main(String[] args) {
				S s = new S();
				s.m1();
			}
		}
	}



