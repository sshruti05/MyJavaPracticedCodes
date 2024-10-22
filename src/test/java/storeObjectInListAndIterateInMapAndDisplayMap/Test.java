package storeObjectInListAndIterateInMapAndDisplayMap;

import java.util.ArrayList;

class Person_1{
	String name;
	int age;
	Person_1(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+":"+age;
	}
}
public class Test {

	public static void main(String[] args) {
		ArrayList<Person_1> l = new ArrayList<>();
		l.add(new Person_1("Priyanka", 21));
		l.add(new Person_1("Seema", 50));
		l.add(new Person_1("Sneha", 20));
		System.out.println(l);
	}

}
