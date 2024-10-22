package java8.lambdaExpression;

import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(8);
		
		al.forEach(a-> System.out.println(a));
		System.out.println("Below are even numbers");
		al.forEach(a ->{
			if(a%2 ==0) 
				System.out.println(a);
		}
		);
		
	}

}
