package src.org.deeksha.Collections;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Stream_ParallelStream 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l = new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(33);
		l.add(40);
		l.add(55);
		l.add(69);

		System.out.println(l);
		List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(l2);
		
		
		Stream<Integer> iterate = Stream.iterate(0, i->i+2);
		List<Integer> collect = iterate.limit(20).collect(Collectors.toList());
 		collect.forEach(System.out::println);
		
		
	}
}
