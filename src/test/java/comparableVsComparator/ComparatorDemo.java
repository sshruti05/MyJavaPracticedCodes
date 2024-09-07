package comparableVsComparator;

import java.util.TreeSet;

public class ComparatorDemo {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet(new MySorting());
		ts.add(123);
		ts.add(43);
		ts.add(123);
		ts.add(10);
		ts.add(234);
		ts.add(12);
		System.out.println(ts);
	}
}
