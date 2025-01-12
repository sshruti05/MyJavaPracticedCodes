package number.scenarios;

public class SwapTwoNumbers {
	public static void main(String[] args) {
//		Method1: 
		int a = 10, b = 20;		
		a = (a*b)/ (b=a);  	
		System.out.println(a+" "+b);

//		Method2:
		int a1 = 30, b1 = 40;
		int temp;
		temp = a1;
		a1 = b1;
		b1 = temp;
		System.out.println(a1+" "+b1);

//		Method3:
		int a2 = 50, b2 = 60;
		a2 = a2+b2;
		b2 = a2-b2;
		a2 = a2-b2;
		System.out.println(a2+" "+b2);

//		Method4:
		int x = 10, y = 20;
		x = x^y;
		y = x^y;
		x = x^y;
		System.out.println(x+" "+y);
	}
}
