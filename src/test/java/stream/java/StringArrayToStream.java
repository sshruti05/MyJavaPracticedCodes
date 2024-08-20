package stream.java;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringArrayToStream {
	public static void main(String[] args) {
		String[] s = {"sneha", "shruti", "jaiswal"};
//		Stream<String> stream = Arrays.stream(s);
//		stream.forEach(str->System.out.print(str+" ")); //sneha shruti jaiswal 
		Arrays.stream(s).forEach(System.out::print);
	}

}
