package src.org.deeksha.Collections.List.Vector.Stack;

public class StackR 
{
	public static void main(String[] args) 
	{
		Stack s =  new Stack();     // LAst In FirstOut ( LIFO )
		
		s.push(15); //1    so 4  (bottom)
		s.push(10); // 2   so 3
		s.push(21);  // 3  so 2
		s.push(04);  // 4  so 1  (top)     // Add an object
		
		
		System.out.println(s.peek());  // to return the top value witout remoivng it (pick/FirstOut)
		System.out.println(s.pop());  // to rmove the Last element  (LastIN)
		s.show();
		 
		 
	}	
}
