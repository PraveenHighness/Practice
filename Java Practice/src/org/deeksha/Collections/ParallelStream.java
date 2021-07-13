package src.org.deeksha.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream 
{
	public static void main(String[] args) 
	{
		List<Student> List = new ArrayList<>();
		
		 List.add(new Student("Shav", 25));
		 List.add(new Student("mano", 26));
		 List.add(new Student("vij", 23));
		 List.add(new Student("sure", 38));
		 List.add(new Student("jyot", 29));
		 List.add(new Student("Pj", 27));
		 
		Stream<Student> parallelstream = List.parallelStream();
		
		System.out.println("Student data : ");
		
		parallelstream.forEach(i->doProcess(i));

	}

	private static void doProcess(Student i) {
		System.out.println(i);
	}
}
