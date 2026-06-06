package logicbuilding;

import java.util.Scanner;

public class _3EvenOrOdd {

	public static void main(String[] args) {
//		Method1: With mathematical operation
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num+" is Even.");
		}
		else {
			System.out.println(num+" is Odd.");
		}

//        Method2: WithOUT Mathematical operators. (using Bitwise)

        if((num & 1) == 1){
            System.out.println(num+" is ODD");
        }else{
            System.out.println(num+" is EVEN");
        }
	}
}
