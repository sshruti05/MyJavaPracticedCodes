package java8.lambdaExpression;

interface PrintClass{
	void print();
}

public class LambdaWithNoParameter {
	
	public static void fun(PrintClass p) {
		p.print();
	}
	
	public static void main(String[] args) {
		fun(()-> System.out.println("Hello Sneha"));
		
	}
}
