package comparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestSortStudent {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(101, "Sneha", 32));
		al.add(new Student(102, "Shruti", 34));
		al.add(new Student(103, "Pri", 31));
		
		Collections.sort(al, Collections.reverseOrder());
		for(Student s:al)
			System.out.println(s.rollNo+" "+s.name+" "+s.age);

	}
}
	
