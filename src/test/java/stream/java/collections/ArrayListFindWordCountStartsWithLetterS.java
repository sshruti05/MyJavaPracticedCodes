package stream.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayListFindWordCountStartsWithLetterS {
	@Test
	public void testWithoutStream() {
		ArrayList<String> al = new ArrayList<>();
		al.add("Shruti");
		al.add("Priyanka");
		al.add("sneha");
		al.add("Sonu");
		al.add("Shinu");
		al.add("Seema");
		al.add("Amar");
		int count = 0;
		for(int i=0; i<al.size() ; i++) {
			String word = al.get(i).toLowerCase();
			if(word.startsWith("s")) {
				count++;
			}
			
		}
		System.out.println(count);
		
	}
	@Test																																																																						
	public void testWithStream() {
		ArrayList<String> al = new ArrayList<>();
		al.add("Shruti");
		al.add("Priyanka");
		al.add("sneha");
		al.add("Sonu");
		al.add("Shinu");
		al.add("Seema");
		al.add("Amar");
		
//		long count = al.stream().filter(s -> s.toLowerCase().startsWith("s")).count();
//		System.out.println(count);
//		We can also create streams without creating collections, array or any other data 
		
//		long c = Stream.of("Shruti", "Priyanka","sneha", "Sonu", "Shinu", "Seema", "Amar").
//		filter(s-> s.toLowerCase().startsWith("s")).count();
//		System.out.println(c);
//
//		Stream.of("Shruti", "Priyanka","sneha", "Sonu", "Shinu", "Seema", "Amar").
//		filter(s-> s.length()>4).forEach(System.out::println);
		
		Stream.of("Shruti", "Priyanka","sneha", "Sonu", "Shinu", "Seema", "Amar").
		filter(s-> s.endsWith("a")).map(s-> s.toUpperCase()).forEach(System.out::println);	
	}
	
	@Test																																																																						
	public void arraysToListAndStream() {
		List<String> l = Arrays.asList("Seema", "Neha", "Dhruti", "Priyanka", "ANJaiswal");
		l.stream().sorted().map(s->s.toUpperCase()).forEach(System.out::println);
	}
	@Test
	public void concatStream() {
		Stream<String> name1 = Stream.of("Seema", "Neha", "Dhruti", "Priyanka", "ANJaiswal");
		Stream<String> name2 = Stream.of("Soniya", "Sneha", "Shruti", "Priya", "Jaiswal");
		
		Stream<String> newStream = Stream.concat(name1, name2);
		boolean flag = newStream.anyMatch(s->s.contains("Pri"));
		Assert.assertTrue(flag);
	}
	@Test
	public void streamToList() {
		Stream<String> name1 = Stream.of("Seema", "Neha", "Dhruti", "Priyanka", "ANJaiswal");
		List<String> list = name1.collect(Collectors.toList());
		System.out.println(list);
	}
}
