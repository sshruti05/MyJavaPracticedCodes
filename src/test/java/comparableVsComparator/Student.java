package comparableVsComparator;

public class Student implements Comparable<Student> {

	int rollNo;
	String name;
	int age;
	Student(int rollNo, String name, int age){
		this.rollNo = rollNo;
		this.name = name; 
		this.age = age; 
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if(age == s.age)
			return 0;
		else if(age > s.age)
			return +1;
		else
			return -1;
	}
	
}
