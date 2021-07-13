package src.org.deeksha.Operator;

public class Logical {
public static void main(String[] args) {
	int a=2;
	int b=0;
	int c=8;
	
 if ((a>b) || (a>c))
 {
	 System.out.println("A Bigger");
 }
 else if((b<a) && (b<c))
 {
	 System.out.println("B Smaller");
 }
 else {
	 System.out.println("C is Smaller Than A  & Biggerthan B ");
 }
 
}
}
