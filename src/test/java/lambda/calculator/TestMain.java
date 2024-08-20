package lambda.calculator;

public class TestMain {
	public static void main(String[] args) {
		MathOperation add = (a,b) -> a+b;
		MathOperation sub = (a,b) -> a-b;
		MathOperation mul = (a,b) -> a*b;
		MathOperation div = (a,b) -> a/b;

		System.out.println(calculate(add));
		System.out.println(calculate(sub));
		System.out.println(calculate(mul));
		System.out.println(calculate(div));
		
		int onScreenNumber = 0;
		
		onScreenNumber = calculate2(5, add, 2);
		onScreenNumber = calculate2(onScreenNumber, sub, 3);
		onScreenNumber = calculate2(onScreenNumber, mul, 7);
		onScreenNumber = calculate2(onScreenNumber, add, 2);
		onScreenNumber = calculate2(onScreenNumber, div, 3);
		
		System.out.println(onScreenNumber);
	}
	private static int calculate(MathOperation mathOperation) {
		int a = 10;
		int b = 20;
		return mathOperation.operate(a, b);	
	}
	private static int calculate2(int onScreenNumber, MathOperation mathOperation, int enteredNumber) {
		return mathOperation.operate(onScreenNumber, enteredNumber);	
	}

}
