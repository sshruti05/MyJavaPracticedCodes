package java8.functionalInterface;


interface FunctionalInterface1{
	int operation(int a, int b);
	
}
public class FunctionalInterface1Test {
	public static void main(String[] args) {
		
		FunctionalInterface1 add = ((x, y) -> x+y);
		FunctionalInterface1 mul = ((x, y) -> x*y);
		
		System.out.println(add.operation(2, 3));
		System.out.println(mul.operation(4, 5));
	}
}
