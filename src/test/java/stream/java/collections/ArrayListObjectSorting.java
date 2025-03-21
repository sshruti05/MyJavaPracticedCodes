package stream.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person{
	String name; 
	int age; 
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+" : "+age; 
	}
}

public class ArrayListObjectSorting {
	public static void main(String[] args) {
		
		List<Person> l = new ArrayList<>();
		l.add(new Person("Seema", 50));
		l.add(new Person("Pri", 32));
		l.add(new Person("Sneha", 31));
		l.add(new Person("Dad", 52));
		
		Collections.sort(l, (e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(l);
		
		Collections.sort(l, (e1, e2)-> (e1.age<e2.age)? 1: (e1.age>e2.age)?-1:0);
		System.out.println(l);

		Collections.sort(l, (e1, e2)-> (e1.age<e2.age)? -1: (e1.age>e2.age)?1:0);
		System.out.println(l);
	}
}
