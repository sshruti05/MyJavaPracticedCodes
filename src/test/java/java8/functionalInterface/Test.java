package java8.functionalInterface;

interface FunctionalInterface{
	//abstract method
	void abstractFun(int x);
	
	default void normalFun() {
		 System.out.println("Hello");
	}
}

public class Test {

	public static void main(String[] args) {
		
		FunctionalInterface fObj = (int x) -> System.out.println(x*2);
		
		fObj.abstractFun(2);
		
	

	}

}
