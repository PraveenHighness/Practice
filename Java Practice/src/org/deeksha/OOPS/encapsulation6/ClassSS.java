package src.org.deeksha.OOPS.encapsulation6;

import src.org.deeksha.OOPS.encapsulation3.ClassS;

public class ClassSS {
	public static void main(String[] args) {
		ClassS c1 = new ClassS();
		
		System.out.println(c1.a);
		System.out.println(ClassS.s);
		
		ClassS c2 = new ClassS();
		System.out.println(c2.b);
		System.out.println(ClassS.p);
		
		ClassS c3 = new ClassS();
		System.out.println(c3.p);
		System.out.println(ClassS.p);
		
	
		
		
	}

}
