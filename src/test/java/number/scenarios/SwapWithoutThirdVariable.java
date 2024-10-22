package number.scenarios;

public class SwapWithoutThirdVariable {
	public static void main(String[] args) {
//		Method1: 
		int a = 10, b = 20;		
		a = (a*b)/ (b=a);  	
		System.out.println(a+" "+b);
	}

}
